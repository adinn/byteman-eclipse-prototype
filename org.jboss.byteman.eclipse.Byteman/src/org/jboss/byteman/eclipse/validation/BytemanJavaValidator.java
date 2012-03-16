/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat and individual contributors as identified
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 * 
 * @authors Rebecca Simmonds, Andrew Dinn
 */
package org.jboss.byteman.eclipse.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jdt.core.search.TypeNameRequestor;

import org.jboss.byteman.eclipse.byteman.AccessExpr;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.Actions;
import org.jboss.byteman.eclipse.byteman.ActionList;
import org.jboss.byteman.eclipse.byteman.Action;
import org.jboss.byteman.eclipse.byteman.BytemanRule;
import org.jboss.byteman.eclipse.byteman.EventClass;
import org.jboss.byteman.eclipse.byteman.EventMethod;
import org.jboss.byteman.eclipse.byteman.Expression;
import org.jboss.byteman.eclipse.byteman.AssignmentExpr;
import org.jboss.byteman.eclipse.byteman.IndexedSpecialVar;
import org.jboss.byteman.eclipse.byteman.ParameterTypes;
import org.jboss.byteman.eclipse.byteman.SimpleName;
import org.jboss.byteman.eclipse.byteman.SpecialVar;
import org.jboss.byteman.eclipse.byteman.Binding;
 

public class BytemanJavaValidator extends AbstractBytemanJavaValidator {

/**
 * quick check rule to ensure that return or throw actions only occur at
 * the end of the action list
 * @param actions the parse tree element representing DO  clause
 */
	@Check
	public void checkThrowReturnActionAtEnd(Actions actions)
	{
		ActionList actionList = actions.getActionList();
		if (actionList != null) {
			EList<Action> children = actionList.getActions();
			int length = children.size();
			for (int i = 0; i <length - 1; i++) {
				Action action = children.get(i);
				if (action instanceof Expression) {
					Expression expression = (Expression) action;
					String op = expression.getOp();
					if (op != null) {
						if (op.equals("return") ||
								op.equals("RETURN")) {
							error("RETURN expression must be last in DO actions", BytemanPackage.eINSTANCE.getActions_ActionList(), i);
						} else if (op.equals("throw") ||
								op.equals("THROW")) {
							error("THROW expression must be last in DO actions", BytemanPackage.eINSTANCE.getActions_ActionList(), i);
						}
					}
				}	
			}
		}
	}
	/**
	 * quick check rule to ensure that the left hand side of an assignment operator
	 * is an assignable type i.e. a variable or a field or array access
	 * @param assignmentExpr an assignment expression occurring in the rule body
	 */
	@Check
	public void checkAssignmentOperand1IsAssignable(AssignmentExpr assignmentExpr)
	{
		Expression operand1 = assignmentExpr.getOperand1();

		String op = operand1.getOp();
		if (operand1 instanceof SpecialVar) {
			String value =((SpecialVar) operand1).getValue();
			// we can currently assign $foo and $! but not $this nor any other special vars
			if (op.equals("$") && value.equals("this")) {
				error("Special variable $this is not assignable", BytemanPackage.eINSTANCE.getExpression_Operand1());
			} else if (!op.equals("$!")) {
				error("Special variable " + op + " is not assignable", BytemanPackage.eINSTANCE.getExpression_Operand1());
			}
		} else if (operand1 instanceof IndexedSpecialVar) {
			// cannot assign to $0
			String value = ((IndexedSpecialVar) operand1).getOp().substring(1);
			int idx =Integer.valueOf(value);
			if (idx == 0) {
				error("Indexed parameter variable $" + value + " is not assignable", BytemanPackage.eINSTANCE.getExpression_Operand1());
			} else if (idx < 0) {
				error("Invalid index for parameter variable $" + value, BytemanPackage.eINSTANCE.getExpression_Operand1());
			}
		} else if (operand1 instanceof AccessExpr) {
			// array elements and fields are ok as assignment targets but not method calls
			if (op.equals(".") && ((AccessExpr)operand1).getArgs() != null) {
				error("Invalid target for assignment operation", BytemanPackage.eINSTANCE.getExpression_Operand1());
			}	
		} else if (operand1 instanceof SimpleName) {
			// assigning a local bound var is ok
			// n.b. ensuring the var is in scope is done as a separate check
		} else {
			// any other LHS expression is invalid 
			error("Invalid target for assignment operation", BytemanPackage.eINSTANCE.getExpression_Operand1());
		}
	}
	
	/**
	 * quick check rule which keeps track of which rule we are in
	 * @param rule the current rule
	 */
	@Check
	public void recordCurrentRuleName(BytemanRule rule)
	{
		String name = rule.getName();
		getContext().put(RULE_NAME_KEY, name);
	}
	
	/**
	 * quick check which stashes away the name of all bound variables
	 * so we can validate subsequent references to them in the current rule
	 * @param binding
	 */
	@Check
	public void recordLocalNameIsBound(Binding binding)
	{
		String name = binding.getBindVariable();
		String currentRule = (String)getContext().get(RULE_NAME_KEY);
		
		String oldBinding = (String)getContext().put(new ContextKey(name), currentRule);
		
		// don't allow previous bindings for the same rule
		if (oldBinding == currentRule) {
			error("Duplicate binding for rule variable " + name, BytemanPackage.eINSTANCE.getBinding_BindVariable());
		}
	}
	
	/**
	 * quick check which ensures that simple names are bound before they are used
	 * within an expression
	 * @param expr
	 */
	@Check
	public void checkLocalNameIsBound(SimpleName simpleName)
	{
		String name = simpleName.getValue();
		String currentRule = (String)getContext().get(RULE_NAME_KEY);
		String binding = (String) getContext().get(new ContextKey(name));
		if (binding == null || binding != currentRule) {
			// hmm, this name may be part of a qualified name identifying a static
			// field or method in which case we cannot actually check this until
			// we are in a position to do typechecking. in any other case though
			// we can flag an error
			
			// so we need to detect a situation where this simple name is the
			// operand1 of a member access expression i.e. the containing
			// expression is  a term of the form simpleName "." xxx
			// in that case this 
			EStructuralFeature feature = simpleName.eContainingFeature();
			EObject container = simpleName.eContainer();
			boolean okSoFar = (container instanceof AccessExpr);
			if (okSoFar) {
				// ok, so its an access expression but let's check it is a
				// member expresson
				AccessExpr accessExpr = (AccessExpr)container;
				okSoFar = accessExpr.getOp().equals(".");
				if (okSoFar) {
					okSoFar = (feature == BytemanPackage.eINSTANCE.getExpression_Operand1());
				}
			}
			
		    if (!okSoFar) {
				error("Unknown rule variable " + name, BytemanPackage.eINSTANCE.getSimpleName_Value());
			}
		}
	}
	
	/**
	 * quick check which ensures that the target class or interface is known in the workspace 
	 * @param eventClass
	 * 
	 * TODO -- decide whether we need to make this check NORMAL rather than FAST
	 * TODO -- n.b. that will also require making other dependent type checks NORMAL
	 */
	@Check(CheckType.FAST)
	public void checkClassClause(EventClass eventClass)
	{
		boolean isInterface = eventClass.getKeyword().equalsIgnoreCase("INTERFACE");
		String fullName = eventClass.getName();
		String cachedResultKey = (isInterface ? "interface " : "class ") + fullName;
		List<TypeSearchResult> cachedResults =(List<TypeSearchResult>)getContext().get(cachedResultKey);
		if (cachedResults == null) {
			String typeName = fullName;
			String packageName = null;
			// n.b. unlike Java Byteman uses $ to separate embedded subclasses
			int dollarIndex = typeName.lastIndexOf('$');
			int dotIndex = typeName.lastIndexOf('.');
			if (dollarIndex > 0 && dollarIndex < dotIndex) {
				// hmm foo.bar$baz.mumble is not allowed
				// must be foo.bar.baz$mumble
				if (isInterface) {
					error("invalid trigger interface " + fullName, BytemanPackage.eINSTANCE.getEventClass_Name());
				} else {
					error("invalid trigger class " + fullName, BytemanPackage.eINSTANCE.getEventClass_Name());
				}
				return;
			}
			if (dollarIndex > 0) {
				// ok, we should be able to search for foo.bar.baz$mumble by passing
				// foo.bar as the package name and baz.mumble as the type name
				// but eclipse is not playing ball. So, we have to pass it foo.bar.baz as the package name and
				// mumble as the type name.
				typeName = typeName.replace('$', '.');
				dotIndex = dollarIndex;
			}

			int len = typeName.length();
			
			if (dotIndex > 0 && dotIndex < len -1) {
				packageName = typeName.substring(0, dotIndex);
				typeName = typeName.substring(dotIndex + 1);
			}

			SearchEngine searchEngine = new SearchEngine();
			final List<TypeSearchResult> results = new ArrayList<TypeSearchResult>();
			// if a match contains embedded types and the original used a dot as separator then
			// we have to reject the match since Byteman requires use of $ to identify the embedding
			final boolean acceptEmbeddedTypes = (dollarIndex > 0 || dotIndex < 0);
			TypeNameRequestor requestor = new TypeNameRequestor() {
				public void acceptType(int modifiers, char[] packageName, char[] simpleTypeName, char[][] enclosingTypeNames, String path) {
					if (acceptEmbeddedTypes || enclosingTypeNames.length == 0) { 
						results.add(new TypeSearchResult(modifiers, packageName, simpleTypeName, enclosingTypeNames, path));
					}
				}
			};
			char[] packageNameChars = (packageName == null ? null : packageName.toCharArray());
			char[] typeNameChars = typeName.toCharArray();
			
			IJavaSearchScope searchScope = SearchEngine.createWorkspaceScope();

			try {
				searchEngine.searchAllTypeNames(packageNameChars,
						SearchPattern.R_EXACT_MATCH|SearchPattern.R_CASE_SENSITIVE,
						typeNameChars,
						SearchPattern.R_EXACT_MATCH|SearchPattern.R_CASE_SENSITIVE,
						(isInterface ? IJavaSearchConstants.INTERFACE : IJavaSearchConstants.CLASS),
						searchScope,
						requestor,
						IJavaSearchConstants.WAIT_UNTIL_READY_TO_SEARCH,
						null);
			} catch (JavaModelException e) {
				// TODO : ho hum probably should not happen but just ignore for now
			}

			// if we have any matches then we are ok otherwise we flag the classname
			// as invalid
			
			if (results.isEmpty()) {
				if (isInterface) {
					error("unknown trigger interface " + fullName, BytemanPackage.eINSTANCE.getEventClass_Name());
				} else {
					error("unknown trigger class " + fullName, BytemanPackage.eINSTANCE.getEventClass_Name());
				}
				// erase any current rule class
				getContext().remove(RULE_CLASS_KEY);
			} else {
				// save this result as the current rule class and cache it
				// so we don't have to repeat the lookup
				getContext().put(RULE_CLASS_KEY, results);
				getContext().put(cachedResultKey, results);
}	
		} else {
			// install this result as the current rule class
			getContext().put(RULE_CLASS_KEY, cachedResults);
		}
	}

	@Check(CheckType.FAST)
	public void checkMethodClause(EventMethod eventMethod)
	{
		// delete any previous cache of possible trigger methods
		getContext().remove(RULE_METHOD_KEY);

		String methodName = eventMethod.getName();
		// we can only check the method if we already know the possible classes
		List<TypeSearchResult> types = (List<TypeSearchResult>)getContext().get(RULE_CLASS_KEY);
		if (types == null) {
			error("unknown trigger method " + methodName, BytemanPackage.eINSTANCE.getEventMethod_Name());
		} else if (methodName.equals("<clinit>")) {
			// cannot verify presence of <clinit> via search
			// just check it has no arguments
			ParameterTypes parameterTypes = eventMethod.getParameterTypes();
			if (parameterTypes != null) {
				EList<String> paramTypeNames = parameterTypes.getParamTypeNames();
				int paramTypeCount = paramTypeNames.size();
				
				if (paramTypeCount != 0) {
					error("invalid parameter types for class initializer" + methodName, BytemanPackage.eINSTANCE.getEventMethod_ParameterTypes());
				}
			}
		} else {
			boolean isConstructor = methodName.equals("<init>");
			// look for methods on each of the possible types
			ParameterTypes parameterTypes = eventMethod.getParameterTypes();
			EList<String> paramTypeNames;
			int paramTypeCount;
			if (parameterTypes != null) {
				paramTypeNames = parameterTypes.getParamTypeNames();
				paramTypeCount = paramTypeNames.size();
			} else {
				paramTypeNames = null;
				// -1 indicates any method with the relevant signature will do
				// whereas 0 indicates an empty parameter list ()
				paramTypeCount = -1;
			}

			final List<MethodSearchResult> methods = new ArrayList<MethodSearchResult>();
			// accumulate matching methods
			
			SearchEngine searchEngine = new SearchEngine();
			IJavaSearchScope scope = SearchEngine.createWorkspaceScope();			
			SearchParticipant[] participants = new SearchParticipant[] {SearchEngine.getDefaultSearchParticipant()};

			for (TypeSearchResult result : types) {
				String typeName = result.name.replace('$', '.');
				
				// now build type qualified method name
				StringBuilder builder = new StringBuilder();
				builder.append(typeName);
				// append method name to type name except when it is a constructor or class initializer
				if (!isConstructor) {
					builder.append('.');
					builder.append(methodName);
				}
				if (paramTypeCount >= 0) {
					String separator = "";
					builder.append("(");
					for (int i = 0; i < paramTypeCount; i++) {
						builder.append(separator);
						String paramTypeName = paramTypeNames.get(i);
						// ho hum eclipse doesn't like $ to separate embedded types
						if (paramTypeName.indexOf('$') > 0) {
							paramTypeName = paramTypeName.replace('$', '.');
						}
						builder.append(paramTypeName);
						separator = ",";
					}
					builder.append(")");
				}
				final String stringPattern = builder.toString();
				int searchFor = (isConstructor ? IJavaSearchConstants.CONSTRUCTOR : IJavaSearchConstants.METHOD);
				int limitTo = IJavaSearchConstants.DECLARATIONS;
				int matchType = SearchPattern.R_EXACT_MATCH|SearchPattern.R_CASE_SENSITIVE;
				SearchPattern pattern = SearchPattern.createPattern(stringPattern, searchFor, limitTo, matchType);
				final TypeSearchResult typeResult = result;
				SearchRequestor requestor = new SearchRequestor() {
					@Override
					public void acceptSearchMatch(SearchMatch match)
							throws CoreException {
						// only accept if we have an accurate match
						if (match.getAccuracy() == SearchMatch.A_ACCURATE) {
							MethodSearchResult methodResult = new MethodSearchResult(stringPattern, typeResult, match);
							methods.add(methodResult);
						}
					}				
				};
				try {
					searchEngine.search(pattern, participants, scope, requestor, null);
				} catch (CoreException e) {
					// TODO : ho hum not sure if this will happen when we have
					// no such method or because something is wrong with paths etc
					// but just ignore for now
				}
			}
			
			// if we have no matches then plant an error
			
			if (methods.isEmpty()) {
				error("unknown trigger method " + methodName, BytemanPackage.eINSTANCE.getEventMethod_Name());
			} else {
				// cache details of potential trigger methods for current rule
				getContext().put(RULE_METHOD_KEY, methods);
			}
		}
	}
	
	/**
	 * 	wrapper class used to hold results of type name searches
	 */
	private class TypeSearchResult
	{
		int modifiers;
		char[] packageName;
		char[] simpleTypeName;
		char[][] enclosingTypeNames;
		String path;
		String name;
		TypeSearchResult(int modifiers, char[] packageName, char[] simpleTypeName, char[][] enclosingTypeNames, String path)
		{
			this.modifiers = modifiers;
			this.packageName = packageName;
			this.simpleTypeName = simpleTypeName;
			this.enclosingTypeNames = enclosingTypeNames;
			this.path = path;
			StringBuilder builder = new StringBuilder();
			if (packageName != null && packageName.length > 0) {
				builder.append(packageName);
				builder.append('.');
			}
			for (char[] enclosingTypeName : enclosingTypeNames) {
				builder.append(enclosingTypeName);
				builder.append('$');
			}
			builder.append(simpleTypeName);		
			name = builder.toString();
		}
	}
	
	/**
	 * 	wrapper class used to hold results of method searches
	 */
	private class MethodSearchResult
	{
		TypeSearchResult typeSearchResult;
		String methodSpec;
		SearchMatch match;
		
		MethodSearchResult(String methodSpec, TypeSearchResult typeSearchResult, SearchMatch match)
		{
			this.methodSpec = methodSpec;
			this.typeSearchResult = typeSearchResult;
			this.match = match;
		}
	}
	
	/**
	 * key used to identify validation context entry for the name of the current RULE
	 * 
	 * associated value is a String
	 */
	private final static ContextKey RULE_NAME_KEY =new ContextKey("RULE:");
/**
	 * key used to identify validation context entry for the list of possible targets
	 * for the name supplied in the CLASS clause of the current RULE
	 * 
	 * associated value is a List<TypeSearchResult>
	 */
	private final static ContextKey RULE_CLASS_KEY =new ContextKey("CLASS:");
	/**
	 * key used to identify validation context entry for the list of possible targets
	 * for the name supplied in the METHOD clause
	 * 
	 * associated value is a List<MethodSearchResult>
	 */
	private final static ContextKey RULE_METHOD_KEY = new ContextKey("METHOD:");


	// wrapper key used to identify values stored in the context -- using this to
	// wrap the String keys avoids us overwriting anything stored there by eclipse
	
	private static class ContextKey
	{
		private String name;
		ContextKey(String name)
		{
			this.name = name;
		}
		
		@Override
		public boolean equals(Object object)
		{
			if (object instanceof ContextKey) {
				return ((ContextKey)object).name.equals(name);
			}
			
			return false;
		}
		
		@Override
		public int hashCode()
		{
			return name.hashCode();
		}
	}
}
