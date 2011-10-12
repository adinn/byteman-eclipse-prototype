/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.AfterWrite#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAfterWrite()
 * @model
 * @generated
 */
public interface AfterWrite extends AfterLocation
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
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAfterWrite_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.AfterWrite#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // AfterWrite
