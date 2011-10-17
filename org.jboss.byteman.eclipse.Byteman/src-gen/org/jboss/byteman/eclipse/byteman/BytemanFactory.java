/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage
 * @generated
 */
public interface BytemanFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BytemanFactory eINSTANCE = org.jboss.byteman.eclipse.byteman.impl.BytemanFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  BytemanRule createBytemanRule();

  /**
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Event Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Class</em>'.
   * @generated
   */
  EventClass createEventClass();

  /**
   * Returns a new object of class '<em>Event Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Method</em>'.
   * @generated
   */
  EventMethod createEventMethod();

  /**
   * Returns a new object of class '<em>Helper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Helper</em>'.
   * @generated
   */
  Helper createHelper();

  /**
   * Returns a new object of class '<em>Location Specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Specifier</em>'.
   * @generated
   */
  LocationSpecifier createLocationSpecifier();

  /**
   * Returns a new object of class '<em>At Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Location</em>'.
   * @generated
   */
  AtLocation createAtLocation();

  /**
   * Returns a new object of class '<em>After Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Location</em>'.
   * @generated
   */
  AfterLocation createAfterLocation();

  /**
   * Returns a new object of class '<em>At Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Entry</em>'.
   * @generated
   */
  AtEntry createAtEntry();

  /**
   * Returns a new object of class '<em>At Exit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Exit</em>'.
   * @generated
   */
  AtExit createAtExit();

  /**
   * Returns a new object of class '<em>At Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Line</em>'.
   * @generated
   */
  AtLine createAtLine();

  /**
   * Returns a new object of class '<em>At Read</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Read</em>'.
   * @generated
   */
  AtRead createAtRead();

  /**
   * Returns a new object of class '<em>At Read Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Read Field</em>'.
   * @generated
   */
  AtReadField createAtReadField();

  /**
   * Returns a new object of class '<em>At Read Local</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Read Local</em>'.
   * @generated
   */
  AtReadLocal createAtReadLocal();

  /**
   * Returns a new object of class '<em>After Read</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Read</em>'.
   * @generated
   */
  AfterRead createAfterRead();

  /**
   * Returns a new object of class '<em>After Read Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Read Field</em>'.
   * @generated
   */
  AfterReadField createAfterReadField();

  /**
   * Returns a new object of class '<em>After Read Local</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Read Local</em>'.
   * @generated
   */
  AfterReadLocal createAfterReadLocal();

  /**
   * Returns a new object of class '<em>At Write</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Write</em>'.
   * @generated
   */
  AtWrite createAtWrite();

  /**
   * Returns a new object of class '<em>At Write Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Write Field</em>'.
   * @generated
   */
  AtWriteField createAtWriteField();

  /**
   * Returns a new object of class '<em>At Write Local</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Write Local</em>'.
   * @generated
   */
  AtWriteLocal createAtWriteLocal();

  /**
   * Returns a new object of class '<em>After Write</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Write</em>'.
   * @generated
   */
  AfterWrite createAfterWrite();

  /**
   * Returns a new object of class '<em>After Write Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Write Field</em>'.
   * @generated
   */
  AfterWriteField createAfterWriteField();

  /**
   * Returns a new object of class '<em>After Write Local</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Write Local</em>'.
   * @generated
   */
  AfterWriteLocal createAfterWriteLocal();

  /**
   * Returns a new object of class '<em>At Invoke</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Invoke</em>'.
   * @generated
   */
  AtInvoke createAtInvoke();

  /**
   * Returns a new object of class '<em>After Invoke</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Invoke</em>'.
   * @generated
   */
  AfterInvoke createAfterInvoke();

  /**
   * Returns a new object of class '<em>At Synchronize</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Synchronize</em>'.
   * @generated
   */
  AtSynchronize createAtSynchronize();

  /**
   * Returns a new object of class '<em>After Synchronize</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Synchronize</em>'.
   * @generated
   */
  AfterSynchronize createAfterSynchronize();

  /**
   * Returns a new object of class '<em>At Throw</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Throw</em>'.
   * @generated
   */
  AtThrow createAtThrow();

  /**
   * Returns a new object of class '<em>Parameter Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Types</em>'.
   * @generated
   */
  ParameterTypes createParameterTypes();

  /**
   * Returns a new object of class '<em>Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bind</em>'.
   * @generated
   */
  Bind createBind();

  /**
   * Returns a new object of class '<em>Bindings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bindings</em>'.
   * @generated
   */
  Bindings createBindings();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Actions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actions</em>'.
   * @generated
   */
  Actions createActions();

  /**
   * Returns a new object of class '<em>Action List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action List</em>'.
   * @generated
   */
  ActionList createActionList();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Call Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Arguments</em>'.
   * @generated
   */
  CallArguments createCallArguments();

  /**
   * Returns a new object of class '<em>Assignment Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Expr</em>'.
   * @generated
   */
  AssignmentExpr createAssignmentExpr();

  /**
   * Returns a new object of class '<em>Operator Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Expr</em>'.
   * @generated
   */
  OperatorExpr createOperatorExpr();

  /**
   * Returns a new object of class '<em>Plus Minus Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Minus Operand</em>'.
   * @generated
   */
  PlusMinusOperand createPlusMinusOperand();

  /**
   * Returns a new object of class '<em>Times Div Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Times Div Operand</em>'.
   * @generated
   */
  TimesDivOperand createTimesDivOperand();

  /**
   * Returns a new object of class '<em>Bitwise Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bitwise Operand</em>'.
   * @generated
   */
  BitwiseOperand createBitwiseOperand();

  /**
   * Returns a new object of class '<em>Logical Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Operand</em>'.
   * @generated
   */
  LogicalOperand createLogicalOperand();

  /**
   * Returns a new object of class '<em>Access Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access Expr</em>'.
   * @generated
   */
  AccessExpr createAccessExpr();

  /**
   * Returns a new object of class '<em>Builtin Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builtin Expr</em>'.
   * @generated
   */
  BuiltinExpr createBuiltinExpr();

  /**
   * Returns a new object of class '<em>New Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Expr</em>'.
   * @generated
   */
  NewExpr createNewExpr();

  /**
   * Returns a new object of class '<em>Simple Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Name</em>'.
   * @generated
   */
  SimpleName createSimpleName();

  /**
   * Returns a new object of class '<em>Indexed Special Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexed Special Var</em>'.
   * @generated
   */
  IndexedSpecialVar createIndexedSpecialVar();

  /**
   * Returns a new object of class '<em>Special Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Special Var</em>'.
   * @generated
   */
  SpecialVar createSpecialVar();

  /**
   * Returns a new object of class '<em>Int Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Constant Expr</em>'.
   * @generated
   */
  IntConstantExpr createIntConstantExpr();

  /**
   * Returns a new object of class '<em>String Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constant Expr</em>'.
   * @generated
   */
  StringConstantExpr createStringConstantExpr();

  /**
   * Returns a new object of class '<em>Boolean Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Constant Expr</em>'.
   * @generated
   */
  BooleanConstantExpr createBooleanConstantExpr();

  /**
   * Returns a new object of class '<em>Float Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Constant Expr</em>'.
   * @generated
   */
  FloatConstantExpr createFloatConstantExpr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BytemanPackage getBytemanPackage();

} //BytemanFactory
