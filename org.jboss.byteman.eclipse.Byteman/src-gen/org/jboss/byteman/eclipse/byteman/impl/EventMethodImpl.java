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
import org.jboss.byteman.eclipse.byteman.EventMethod;
import org.jboss.byteman.eclipse.byteman.ParameterTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.EventMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.EventMethodImpl#getParameterTypes <em>Parameter Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventMethodImpl extends MinimalEObjectImpl.Container implements EventMethod
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterTypes()
   * @generated
   * @ordered
   */
  protected ParameterTypes parameterTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventMethodImpl()
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
    return BytemanPackage.Literals.EVENT_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterTypes getParameterTypes()
  {
    return parameterTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterTypes(ParameterTypes newParameterTypes, NotificationChain msgs)
  {
    ParameterTypes oldParameterTypes = parameterTypes;
    parameterTypes = newParameterTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT_METHOD__PARAMETER_TYPES, oldParameterTypes, newParameterTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterTypes(ParameterTypes newParameterTypes)
  {
    if (newParameterTypes != parameterTypes)
    {
      NotificationChain msgs = null;
      if (parameterTypes != null)
        msgs = ((InternalEObject)parameterTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT_METHOD__PARAMETER_TYPES, null, msgs);
      if (newParameterTypes != null)
        msgs = ((InternalEObject)newParameterTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.EVENT_METHOD__PARAMETER_TYPES, null, msgs);
      msgs = basicSetParameterTypes(newParameterTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.EVENT_METHOD__PARAMETER_TYPES, newParameterTypes, newParameterTypes));
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
      case BytemanPackage.EVENT_METHOD__PARAMETER_TYPES:
        return basicSetParameterTypes(null, msgs);
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
      case BytemanPackage.EVENT_METHOD__NAME:
        return getName();
      case BytemanPackage.EVENT_METHOD__PARAMETER_TYPES:
        return getParameterTypes();
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
      case BytemanPackage.EVENT_METHOD__NAME:
        setName((String)newValue);
        return;
      case BytemanPackage.EVENT_METHOD__PARAMETER_TYPES:
        setParameterTypes((ParameterTypes)newValue);
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
      case BytemanPackage.EVENT_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BytemanPackage.EVENT_METHOD__PARAMETER_TYPES:
        setParameterTypes((ParameterTypes)null);
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
      case BytemanPackage.EVENT_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BytemanPackage.EVENT_METHOD__PARAMETER_TYPES:
        return parameterTypes != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EventMethodImpl
