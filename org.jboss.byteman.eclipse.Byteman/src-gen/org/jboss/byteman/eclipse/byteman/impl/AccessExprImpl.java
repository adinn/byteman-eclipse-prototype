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

import org.jboss.byteman.eclipse.byteman.AccessExpr;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.CallArguments;
import org.jboss.byteman.eclipse.byteman.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.AccessExprImpl#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.AccessExprImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.AccessExprImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessExprImpl extends ExpressionImpl implements AccessExpr
{
  /**
   * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand2()
   * @generated
   * @ordered
   */
  protected Expression operand2;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected CallArguments args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccessExprImpl()
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
    return BytemanPackage.Literals.ACCESS_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOperand2()
  {
    return operand2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand2(Expression newOperand2, NotificationChain msgs)
  {
    Expression oldOperand2 = operand2;
    operand2 = newOperand2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.ACCESS_EXPR__OPERAND2, oldOperand2, newOperand2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand2(Expression newOperand2)
  {
    if (newOperand2 != operand2)
    {
      NotificationChain msgs = null;
      if (operand2 != null)
        msgs = ((InternalEObject)operand2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.ACCESS_EXPR__OPERAND2, null, msgs);
      if (newOperand2 != null)
        msgs = ((InternalEObject)newOperand2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.ACCESS_EXPR__OPERAND2, null, msgs);
      msgs = basicSetOperand2(newOperand2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.ACCESS_EXPR__OPERAND2, newOperand2, newOperand2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.ACCESS_EXPR__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallArguments getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(CallArguments newArgs, NotificationChain msgs)
  {
    CallArguments oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BytemanPackage.ACCESS_EXPR__ARGS, oldArgs, newArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(CallArguments newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.ACCESS_EXPR__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BytemanPackage.ACCESS_EXPR__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BytemanPackage.ACCESS_EXPR__ARGS, newArgs, newArgs));
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
      case BytemanPackage.ACCESS_EXPR__OPERAND2:
        return basicSetOperand2(null, msgs);
      case BytemanPackage.ACCESS_EXPR__ARGS:
        return basicSetArgs(null, msgs);
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
      case BytemanPackage.ACCESS_EXPR__OPERAND2:
        return getOperand2();
      case BytemanPackage.ACCESS_EXPR__VALUE:
        return getValue();
      case BytemanPackage.ACCESS_EXPR__ARGS:
        return getArgs();
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
      case BytemanPackage.ACCESS_EXPR__OPERAND2:
        setOperand2((Expression)newValue);
        return;
      case BytemanPackage.ACCESS_EXPR__VALUE:
        setValue((String)newValue);
        return;
      case BytemanPackage.ACCESS_EXPR__ARGS:
        setArgs((CallArguments)newValue);
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
      case BytemanPackage.ACCESS_EXPR__OPERAND2:
        setOperand2((Expression)null);
        return;
      case BytemanPackage.ACCESS_EXPR__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case BytemanPackage.ACCESS_EXPR__ARGS:
        setArgs((CallArguments)null);
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
      case BytemanPackage.ACCESS_EXPR__OPERAND2:
        return operand2 != null;
      case BytemanPackage.ACCESS_EXPR__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case BytemanPackage.ACCESS_EXPR__ARGS:
        return args != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //AccessExprImpl
