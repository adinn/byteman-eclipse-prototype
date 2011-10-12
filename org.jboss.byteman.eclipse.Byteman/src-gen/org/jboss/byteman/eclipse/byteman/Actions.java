/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Actions#getActionList <em>Action List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getActions()
 * @model
 * @generated
 */
public interface Actions extends EObject
{
  /**
   * Returns the value of the '<em><b>Action List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action List</em>' containment reference.
   * @see #setActionList(ActionList)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getActions_ActionList()
   * @model containment="true"
   * @generated
   */
  ActionList getActionList();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Actions#getActionList <em>Action List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action List</em>' containment reference.
   * @see #getActionList()
   * @generated
   */
  void setActionList(ActionList value);

} // Actions
