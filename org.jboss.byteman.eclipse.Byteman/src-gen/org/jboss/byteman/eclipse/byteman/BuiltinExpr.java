/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builtin Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.BuiltinExpr#getValue <em>Value</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.BuiltinExpr#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBuiltinExpr()
 * @model
 * @generated
 */
public interface BuiltinExpr extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBuiltinExpr_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.BuiltinExpr#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

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
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBuiltinExpr_Args()
   * @model containment="true"
   * @generated
   */
  CallArguments getArgs();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.BuiltinExpr#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(CallArguments value);

} // BuiltinExpr
