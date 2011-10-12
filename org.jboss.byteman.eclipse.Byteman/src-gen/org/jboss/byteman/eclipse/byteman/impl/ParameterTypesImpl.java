/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.ParameterTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.impl.ParameterTypesImpl#getParamTypeNames <em>Param Type Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterTypesImpl extends MinimalEObjectImpl.Container implements ParameterTypes
{
  /**
   * The cached value of the '{@link #getParamTypeNames() <em>Param Type Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamTypeNames()
   * @generated
   * @ordered
   */
  protected EList<String> paramTypeNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterTypesImpl()
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
    return BytemanPackage.Literals.PARAMETER_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParamTypeNames()
  {
    if (paramTypeNames == null)
    {
      paramTypeNames = new EDataTypeEList<String>(String.class, this, BytemanPackage.PARAMETER_TYPES__PARAM_TYPE_NAMES);
    }
    return paramTypeNames;
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
      case BytemanPackage.PARAMETER_TYPES__PARAM_TYPE_NAMES:
        return getParamTypeNames();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BytemanPackage.PARAMETER_TYPES__PARAM_TYPE_NAMES:
        getParamTypeNames().clear();
        getParamTypeNames().addAll((Collection<? extends String>)newValue);
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
      case BytemanPackage.PARAMETER_TYPES__PARAM_TYPE_NAMES:
        getParamTypeNames().clear();
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
      case BytemanPackage.PARAMETER_TYPES__PARAM_TYPE_NAMES:
        return paramTypeNames != null && !paramTypeNames.isEmpty();
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
    result.append(" (paramTypeNames: ");
    result.append(paramTypeNames);
    result.append(')');
    return result.toString();
  }

} //ParameterTypesImpl
