/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Bind#getBind <em>Bind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBind()
 * @model
 * @generated
 */
public interface Bind extends EObject
{
  /**
   * Returns the value of the '<em><b>Bind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind</em>' containment reference.
   * @see #setBind(Bindings)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBind_Bind()
   * @model containment="true"
   * @generated
   */
  Bindings getBind();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Bind#getBind <em>Bind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind</em>' containment reference.
   * @see #getBind()
   * @generated
   */
  void setBind(Bindings value);

} // Bind
