/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.AfterLocation#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAfterLocation()
 * @model
 * @generated
 */
public interface AfterLocation extends LocationSpecifier
{
  /**
   * Returns the value of the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Counter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Counter</em>' attribute.
   * @see #setCounter(String)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAfterLocation_Counter()
   * @model
   * @generated
   */
  String getCounter();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.AfterLocation#getCounter <em>Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Counter</em>' attribute.
   * @see #getCounter()
   * @generated
   */
  void setCounter(String value);

} // AfterLocation
