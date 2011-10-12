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

import org.jboss.byteman.eclipse.byteman.AtInvoke;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.ParameterTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>At Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.AtInvokeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.AtInvokeImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.AtInvokeImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtInvokeImpl extends AtLocationImpl implements AtInvoke
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
   * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCounter()
   * @generated
   * @ordered
   */
  protected static final String COUNTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCounter()
   * @generated
   * @ordered
   */
  protected String counter = COUNTER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtInvokeImpl()
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
    return BytemanPackage.Literals.AT_INVOKE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.AT_INVOKE__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.AT_INVOKE__PARAMETER_TYPES, oldParameterTypes, newParameterTypes);
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
        msgs = ((InternalEObject)parameterTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.AT_INVOKE__PARAMETER_TYPES, null, msgs);
      if (newParameterTypes != null)
        msgs = ((InternalEObject)newParameterTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.AT_INVOKE__PARAMETER_TYPES, null, msgs);
      msgs = basicSetParameterTypes(newParameterTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.AT_INVOKE__PARAMETER_TYPES, newParameterTypes, newParameterTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCounter()
  {
    return counter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCounter(String newCounter)
  {
    String oldCounter = counter;
    counter = newCounter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.AT_INVOKE__COUNTER, oldCounter, counter));
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
      case BytemanPackage.AT_INVOKE__PARAMETER_TYPES:
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
      case BytemanPackage.AT_INVOKE__NAME:
        return getName();
      case BytemanPackage.AT_INVOKE__PARAMETER_TYPES:
        return getParameterTypes();
      case BytemanPackage.AT_INVOKE__COUNTER:
        return getCounter();
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
      case BytemanPackage.AT_INVOKE__NAME:
        setName((String)newValue);
        return;
      case BytemanPackage.AT_INVOKE__PARAMETER_TYPES:
        setParameterTypes((ParameterTypes)newValue);
        return;
      case BytemanPackage.AT_INVOKE__COUNTER:
        setCounter((String)newValue);
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
      case BytemanPackage.AT_INVOKE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BytemanPackage.AT_INVOKE__PARAMETER_TYPES:
        setParameterTypes((ParameterTypes)null);
        return;
      case BytemanPackage.AT_INVOKE__COUNTER:
        setCounter(COUNTER_EDEFAULT);
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
      case BytemanPackage.AT_INVOKE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BytemanPackage.AT_INVOKE__PARAMETER_TYPES:
        return parameterTypes != null;
      case BytemanPackage.AT_INVOKE__COUNTER:
        return COUNTER_EDEFAULT == null ? counter != null : !COUNTER_EDEFAULT.equals(counter);
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
    result.append(", counter: ");
    result.append(counter);
    result.append(')');
    return result.toString();
  }

} //AtInvokeImpl
