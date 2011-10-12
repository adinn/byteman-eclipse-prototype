/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>At Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.AtRead#getName <em>Name</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.AtRead#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAtRead()
 * @model
 * @generated
 */
public interface AtRead extends AtLocation
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
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAtRead_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.AtRead#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getAtRead_Counter()
   * @model
   * @generated
   */
  String getCounter();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.AtRead#getCounter <em>Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Counter</em>' attribute.
   * @see #getCounter()
   * @generated
   */
  void setCounter(String value);

} // AtRead
