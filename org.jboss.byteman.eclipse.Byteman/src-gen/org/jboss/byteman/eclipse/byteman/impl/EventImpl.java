/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.Event;
import org.jboss.byteman.eclipse.byteman.EventClass;
import org.jboss.byteman.eclipse.byteman.EventMethod;
import org.jboss.byteman.eclipse.byteman.Helper;
import org.jboss.byteman.eclipse.byteman.LocationSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.EventImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.EventImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.EventImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.EventImpl#getHelper <em>Helper</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.EventImpl#getLocationSpec <em>Location Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EventClass class_;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected EventClass interface_;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EventMethod method;

  /**
   * The cached value of the '{@link #getHelper() <em>Helper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelper()
   * @generated
   * @ordered
   */
  protected Helper helper;

  /**
   * The cached value of the '{@link #getLocationSpec() <em>Location Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationSpec()
   * @generated
   * @ordered
   */
  protected LocationSpecifier locationSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BytemanPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventClass getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(EventClass newClass, NotificationChain msgs)
  {
    EventClass oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(EventClass newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventClass getInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterface(EventClass newInterface, NotificationChain msgs)
  {
    EventClass oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__INTERFACE, oldInterface, newInterface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(EventClass newInterface)
  {
    if (newInterface != interface_)
    {
      NotificationChain msgs = null;
      if (interface_ != null)
        msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__INTERFACE, null, msgs);
      if (newInterface != null)
        msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__INTERFACE, null, msgs);
      msgs = basicSetInterface(newInterface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__INTERFACE, newInterface, newInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventMethod getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(EventMethod newMethod, NotificationChain msgs)
  {
    EventMethod oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(EventMethod newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__METHOD, newMethod, newMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Helper getHelper()
  {
    return helper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHelper(Helper newHelper, NotificationChain msgs)
  {
    Helper oldHelper = helper;
    helper = newHelper;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__HELPER, oldHelper, newHelper);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelper(Helper newHelper)
  {
    if (newHelper != helper)
    {
      NotificationChain msgs = null;
      if (helper != null)
        msgs = ((InternalEObject)helper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__HELPER, null, msgs);
      if (newHelper != null)
        msgs = ((InternalEObject)newHelper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__HELPER, null, msgs);
      msgs = basicSetHelper(newHelper, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__HELPER, newHelper, newHelper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationSpecifier getLocationSpec()
  {
    return locationSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocationSpec(LocationSpecifier newLocationSpec, NotificationChain msgs)
  {
    LocationSpecifier oldLocationSpec = locationSpec;
    locationSpec = newLocationSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__LOCATION_SPEC, oldLocationSpec, newLocationSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocationSpec(LocationSpecifier newLocationSpec)
  {
    if (newLocationSpec != locationSpec)
    {
      NotificationChain msgs = null;
      if (locationSpec != null)
        msgs = ((InternalEObject)locationSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__LOCATION_SPEC, null, msgs);
      if (newLocationSpec != null)
        msgs = ((InternalEObject)newLocationSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT__LOCATION_SPEC, null, msgs);
      msgs = basicSetLocationSpec(newLocationSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT__LOCATION_SPEC, newLocationSpec, newLocationSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BytemanPackage.EVENT__CLASS:
        return basicSetClass(null, msgs);
      case BytemanPackage.EVENT__INTERFACE:
        return basicSetInterface(null, msgs);
      case BytemanPackage.EVENT__METHOD:
        return basicSetMethod(null, msgs);
      case BytemanPackage.EVENT__HELPER:
        return basicSetHelper(null, msgs);
      case BytemanPackage.EVENT__LOCATION_SPEC:
        return basicSetLocationSpec(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BytemanPackage.EVENT__CLASS:
        return getClass_();
      case BytemanPackage.EVENT__INTERFACE:
        return getInterface();
      case BytemanPackage.EVENT__METHOD:
        return getMethod();
      case BytemanPackage.EVENT__HELPER:
        return getHelper();
      case BytemanPackage.EVENT__LOCATION_SPEC:
        return getLocationSpec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BytemanPackage.EVENT__CLASS:
        setClass((EventClass)newValue);
        return;
      case BytemanPackage.EVENT__INTERFACE:
        setInterface((EventClass)newValue);
        return;
      case BytemanPackage.EVENT__METHOD:
        setMethod((EventMethod)newValue);
        return;
      case BytemanPackage.EVENT__HELPER:
        setHelper((Helper)newValue);
        return;
      case BytemanPackage.EVENT__LOCATION_SPEC:
        setLocationSpec((LocationSpecifier)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BytemanPackage.EVENT__CLASS:
        setClass((EventClass)null);
        return;
      case BytemanPackage.EVENT__INTERFACE:
        setInterface((EventClass)null);
        return;
      case BytemanPackage.EVENT__METHOD:
        setMethod((EventMethod)null);
        return;
      case BytemanPackage.EVENT__HELPER:
        setHelper((Helper)null);
        return;
      case BytemanPackage.EVENT__LOCATION_SPEC:
        setLocationSpec((LocationSpecifier)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BytemanPackage.EVENT__CLASS:
        return class_ != null;
      case BytemanPackage.EVENT__INTERFACE:
        return interface_ != null;
      case BytemanPackage.EVENT__METHOD:
        return method != null;
      case BytemanPackage.EVENT__HELPER:
        return helper != null;
      case BytemanPackage.EVENT__LOCATION_SPEC:
        return locationSpec != null;
    }
    return super.eIsSet(featureID);
  }

} //EventImpl
