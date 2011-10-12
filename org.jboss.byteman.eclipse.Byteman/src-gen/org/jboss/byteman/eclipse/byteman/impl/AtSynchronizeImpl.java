/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jboss.byteman.eclipse.byteman.AtSynchronize;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>At Synchronize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.AtSynchronizeImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtSynchronizeImpl extends AtLocationImpl implements AtSynchronize
{
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
  protected AtSynchronizeImpl()
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
    return BytemanPackage.Literals.AT_SYNCHRONIZE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.AT_SYNCHRONIZE__COUNTER, oldCounter, counter));
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
      case BytemanPackage.AT_SYNCHRONIZE__COUNTER:
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
      case BytemanPackage.AT_SYNCHRONIZE__COUNTER:
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
      case BytemanPackage.AT_SYNCHRONIZE__COUNTER:
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
      case BytemanPackage.AT_SYNCHRONIZE__COUNTER:
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
    result.append(" (counter: ");
    result.append(counter);
    result.append(')');
    return result.toString();
  }

} //AtSynchronizeImpl
