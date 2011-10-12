/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bitwise Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.BitwiseOperand#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBitwiseOperand()
 * @model
 * @generated
 */
public interface BitwiseOperand extends Expression
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
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBitwiseOperand_Operand2()
   * @model containment="true"
   * @generated
   */
  Expression getOperand2();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.BitwiseOperand#getOperand2 <em>Operand2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand2</em>' containment reference.
   * @see #getOperand2()
   * @generated
   */
  void setOperand2(Expression value);

} // BitwiseOperand
