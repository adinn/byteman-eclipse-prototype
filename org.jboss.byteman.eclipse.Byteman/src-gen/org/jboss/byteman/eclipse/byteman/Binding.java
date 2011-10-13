/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Binding#getBindVariable <em>Bind Variable</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Binding#getValue <em>Value</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Binding#getTypename <em>Typename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Bind Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind Variable</em>' attribute.
   * @see #setBindVariable(String)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBinding_BindVariable()
   * @model
   * @generated
   */
  String getBindVariable();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Binding#getBindVariable <em>Bind Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind Variable</em>' attribute.
   * @see #getBindVariable()
   * @generated
   */
  void setBindVariable(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBinding_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Binding#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

  /**
   * Returns the value of the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' attribute.
   * @see #setTypename(String)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getBinding_Typename()
   * @model
   * @generated
   */
  String getTypename();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Binding#getTypename <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' attribute.
   * @see #getTypename()
   * @generated
   */
  void setTypename(String value);

} // Binding
