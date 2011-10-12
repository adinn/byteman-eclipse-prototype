/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.jboss.byteman.eclipse.byteman.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage
 * @generated
 */
public class BytemanSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BytemanPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BytemanSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BytemanPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BytemanPackage.DOMAIN_MODEL:
      {
        DomainModel domainModel = (DomainModel)theEObject;
        T result = caseDomainModel(domainModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.BYTEMAN_RULE:
      {
        BytemanRule bytemanRule = (BytemanRule)theEObject;
        T result = caseBytemanRule(bytemanRule);
        if (result == null) result = caseElement(bytemanRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.EVENT_CLASS:
      {
        EventClass eventClass = (EventClass)theEObject;
        T result = caseEventClass(eventClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.EVENT_INTERFACE:
      {
        EventInterface eventInterface = (EventInterface)theEObject;
        T result = caseEventInterface(eventInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.EVENT_METHOD:
      {
        EventMethod eventMethod = (EventMethod)theEObject;
        T result = caseEventMethod(eventMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.HELPER:
      {
        Helper helper = (Helper)theEObject;
        T result = caseHelper(helper);
        if (result == null) result = caseElement(helper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.LOCATION_SPECIFIER:
      {
        LocationSpecifier locationSpecifier = (LocationSpecifier)theEObject;
        T result = caseLocationSpecifier(locationSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_LOCATION:
      {
        AtLocation atLocation = (AtLocation)theEObject;
        T result = caseAtLocation(atLocation);
        if (result == null) result = caseLocationSpecifier(atLocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_LOCATION:
      {
        AfterLocation afterLocation = (AfterLocation)theEObject;
        T result = caseAfterLocation(afterLocation);
        if (result == null) result = caseLocationSpecifier(afterLocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_ENTRY:
      {
        AtEntry atEntry = (AtEntry)theEObject;
        T result = caseAtEntry(atEntry);
        if (result == null) result = caseAtLocation(atEntry);
        if (result == null) result = caseLocationSpecifier(atEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_EXIT:
      {
        AtExit atExit = (AtExit)theEObject;
        T result = caseAtExit(atExit);
        if (result == null) result = caseAtLocation(atExit);
        if (result == null) result = caseLocationSpecifier(atExit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_LINE:
      {
        AtLine atLine = (AtLine)theEObject;
        T result = caseAtLine(atLine);
        if (result == null) result = caseAtLocation(atLine);
        if (result == null) result = caseLocationSpecifier(atLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_READ:
      {
        AtRead atRead = (AtRead)theEObject;
        T result = caseAtRead(atRead);
        if (result == null) result = caseAtLocation(atRead);
        if (result == null) result = caseLocationSpecifier(atRead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_READ_FIELD:
      {
        AtReadField atReadField = (AtReadField)theEObject;
        T result = caseAtReadField(atReadField);
        if (result == null) result = caseAtRead(atReadField);
        if (result == null) result = caseAtLocation(atReadField);
        if (result == null) result = caseLocationSpecifier(atReadField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_READ_LOCAL:
      {
        AtReadLocal atReadLocal = (AtReadLocal)theEObject;
        T result = caseAtReadLocal(atReadLocal);
        if (result == null) result = caseAtRead(atReadLocal);
        if (result == null) result = caseAtLocation(atReadLocal);
        if (result == null) result = caseLocationSpecifier(atReadLocal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_READ:
      {
        AfterRead afterRead = (AfterRead)theEObject;
        T result = caseAfterRead(afterRead);
        if (result == null) result = caseAfterLocation(afterRead);
        if (result == null) result = caseLocationSpecifier(afterRead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_READ_FIELD:
      {
        AfterReadField afterReadField = (AfterReadField)theEObject;
        T result = caseAfterReadField(afterReadField);
        if (result == null) result = caseAfterRead(afterReadField);
        if (result == null) result = caseAfterLocation(afterReadField);
        if (result == null) result = caseLocationSpecifier(afterReadField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_READ_LOCAL:
      {
        AfterReadLocal afterReadLocal = (AfterReadLocal)theEObject;
        T result = caseAfterReadLocal(afterReadLocal);
        if (result == null) result = caseAfterRead(afterReadLocal);
        if (result == null) result = caseAfterLocation(afterReadLocal);
        if (result == null) result = caseLocationSpecifier(afterReadLocal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_WRITE:
      {
        AtWrite atWrite = (AtWrite)theEObject;
        T result = caseAtWrite(atWrite);
        if (result == null) result = caseAtLocation(atWrite);
        if (result == null) result = caseLocationSpecifier(atWrite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_WRITE_FIELD:
      {
        AtWriteField atWriteField = (AtWriteField)theEObject;
        T result = caseAtWriteField(atWriteField);
        if (result == null) result = caseAtWrite(atWriteField);
        if (result == null) result = caseAtLocation(atWriteField);
        if (result == null) result = caseLocationSpecifier(atWriteField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_WRITE_LOCAL:
      {
        AtWriteLocal atWriteLocal = (AtWriteLocal)theEObject;
        T result = caseAtWriteLocal(atWriteLocal);
        if (result == null) result = caseAtWrite(atWriteLocal);
        if (result == null) result = caseAtLocation(atWriteLocal);
        if (result == null) result = caseLocationSpecifier(atWriteLocal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_WRITE:
      {
        AfterWrite afterWrite = (AfterWrite)theEObject;
        T result = caseAfterWrite(afterWrite);
        if (result == null) result = caseAfterLocation(afterWrite);
        if (result == null) result = caseLocationSpecifier(afterWrite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_WRITE_FIELD:
      {
        AfterWriteField afterWriteField = (AfterWriteField)theEObject;
        T result = caseAfterWriteField(afterWriteField);
        if (result == null) result = caseAfterWrite(afterWriteField);
        if (result == null) result = caseAfterLocation(afterWriteField);
        if (result == null) result = caseLocationSpecifier(afterWriteField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_WRITE_LOCAL:
      {
        AfterWriteLocal afterWriteLocal = (AfterWriteLocal)theEObject;
        T result = caseAfterWriteLocal(afterWriteLocal);
        if (result == null) result = caseAfterWrite(afterWriteLocal);
        if (result == null) result = caseAfterLocation(afterWriteLocal);
        if (result == null) result = caseLocationSpecifier(afterWriteLocal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_INVOKE:
      {
        AtInvoke atInvoke = (AtInvoke)theEObject;
        T result = caseAtInvoke(atInvoke);
        if (result == null) result = caseAtLocation(atInvoke);
        if (result == null) result = caseLocationSpecifier(atInvoke);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_INVOKE:
      {
        AfterInvoke afterInvoke = (AfterInvoke)theEObject;
        T result = caseAfterInvoke(afterInvoke);
        if (result == null) result = caseAfterLocation(afterInvoke);
        if (result == null) result = caseLocationSpecifier(afterInvoke);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_SYNCHRONIZE:
      {
        AtSynchronize atSynchronize = (AtSynchronize)theEObject;
        T result = caseAtSynchronize(atSynchronize);
        if (result == null) result = caseAtLocation(atSynchronize);
        if (result == null) result = caseLocationSpecifier(atSynchronize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AFTER_SYNCHRONIZE:
      {
        AfterSynchronize afterSynchronize = (AfterSynchronize)theEObject;
        T result = caseAfterSynchronize(afterSynchronize);
        if (result == null) result = caseAfterLocation(afterSynchronize);
        if (result == null) result = caseLocationSpecifier(afterSynchronize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.AT_THROW:
      {
        AtThrow atThrow = (AtThrow)theEObject;
        T result = caseAtThrow(atThrow);
        if (result == null) result = caseAtLocation(atThrow);
        if (result == null) result = caseAfterLocation(atThrow);
        if (result == null) result = caseLocationSpecifier(atThrow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.PARAMETER_TYPES:
      {
        ParameterTypes parameterTypes = (ParameterTypes)theEObject;
        T result = caseParameterTypes(parameterTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.BIND:
      {
        Bind bind = (Bind)theEObject;
        T result = caseBind(bind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.BINDINGS:
      {
        Bindings bindings = (Bindings)theEObject;
        T result = caseBindings(bindings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.BINDING:
      {
        Binding binding = (Binding)theEObject;
        T result = caseBinding(binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.ACTIONS:
      {
        Actions actions = (Actions)theEObject;
        T result = caseActions(actions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.ACTION_LIST:
      {
        ActionList actionList = (ActionList)theEObject;
        T result = caseActionList(actionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseCondition(expression);
        if (result == null) result = caseAction(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.CALL_ARGUMENTS:
      {
        CallArguments callArguments = (CallArguments)theEObject;
        T result = caseCallArguments(callArguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.ASSIGNMENT_EXPR:
      {
        AssignmentExpr assignmentExpr = (AssignmentExpr)theEObject;
        T result = caseAssignmentExpr(assignmentExpr);
        if (result == null) result = caseExpression(assignmentExpr);
        if (result == null) result = caseCondition(assignmentExpr);
        if (result == null) result = caseAction(assignmentExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.OPERATOR_EXPR:
      {
        OperatorExpr operatorExpr = (OperatorExpr)theEObject;
        T result = caseOperatorExpr(operatorExpr);
        if (result == null) result = caseExpression(operatorExpr);
        if (result == null) result = caseCondition(operatorExpr);
        if (result == null) result = caseAction(operatorExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.PLUS_MINUS_OPERAND:
      {
        PlusMinusOperand plusMinusOperand = (PlusMinusOperand)theEObject;
        T result = casePlusMinusOperand(plusMinusOperand);
        if (result == null) result = caseExpression(plusMinusOperand);
        if (result == null) result = caseCondition(plusMinusOperand);
        if (result == null) result = caseAction(plusMinusOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.TIMES_DIV_OPERAND:
      {
        TimesDivOperand timesDivOperand = (TimesDivOperand)theEObject;
        T result = caseTimesDivOperand(timesDivOperand);
        if (result == null) result = caseExpression(timesDivOperand);
        if (result == null) result = caseCondition(timesDivOperand);
        if (result == null) result = caseAction(timesDivOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.BITWISE_OPERAND:
      {
        BitwiseOperand bitwiseOperand = (BitwiseOperand)theEObject;
        T result = caseBitwiseOperand(bitwiseOperand);
        if (result == null) result = caseExpression(bitwiseOperand);
        if (result == null) result = caseCondition(bitwiseOperand);
        if (result == null) result = caseAction(bitwiseOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.LOGICAL_OPERAND:
      {
        LogicalOperand logicalOperand = (LogicalOperand)theEObject;
        T result = caseLogicalOperand(logicalOperand);
        if (result == null) result = caseExpression(logicalOperand);
        if (result == null) result = caseCondition(logicalOperand);
        if (result == null) result = caseAction(logicalOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.ACCESS_EXPR:
      {
        AccessExpr accessExpr = (AccessExpr)theEObject;
        T result = caseAccessExpr(accessExpr);
        if (result == null) result = caseExpression(accessExpr);
        if (result == null) result = caseCondition(accessExpr);
        if (result == null) result = caseAction(accessExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.BUILTIN_EXPR:
      {
        BuiltinExpr builtinExpr = (BuiltinExpr)theEObject;
        T result = caseBuiltinExpr(builtinExpr);
        if (result == null) result = caseExpression(builtinExpr);
        if (result == null) result = caseCondition(builtinExpr);
        if (result == null) result = caseAction(builtinExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.NEW_EXPR:
      {
        NewExpr newExpr = (NewExpr)theEObject;
        T result = caseNewExpr(newExpr);
        if (result == null) result = caseExpression(newExpr);
        if (result == null) result = caseCondition(newExpr);
        if (result == null) result = caseAction(newExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.SIMPLE_NAME:
      {
        SimpleName simpleName = (SimpleName)theEObject;
        T result = caseSimpleName(simpleName);
        if (result == null) result = caseExpression(simpleName);
        if (result == null) result = caseCondition(simpleName);
        if (result == null) result = caseAction(simpleName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.INDEXED_SPECIAL_VAR:
      {
        IndexedSpecialVar indexedSpecialVar = (IndexedSpecialVar)theEObject;
        T result = caseIndexedSpecialVar(indexedSpecialVar);
        if (result == null) result = caseExpression(indexedSpecialVar);
        if (result == null) result = caseCondition(indexedSpecialVar);
        if (result == null) result = caseAction(indexedSpecialVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.SPECIAL_VAR:
      {
        SpecialVar specialVar = (SpecialVar)theEObject;
        T result = caseSpecialVar(specialVar);
        if (result == null) result = caseExpression(specialVar);
        if (result == null) result = caseCondition(specialVar);
        if (result == null) result = caseAction(specialVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.INT_CONSTANT_EXPR:
      {
        IntConstantExpr intConstantExpr = (IntConstantExpr)theEObject;
        T result = caseIntConstantExpr(intConstantExpr);
        if (result == null) result = caseExpression(intConstantExpr);
        if (result == null) result = caseCondition(intConstantExpr);
        if (result == null) result = caseAction(intConstantExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.STRING_CONSTANT_EXPR:
      {
        StringConstantExpr stringConstantExpr = (StringConstantExpr)theEObject;
        T result = caseStringConstantExpr(stringConstantExpr);
        if (result == null) result = caseExpression(stringConstantExpr);
        if (result == null) result = caseCondition(stringConstantExpr);
        if (result == null) result = caseAction(stringConstantExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.BOOLEAN_CONSTANT_EXPR:
      {
        BooleanConstantExpr booleanConstantExpr = (BooleanConstantExpr)theEObject;
        T result = caseBooleanConstantExpr(booleanConstantExpr);
        if (result == null) result = caseExpression(booleanConstantExpr);
        if (result == null) result = caseCondition(booleanConstantExpr);
        if (result == null) result = caseAction(booleanConstantExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BytemanPackage.FLOAT_CONSTANT_EXPR:
      {
        FloatConstantExpr floatConstantExpr = (FloatConstantExpr)theEObject;
        T result = caseFloatConstantExpr(floatConstantExpr);
        if (result == null) result = caseExpression(floatConstantExpr);
        if (result == null) result = caseCondition(floatConstantExpr);
        if (result == null) result = caseAction(floatConstantExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainModel(DomainModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBytemanRule(BytemanRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventClass(EventClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventInterface(EventInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventMethod(EventMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Helper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Helper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelper(Helper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Location Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Location Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocationSpecifier(LocationSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Location</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Location</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtLocation(AtLocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Location</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Location</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterLocation(AfterLocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtEntry(AtEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Exit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Exit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtExit(AtExit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtLine(AtLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Read</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Read</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtRead(AtRead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Read Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Read Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtReadField(AtReadField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Read Local</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Read Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtReadLocal(AtReadLocal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Read</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Read</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterRead(AfterRead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Read Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Read Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterReadField(AfterReadField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Read Local</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Read Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterReadLocal(AfterReadLocal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Write</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Write</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtWrite(AtWrite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Write Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Write Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtWriteField(AtWriteField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Write Local</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Write Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtWriteLocal(AtWriteLocal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Write</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Write</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterWrite(AfterWrite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Write Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Write Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterWriteField(AfterWriteField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Write Local</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Write Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterWriteLocal(AfterWriteLocal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Invoke</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Invoke</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtInvoke(AtInvoke object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Invoke</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Invoke</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterInvoke(AfterInvoke object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Synchronize</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Synchronize</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtSynchronize(AtSynchronize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Synchronize</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Synchronize</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterSynchronize(AfterSynchronize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Throw</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Throw</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtThrow(AtThrow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterTypes(ParameterTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBind(Bind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bindings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bindings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindings(Bindings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding(Binding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActions(Actions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionList(ActionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallArguments(CallArguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentExpr(AssignmentExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorExpr(OperatorExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Minus Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Minus Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusMinusOperand(PlusMinusOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Times Div Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Times Div Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesDivOperand(TimesDivOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitwise Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitwise Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitwiseOperand(BitwiseOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalOperand(LogicalOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessExpr(AccessExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Builtin Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Builtin Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltinExpr(BuiltinExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewExpr(NewExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleName(SimpleName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexed Special Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexed Special Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexedSpecialVar(IndexedSpecialVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Special Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Special Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecialVar(SpecialVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Constant Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntConstantExpr(IntConstantExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constant Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstantExpr(StringConstantExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Constant Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanConstantExpr(BooleanConstantExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Constant Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatConstantExpr(FloatConstantExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BytemanSwitch
