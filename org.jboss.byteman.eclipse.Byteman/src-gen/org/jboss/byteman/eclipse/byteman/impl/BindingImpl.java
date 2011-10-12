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

import org.jboss.byteman.eclipse.byteman.Binding;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.BindingImpl#getBindVariable <em>Bind Variable</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.BindingImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.BindingImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The default value of the '{@link #getBindVariable() <em>Bind Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindVariable()
   * @generated
   * @ordered
   */
  protected static final String BIND_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBindVariable() <em>Bind Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindVariable()
   * @generated
   * @ordered
   */
  protected String bindVariable = BIND_VARIABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getTypename() <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected static final String TYPENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypename() <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected String typename = TYPENAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return BytemanPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBindVariable()
  {
    return bindVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindVariable(String newBindVariable)
  {
    String oldBindVariable = bindVariable;
    bindVariable = newBindVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.BINDING__BIND_VARIABLE, oldBindVariable, bindVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypename()
  {
    return typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypename(String newTypename)
  {
    String oldTypename = typename;
    typename = newTypename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.BINDING__TYPENAME, oldTypename, typename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.BINDING__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.BINDING__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.BINDING__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.BINDING__VALUE, newValue, newValue));
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
      case BytemanPackage.BINDING__VALUE:
        return basicSetValue(null, msgs);
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
      case BytemanPackage.BINDING__BIND_VARIABLE:
        return getBindVariable();
      case BytemanPackage.BINDING__TYPENAME:
        return getTypename();
      case BytemanPackage.BINDING__VALUE:
        return getValue();
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
      case BytemanPackage.BINDING__BIND_VARIABLE:
        setBindVariable((String)newValue);
        return;
      case BytemanPackage.BINDING__TYPENAME:
        setTypename((String)newValue);
        return;
      case BytemanPackage.BINDING__VALUE:
        setValue((Expression)newValue);
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
      case BytemanPackage.BINDING__BIND_VARIABLE:
        setBindVariable(BIND_VARIABLE_EDEFAULT);
        return;
      case BytemanPackage.BINDING__TYPENAME:
        setTypename(TYPENAME_EDEFAULT);
        return;
      case BytemanPackage.BINDING__VALUE:
        setValue((Expression)null);
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
      case BytemanPackage.BINDING__BIND_VARIABLE:
        return BIND_VARIABLE_EDEFAULT == null ? bindVariable != null : !BIND_VARIABLE_EDEFAULT.equals(bindVariable);
      case BytemanPackage.BINDING__TYPENAME:
        return TYPENAME_EDEFAULT == null ? typename != null : !TYPENAME_EDEFAULT.equals(typename);
      case BytemanPackage.BINDING__VALUE:
        return value != null;
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
    result.append(" (bindVariable: ");
    result.append(bindVariable);
    result.append(", typename: ");
    result.append(typename);
    result.append(')');
    return result.toString();
  }

} //BindingImpl
