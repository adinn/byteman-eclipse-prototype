/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.byteman.eclipse.byteman.ParameterTypes#getParamTypeNames <em>Param Type Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getParameterTypes()
 * @model
 * @generated
 */
public interface ParameterTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Param Type Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Type Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Type Names</em>' attribute list.
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#getParameterTypes_ParamTypeNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getParamTypeNames();

} // ParameterTypes
