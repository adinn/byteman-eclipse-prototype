/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.AfterInvoke#getName <em>Name</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.AfterInvoke#getParameterTypes <em>Parameter Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAfterInvoke()
 * @model
 * @generated
 */
public interface AfterInvoke extends AfterLocation
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAfterInvoke_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.AfterInvoke#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Types</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Types</em>' containment reference.
   * @see #setParameterTypes(ParameterTypes)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAfterInvoke_ParameterTypes()
   * @model containment="true"
   * @generated
   */
  ParameterTypes getParameterTypes();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.AfterInvoke#getParameterTypes <em>Parameter Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Types</em>' containment reference.
   * @see #getParameterTypes()
   * @generated
   */
  void setParameterTypes(ParameterTypes value);

} // AfterInvoke
