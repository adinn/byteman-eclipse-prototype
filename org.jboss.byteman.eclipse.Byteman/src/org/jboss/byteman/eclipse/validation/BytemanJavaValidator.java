package org.jboss.byteman.eclipse.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.jboss.byteman.eclipse.byteman.AccessExpr;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.Actions;
import org.jboss.byteman.eclipse.byteman.ActionList;
import org.jboss.byteman.eclipse.byteman.Action;
import org.jboss.byteman.eclipse.byteman.Expression;
import org.jboss.byteman.eclipse.byteman.AssignmentExpr;
import org.jboss.byteman.eclipse.byteman.IndexedSpecialVar;
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
			String value = ((IndexedSpecialVar) operand1).getValue();
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
	 * quick check which stashes away details of the name and type of all bound variables
	 * so we can validate susbequent references to them 
	 * @param binding
	 */
	@Check
	public void recordLocalNameIsBound(Binding binding)
	{
		String name = binding.getBindVariable();
		
		Binding oldBinding = (Binding)getContext().put(new BoundName(name), binding);
		
		if (oldBinding != null) {
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
		Binding binding = (Binding) getContext().get(new BoundName(name));
		if (binding == null) {
			// hmm, this name may be part of a qualified name idenitfying a static
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
	
	// wrapper class used to store bindings for names in
	private static class BoundName
	{
		private String name;
		BoundName(String name)
		{
			this.name = name;
		}
		
		@Override
		public boolean equals(Object object)
		{
			if (object instanceof BoundName) {
				return ((BoundName)object).name.equals(name);
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
