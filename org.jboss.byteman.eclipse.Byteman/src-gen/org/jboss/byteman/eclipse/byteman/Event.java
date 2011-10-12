/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Event#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Event#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Event#getMethod <em>Method</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Event#getHelper <em>Helper</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.Event#getLocationSpec <em>Location Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(EventClass)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getEvent_Class()
   * @model containment="true"
   * @generated
   */
  EventClass getClass_();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Event#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(EventClass value);

  /**
   * Returns the value of the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' containment reference.
   * @see #setInterface(EventInterface)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getEvent_Interface()
   * @model containment="true"
   * @generated
   */
  EventInterface getInterface();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Event#getInterface <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' containment reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(EventInterface value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(EventMethod)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getEvent_Method()
   * @model containment="true"
   * @generated
   */
  EventMethod getMethod();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Event#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(EventMethod value);

  /**
   * Returns the value of the '<em><b>Helper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Helper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Helper</em>' containment reference.
   * @see #setHelper(Helper)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getEvent_Helper()
   * @model containment="true"
   * @generated
   */
  Helper getHelper();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Event#getHelper <em>Helper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Helper</em>' containment reference.
   * @see #getHelper()
   * @generated
   */
  void setHelper(Helper value);

  /**
   * Returns the value of the '<em><b>Location Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location Spec</em>' containment reference.
   * @see #setLocationSpec(LocationSpecifier)
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getEvent_LocationSpec()
   * @model containment="true"
   * @generated
   */
  LocationSpecifier getLocationSpec();

  /**
   * Sets the value of the '{@link org.jboss.byteman.eclipse.byteman.Event#getLocationSpec <em>Location Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location Spec</em>' containment reference.
   * @see #getLocationSpec()
   * @generated
   */
  void setLocationSpec(LocationSpecifier value);

} // Event
