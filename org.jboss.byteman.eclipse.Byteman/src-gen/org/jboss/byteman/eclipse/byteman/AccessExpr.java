/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.AccessExpr#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.AccessExpr#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAccessExpr()
 * @model
 * @generated
 */
public interface AccessExpr extends Expression
{
  /**
   * Returns the value of the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand2</em>' containment reference.
   * @see #setOperand2(Expression)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAccessExpr_Operand2()
   * @model containment="true"
   * @generated
   */
  Expression getOperand2();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.AccessExpr#getOperand2 <em>Operand2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand2</em>' containment reference.
   * @see #getOperand2()
   * @generated
   */
  void setOperand2(Expression value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(CallArguments)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAccessExpr_Args()
   * @model containment="true"
   * @generated
   */
  CallArguments getArgs();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.AccessExpr#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(CallArguments value);

} // AccessExpr
