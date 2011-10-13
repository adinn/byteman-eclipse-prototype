/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jboss.byteman.eclipse.byteman.BytemanFactory
 * @model kind="package"
 * @generated
 */
public interface BytemanPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "byteman";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.jboss.org/byteman/eclipse/Byteman";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "byteman";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BytemanPackage eINSTANCE = org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl.init();

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.DomainModelImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.ElementImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.BytemanRuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanRuleImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBytemanRule()
   * @generated
   */
  int BYTEMAN_RULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTEMAN_RULE__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTEMAN_RULE__EVENT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTEMAN_RULE__BODY = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTEMAN_RULE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.BodyImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBody()
   * @generated
   */
  int BODY = 3;

  /**
   * The feature id for the '<em><b>Bind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__BIND = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__CONDITION = 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__ACTIONS = 2;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.EventImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 4;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CLASS = 0;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__INTERFACE = 1;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__METHOD = 2;

  /**
   * The feature id for the '<em><b>Helper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__HELPER = 3;

  /**
   * The feature id for the '<em><b>Location Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__LOCATION_SPEC = 4;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.EventClassImpl <em>Event Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.EventClassImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getEventClass()
   * @generated
   */
  int EVENT_CLASS = 5;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CLASS__KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CLASS__NAME = 1;

  /**
   * The number of structural features of the '<em>Event Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.EventInterfaceImpl <em>Event Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.EventInterfaceImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getEventInterface()
   * @generated
   */
  int EVENT_INTERFACE = 6;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_INTERFACE__KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_INTERFACE__NAME = 1;

  /**
   * The number of structural features of the '<em>Event Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.EventMethodImpl <em>Event Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.EventMethodImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getEventMethod()
   * @generated
   */
  int EVENT_METHOD = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_METHOD__PARAMETER_TYPES = 1;

  /**
   * The number of structural features of the '<em>Event Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_METHOD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.HelperImpl <em>Helper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.HelperImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getHelper()
   * @generated
   */
  int HELPER = 8;

  /**
   * The feature id for the '<em><b>Helper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__HELPER = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Helper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.LocationSpecifierImpl <em>Location Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.LocationSpecifierImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getLocationSpecifier()
   * @generated
   */
  int LOCATION_SPECIFIER = 9;

  /**
   * The number of structural features of the '<em>Location Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_SPECIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtLocationImpl <em>At Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtLocationImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtLocation()
   * @generated
   */
  int AT_LOCATION = 10;

  /**
   * The number of structural features of the '<em>At Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LOCATION_FEATURE_COUNT = LOCATION_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterLocationImpl <em>After Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterLocationImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterLocation()
   * @generated
   */
  int AFTER_LOCATION = 11;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_LOCATION__COUNTER = LOCATION_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>After Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_LOCATION_FEATURE_COUNT = LOCATION_SPECIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtEntryImpl <em>At Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtEntryImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtEntry()
   * @generated
   */
  int AT_ENTRY = 12;

  /**
   * The number of structural features of the '<em>At Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_ENTRY_FEATURE_COUNT = AT_LOCATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtExitImpl <em>At Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtExitImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtExit()
   * @generated
   */
  int AT_EXIT = 13;

  /**
   * The number of structural features of the '<em>At Exit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_EXIT_FEATURE_COUNT = AT_LOCATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtLineImpl <em>At Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtLineImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtLine()
   * @generated
   */
  int AT_LINE = 14;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LINE__LINE = LOCATION_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>At Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LINE_FEATURE_COUNT = LOCATION_SPECIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtReadImpl <em>At Read</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtReadImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtRead()
   * @generated
   */
  int AT_READ = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ__NAME = AT_LOCATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ__COUNTER = AT_LOCATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>At Read</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ_FEATURE_COUNT = AT_LOCATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtReadFieldImpl <em>At Read Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtReadFieldImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtReadField()
   * @generated
   */
  int AT_READ_FIELD = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ_FIELD__NAME = AT_READ__NAME;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ_FIELD__COUNTER = AT_READ__COUNTER;

  /**
   * The number of structural features of the '<em>At Read Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ_FIELD_FEATURE_COUNT = AT_READ_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtReadLocalImpl <em>At Read Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtReadLocalImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtReadLocal()
   * @generated
   */
  int AT_READ_LOCAL = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ_LOCAL__NAME = AT_READ__NAME;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ_LOCAL__COUNTER = AT_READ__COUNTER;

  /**
   * The number of structural features of the '<em>At Read Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_READ_LOCAL_FEATURE_COUNT = AT_READ_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterReadImpl <em>After Read</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterReadImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterRead()
   * @generated
   */
  int AFTER_READ = 18;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ__COUNTER = AFTER_LOCATION__COUNTER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ__NAME = AFTER_LOCATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>After Read</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ_FEATURE_COUNT = AFTER_LOCATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterReadFieldImpl <em>After Read Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterReadFieldImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterReadField()
   * @generated
   */
  int AFTER_READ_FIELD = 19;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ_FIELD__COUNTER = AFTER_READ__COUNTER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ_FIELD__NAME = AFTER_READ__NAME;

  /**
   * The number of structural features of the '<em>After Read Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ_FIELD_FEATURE_COUNT = AFTER_READ_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterReadLocalImpl <em>After Read Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterReadLocalImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterReadLocal()
   * @generated
   */
  int AFTER_READ_LOCAL = 20;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ_LOCAL__COUNTER = AFTER_READ__COUNTER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ_LOCAL__NAME = AFTER_READ__NAME;

  /**
   * The number of structural features of the '<em>After Read Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_READ_LOCAL_FEATURE_COUNT = AFTER_READ_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtWriteImpl <em>At Write</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtWriteImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtWrite()
   * @generated
   */
  int AT_WRITE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE__NAME = AT_LOCATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE__COUNTER = AT_LOCATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>At Write</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE_FEATURE_COUNT = AT_LOCATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtWriteFieldImpl <em>At Write Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtWriteFieldImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtWriteField()
   * @generated
   */
  int AT_WRITE_FIELD = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE_FIELD__NAME = AT_WRITE__NAME;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE_FIELD__COUNTER = AT_WRITE__COUNTER;

  /**
   * The number of structural features of the '<em>At Write Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE_FIELD_FEATURE_COUNT = AT_WRITE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtWriteLocalImpl <em>At Write Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtWriteLocalImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtWriteLocal()
   * @generated
   */
  int AT_WRITE_LOCAL = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE_LOCAL__NAME = AT_WRITE__NAME;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE_LOCAL__COUNTER = AT_WRITE__COUNTER;

  /**
   * The number of structural features of the '<em>At Write Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_WRITE_LOCAL_FEATURE_COUNT = AT_WRITE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterWriteImpl <em>After Write</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterWriteImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterWrite()
   * @generated
   */
  int AFTER_WRITE = 24;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE__COUNTER = AFTER_LOCATION__COUNTER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE__NAME = AFTER_LOCATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>After Write</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE_FEATURE_COUNT = AFTER_LOCATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterWriteFieldImpl <em>After Write Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterWriteFieldImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterWriteField()
   * @generated
   */
  int AFTER_WRITE_FIELD = 25;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE_FIELD__COUNTER = AFTER_WRITE__COUNTER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE_FIELD__NAME = AFTER_WRITE__NAME;

  /**
   * The number of structural features of the '<em>After Write Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE_FIELD_FEATURE_COUNT = AFTER_WRITE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterWriteLocalImpl <em>After Write Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterWriteLocalImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterWriteLocal()
   * @generated
   */
  int AFTER_WRITE_LOCAL = 26;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE_LOCAL__COUNTER = AFTER_WRITE__COUNTER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE_LOCAL__NAME = AFTER_WRITE__NAME;

  /**
   * The number of structural features of the '<em>After Write Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_WRITE_LOCAL_FEATURE_COUNT = AFTER_WRITE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtInvokeImpl <em>At Invoke</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtInvokeImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtInvoke()
   * @generated
   */
  int AT_INVOKE = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_INVOKE__NAME = AT_LOCATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_INVOKE__PARAMETER_TYPES = AT_LOCATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_INVOKE__COUNTER = AT_LOCATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>At Invoke</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_INVOKE_FEATURE_COUNT = AT_LOCATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterInvokeImpl <em>After Invoke</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterInvokeImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterInvoke()
   * @generated
   */
  int AFTER_INVOKE = 28;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_INVOKE__COUNTER = AFTER_LOCATION__COUNTER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_INVOKE__NAME = AFTER_LOCATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_INVOKE__PARAMETER_TYPES = AFTER_LOCATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>After Invoke</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_INVOKE_FEATURE_COUNT = AFTER_LOCATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtSynchronizeImpl <em>At Synchronize</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtSynchronizeImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtSynchronize()
   * @generated
   */
  int AT_SYNCHRONIZE = 29;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_SYNCHRONIZE__COUNTER = AT_LOCATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>At Synchronize</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_SYNCHRONIZE_FEATURE_COUNT = AT_LOCATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterSynchronizeImpl <em>After Synchronize</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AfterSynchronizeImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterSynchronize()
   * @generated
   */
  int AFTER_SYNCHRONIZE = 30;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_SYNCHRONIZE__COUNTER = AFTER_LOCATION__COUNTER;

  /**
   * The number of structural features of the '<em>After Synchronize</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_SYNCHRONIZE_FEATURE_COUNT = AFTER_LOCATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtThrowImpl <em>At Throw</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AtThrowImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtThrow()
   * @generated
   */
  int AT_THROW = 31;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_THROW__COUNTER = AT_LOCATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_THROW__NAME = AT_LOCATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>At Throw</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_THROW_FEATURE_COUNT = AT_LOCATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.ParameterTypesImpl <em>Parameter Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.ParameterTypesImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getParameterTypes()
   * @generated
   */
  int PARAMETER_TYPES = 32;

  /**
   * The feature id for the '<em><b>Param Type Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPES__PARAM_TYPE_NAMES = 0;

  /**
   * The number of structural features of the '<em>Parameter Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.BindImpl <em>Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.BindImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBind()
   * @generated
   */
  int BIND = 33;

  /**
   * The feature id for the '<em><b>Bind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND__BIND = 0;

  /**
   * The number of structural features of the '<em>Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.BindingsImpl <em>Bindings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.BindingsImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBindings()
   * @generated
   */
  int BINDINGS = 34;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDINGS__BINDINGS = 0;

  /**
   * The number of structural features of the '<em>Bindings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDINGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.BindingImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 35;

  /**
   * The feature id for the '<em><b>Bind Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__BIND_VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__VALUE = 1;

  /**
   * The feature id for the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TYPENAME = 2;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.ConditionImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 36;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.ActionsImpl <em>Actions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.ActionsImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getActions()
   * @generated
   */
  int ACTIONS = 37;

  /**
   * The feature id for the '<em><b>Action List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIONS__ACTION_LIST = 0;

  /**
   * The number of structural features of the '<em>Actions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.ActionListImpl <em>Action List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.ActionListImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getActionList()
   * @generated
   */
  int ACTION_LIST = 38;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_LIST__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Action List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.ActionImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAction()
   * @generated
   */
  int ACTION = 39;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.ExpressionImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERAND1 = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.CallArgumentsImpl <em>Call Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.CallArgumentsImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getCallArguments()
   * @generated
   */
  int CALL_ARGUMENTS = 41;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_ARGUMENTS__ARGS = 0;

  /**
   * The number of structural features of the '<em>Call Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AssignmentExprImpl <em>Assignment Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AssignmentExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAssignmentExpr()
   * @generated
   */
  int ASSIGNMENT_EXPR = 42;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPR__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assignment Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.OperatorExprImpl <em>Operator Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.OperatorExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getOperatorExpr()
   * @generated
   */
  int OPERATOR_EXPR = 43;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPR__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operator Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.PlusMinusOperandImpl <em>Plus Minus Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.PlusMinusOperandImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getPlusMinusOperand()
   * @generated
   */
  int PLUS_MINUS_OPERAND = 44;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_MINUS_OPERAND__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_MINUS_OPERAND__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_MINUS_OPERAND__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Plus Minus Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_MINUS_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.TimesDivOperandImpl <em>Times Div Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.TimesDivOperandImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getTimesDivOperand()
   * @generated
   */
  int TIMES_DIV_OPERAND = 45;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_DIV_OPERAND__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_DIV_OPERAND__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_DIV_OPERAND__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Times Div Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_DIV_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.BitwiseOperandImpl <em>Bitwise Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.BitwiseOperandImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBitwiseOperand()
   * @generated
   */
  int BITWISE_OPERAND = 46;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OPERAND__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OPERAND__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OPERAND__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bitwise Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.LogicalOperandImpl <em>Logical Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.LogicalOperandImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getLogicalOperand()
   * @generated
   */
  int LOGICAL_OPERAND = 47;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OPERAND__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OPERAND__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OPERAND__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Logical Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.AccessExprImpl <em>Access Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.AccessExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAccessExpr()
   * @generated
   */
  int ACCESS_EXPR = 48;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXPR__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXPR__ARGS = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Access Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.BuiltinExprImpl <em>Builtin Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.BuiltinExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBuiltinExpr()
   * @generated
   */
  int BUILTIN_EXPR = 49;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_EXPR__ARGS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Builtin Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.NewExprImpl <em>New Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.NewExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getNewExpr()
   * @generated
   */
  int NEW_EXPR = 50;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPR__PARAMS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>New Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.SimpleNameImpl <em>Simple Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.SimpleNameImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getSimpleName()
   * @generated
   */
  int SIMPLE_NAME = 51;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_NAME__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_NAME__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_NAME__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_NAME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.IndexedSpecialVarImpl <em>Indexed Special Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.IndexedSpecialVarImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getIndexedSpecialVar()
   * @generated
   */
  int INDEXED_SPECIAL_VAR = 52;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_SPECIAL_VAR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_SPECIAL_VAR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_SPECIAL_VAR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Indexed Special Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_SPECIAL_VAR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.SpecialVarImpl <em>Special Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.SpecialVarImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getSpecialVar()
   * @generated
   */
  int SPECIAL_VAR = 53;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_VAR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_VAR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_VAR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Special Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_VAR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.IntConstantExprImpl <em>Int Constant Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.IntConstantExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getIntConstantExpr()
   * @generated
   */
  int INT_CONSTANT_EXPR = 54;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Constant Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.StringConstantExprImpl <em>String Constant Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.StringConstantExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getStringConstantExpr()
   * @generated
   */
  int STRING_CONSTANT_EXPR = 55;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.BooleanConstantExprImpl <em>Boolean Constant Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.BooleanConstantExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBooleanConstantExpr()
   * @generated
   */
  int BOOLEAN_CONSTANT_EXPR = 56;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Constant Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jboss.byteman.eclipse.byteman.impl.FloatConstantExprImpl <em>Float Constant Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.byteman.eclipse.byteman.impl.FloatConstantExprImpl
   * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getFloatConstantExpr()
   * @generated
   */
  int FLOAT_CONSTANT_EXPR = 57;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT_EXPR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT_EXPR__OPERAND1 = EXPRESSION__OPERAND1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Constant Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.jboss.byteman.eclipse.byteman.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.jboss.byteman.eclipse.byteman.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.jboss.byteman.eclipse.byteman.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.BytemanRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BytemanRule
   * @generated
   */
  EClass getBytemanRule();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.BytemanRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BytemanRule#getName()
   * @see #getBytemanRule()
   * @generated
   */
  EAttribute getBytemanRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.BytemanRule#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BytemanRule#getEvent()
   * @see #getBytemanRule()
   * @generated
   */
  EReference getBytemanRule_Event();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.BytemanRule#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BytemanRule#getBody()
   * @see #getBytemanRule()
   * @generated
   */
  EReference getBytemanRule_Body();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Body#getBind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bind</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Body#getBind()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Bind();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Body#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Body#getCondition()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Body#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actions</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Body#getActions()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Actions();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Event#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Event#getClass_()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Class();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Event#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Event#getInterface()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Interface();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Event#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Event#getMethod()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Method();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Event#getHelper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Helper</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Event#getHelper()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Helper();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Event#getLocationSpec <em>Location Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location Spec</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Event#getLocationSpec()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_LocationSpec();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.EventClass <em>Event Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Class</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventClass
   * @generated
   */
  EClass getEventClass();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.EventClass#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventClass#getKeyword()
   * @see #getEventClass()
   * @generated
   */
  EAttribute getEventClass_Keyword();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.EventClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventClass#getName()
   * @see #getEventClass()
   * @generated
   */
  EAttribute getEventClass_Name();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.EventInterface <em>Event Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Interface</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventInterface
   * @generated
   */
  EClass getEventInterface();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.EventInterface#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventInterface#getKeyword()
   * @see #getEventInterface()
   * @generated
   */
  EAttribute getEventInterface_Keyword();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.EventInterface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventInterface#getName()
   * @see #getEventInterface()
   * @generated
   */
  EAttribute getEventInterface_Name();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.EventMethod <em>Event Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Method</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventMethod
   * @generated
   */
  EClass getEventMethod();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.EventMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventMethod#getName()
   * @see #getEventMethod()
   * @generated
   */
  EAttribute getEventMethod_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.EventMethod#getParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Types</em>'.
   * @see org.jboss.byteman.eclipse.byteman.EventMethod#getParameterTypes()
   * @see #getEventMethod()
   * @generated
   */
  EReference getEventMethod_ParameterTypes();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Helper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Helper</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Helper
   * @generated
   */
  EClass getHelper();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.Helper#getHelper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Helper</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Helper#getHelper()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Helper();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.LocationSpecifier <em>Location Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Specifier</em>'.
   * @see org.jboss.byteman.eclipse.byteman.LocationSpecifier
   * @generated
   */
  EClass getLocationSpecifier();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtLocation <em>At Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Location</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtLocation
   * @generated
   */
  EClass getAtLocation();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterLocation <em>After Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Location</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterLocation
   * @generated
   */
  EClass getAfterLocation();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AfterLocation#getCounter <em>Counter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Counter</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterLocation#getCounter()
   * @see #getAfterLocation()
   * @generated
   */
  EAttribute getAfterLocation_Counter();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtEntry <em>At Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Entry</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtEntry
   * @generated
   */
  EClass getAtEntry();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtExit <em>At Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Exit</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtExit
   * @generated
   */
  EClass getAtExit();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtLine <em>At Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Line</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtLine
   * @generated
   */
  EClass getAtLine();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtLine#getLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtLine#getLine()
   * @see #getAtLine()
   * @generated
   */
  EAttribute getAtLine_Line();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtRead <em>At Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Read</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtRead
   * @generated
   */
  EClass getAtRead();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtRead#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtRead#getName()
   * @see #getAtRead()
   * @generated
   */
  EAttribute getAtRead_Name();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtRead#getCounter <em>Counter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Counter</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtRead#getCounter()
   * @see #getAtRead()
   * @generated
   */
  EAttribute getAtRead_Counter();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtReadField <em>At Read Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Read Field</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtReadField
   * @generated
   */
  EClass getAtReadField();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtReadLocal <em>At Read Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Read Local</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtReadLocal
   * @generated
   */
  EClass getAtReadLocal();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterRead <em>After Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Read</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterRead
   * @generated
   */
  EClass getAfterRead();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AfterRead#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterRead#getName()
   * @see #getAfterRead()
   * @generated
   */
  EAttribute getAfterRead_Name();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterReadField <em>After Read Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Read Field</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterReadField
   * @generated
   */
  EClass getAfterReadField();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterReadLocal <em>After Read Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Read Local</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterReadLocal
   * @generated
   */
  EClass getAfterReadLocal();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtWrite <em>At Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Write</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtWrite
   * @generated
   */
  EClass getAtWrite();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtWrite#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtWrite#getName()
   * @see #getAtWrite()
   * @generated
   */
  EAttribute getAtWrite_Name();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtWrite#getCounter <em>Counter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Counter</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtWrite#getCounter()
   * @see #getAtWrite()
   * @generated
   */
  EAttribute getAtWrite_Counter();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtWriteField <em>At Write Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Write Field</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtWriteField
   * @generated
   */
  EClass getAtWriteField();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtWriteLocal <em>At Write Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Write Local</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtWriteLocal
   * @generated
   */
  EClass getAtWriteLocal();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterWrite <em>After Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Write</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterWrite
   * @generated
   */
  EClass getAfterWrite();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AfterWrite#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterWrite#getName()
   * @see #getAfterWrite()
   * @generated
   */
  EAttribute getAfterWrite_Name();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterWriteField <em>After Write Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Write Field</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterWriteField
   * @generated
   */
  EClass getAfterWriteField();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterWriteLocal <em>After Write Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Write Local</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterWriteLocal
   * @generated
   */
  EClass getAfterWriteLocal();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtInvoke <em>At Invoke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Invoke</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtInvoke
   * @generated
   */
  EClass getAtInvoke();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtInvoke#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtInvoke#getName()
   * @see #getAtInvoke()
   * @generated
   */
  EAttribute getAtInvoke_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.AtInvoke#getParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Types</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtInvoke#getParameterTypes()
   * @see #getAtInvoke()
   * @generated
   */
  EReference getAtInvoke_ParameterTypes();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtInvoke#getCounter <em>Counter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Counter</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtInvoke#getCounter()
   * @see #getAtInvoke()
   * @generated
   */
  EAttribute getAtInvoke_Counter();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterInvoke <em>After Invoke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Invoke</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterInvoke
   * @generated
   */
  EClass getAfterInvoke();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AfterInvoke#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterInvoke#getName()
   * @see #getAfterInvoke()
   * @generated
   */
  EAttribute getAfterInvoke_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.AfterInvoke#getParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Types</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterInvoke#getParameterTypes()
   * @see #getAfterInvoke()
   * @generated
   */
  EReference getAfterInvoke_ParameterTypes();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtSynchronize <em>At Synchronize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Synchronize</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtSynchronize
   * @generated
   */
  EClass getAtSynchronize();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtSynchronize#getCounter <em>Counter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Counter</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtSynchronize#getCounter()
   * @see #getAtSynchronize()
   * @generated
   */
  EAttribute getAtSynchronize_Counter();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AfterSynchronize <em>After Synchronize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Synchronize</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AfterSynchronize
   * @generated
   */
  EClass getAfterSynchronize();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AtThrow <em>At Throw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Throw</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtThrow
   * @generated
   */
  EClass getAtThrow();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AtThrow#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AtThrow#getName()
   * @see #getAtThrow()
   * @generated
   */
  EAttribute getAtThrow_Name();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.ParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Types</em>'.
   * @see org.jboss.byteman.eclipse.byteman.ParameterTypes
   * @generated
   */
  EClass getParameterTypes();

  /**
   * Returns the meta object for the attribute list '{@link org.jboss.byteman.eclipse.byteman.ParameterTypes#getParamTypeNames <em>Param Type Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Param Type Names</em>'.
   * @see org.jboss.byteman.eclipse.byteman.ParameterTypes#getParamTypeNames()
   * @see #getParameterTypes()
   * @generated
   */
  EAttribute getParameterTypes_ParamTypeNames();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Bind
   * @generated
   */
  EClass getBind();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Bind#getBind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bind</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Bind#getBind()
   * @see #getBind()
   * @generated
   */
  EReference getBind_Bind();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Bindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bindings</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Bindings
   * @generated
   */
  EClass getBindings();

  /**
   * Returns the meta object for the containment reference list '{@link org.jboss.byteman.eclipse.byteman.Bindings#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Bindings#getBindings()
   * @see #getBindings()
   * @generated
   */
  EReference getBindings_Bindings();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.Binding#getBindVariable <em>Bind Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bind Variable</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Binding#getBindVariable()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_BindVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Binding#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Binding#getValue()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Value();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.Binding#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typename</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Binding#getTypename()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Typename();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Actions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actions</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Actions
   * @generated
   */
  EClass getActions();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Actions#getActionList <em>Action List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action List</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Actions#getActionList()
   * @see #getActions()
   * @generated
   */
  EReference getActions_ActionList();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.ActionList <em>Action List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action List</em>'.
   * @see org.jboss.byteman.eclipse.byteman.ActionList
   * @generated
   */
  EClass getActionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.jboss.byteman.eclipse.byteman.ActionList#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.jboss.byteman.eclipse.byteman.ActionList#getActions()
   * @see #getActionList()
   * @generated
   */
  EReference getActionList_Actions();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.Expression#getOperand1 <em>Operand1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand1</em>'.
   * @see org.jboss.byteman.eclipse.byteman.Expression#getOperand1()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Operand1();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.CallArguments <em>Call Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Arguments</em>'.
   * @see org.jboss.byteman.eclipse.byteman.CallArguments
   * @generated
   */
  EClass getCallArguments();

  /**
   * Returns the meta object for the containment reference list '{@link org.jboss.byteman.eclipse.byteman.CallArguments#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.jboss.byteman.eclipse.byteman.CallArguments#getArgs()
   * @see #getCallArguments()
   * @generated
   */
  EReference getCallArguments_Args();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AssignmentExpr <em>Assignment Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AssignmentExpr
   * @generated
   */
  EClass getAssignmentExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.AssignmentExpr#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand2</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AssignmentExpr#getOperand2()
   * @see #getAssignmentExpr()
   * @generated
   */
  EReference getAssignmentExpr_Operand2();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.OperatorExpr <em>Operator Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.OperatorExpr
   * @generated
   */
  EClass getOperatorExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.OperatorExpr#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand2</em>'.
   * @see org.jboss.byteman.eclipse.byteman.OperatorExpr#getOperand2()
   * @see #getOperatorExpr()
   * @generated
   */
  EReference getOperatorExpr_Operand2();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.PlusMinusOperand <em>Plus Minus Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Minus Operand</em>'.
   * @see org.jboss.byteman.eclipse.byteman.PlusMinusOperand
   * @generated
   */
  EClass getPlusMinusOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.PlusMinusOperand#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand2</em>'.
   * @see org.jboss.byteman.eclipse.byteman.PlusMinusOperand#getOperand2()
   * @see #getPlusMinusOperand()
   * @generated
   */
  EReference getPlusMinusOperand_Operand2();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.TimesDivOperand <em>Times Div Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Times Div Operand</em>'.
   * @see org.jboss.byteman.eclipse.byteman.TimesDivOperand
   * @generated
   */
  EClass getTimesDivOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.TimesDivOperand#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand2</em>'.
   * @see org.jboss.byteman.eclipse.byteman.TimesDivOperand#getOperand2()
   * @see #getTimesDivOperand()
   * @generated
   */
  EReference getTimesDivOperand_Operand2();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.BitwiseOperand <em>Bitwise Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise Operand</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BitwiseOperand
   * @generated
   */
  EClass getBitwiseOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.BitwiseOperand#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand2</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BitwiseOperand#getOperand2()
   * @see #getBitwiseOperand()
   * @generated
   */
  EReference getBitwiseOperand_Operand2();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.LogicalOperand <em>Logical Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Operand</em>'.
   * @see org.jboss.byteman.eclipse.byteman.LogicalOperand
   * @generated
   */
  EClass getLogicalOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.LogicalOperand#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand2</em>'.
   * @see org.jboss.byteman.eclipse.byteman.LogicalOperand#getOperand2()
   * @see #getLogicalOperand()
   * @generated
   */
  EReference getLogicalOperand_Operand2();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.AccessExpr <em>Access Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AccessExpr
   * @generated
   */
  EClass getAccessExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.AccessExpr#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand2</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AccessExpr#getOperand2()
   * @see #getAccessExpr()
   * @generated
   */
  EReference getAccessExpr_Operand2();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.AccessExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AccessExpr#getValue()
   * @see #getAccessExpr()
   * @generated
   */
  EAttribute getAccessExpr_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.AccessExpr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see org.jboss.byteman.eclipse.byteman.AccessExpr#getArgs()
   * @see #getAccessExpr()
   * @generated
   */
  EReference getAccessExpr_Args();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.BuiltinExpr <em>Builtin Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Builtin Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BuiltinExpr
   * @generated
   */
  EClass getBuiltinExpr();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.BuiltinExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BuiltinExpr#getValue()
   * @see #getBuiltinExpr()
   * @generated
   */
  EAttribute getBuiltinExpr_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.BuiltinExpr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BuiltinExpr#getArgs()
   * @see #getBuiltinExpr()
   * @generated
   */
  EReference getBuiltinExpr_Args();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.NewExpr <em>New Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.NewExpr
   * @generated
   */
  EClass getNewExpr();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.NewExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.NewExpr#getValue()
   * @see #getNewExpr()
   * @generated
   */
  EAttribute getNewExpr_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.byteman.eclipse.byteman.NewExpr#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.jboss.byteman.eclipse.byteman.NewExpr#getParams()
   * @see #getNewExpr()
   * @generated
   */
  EReference getNewExpr_Params();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.SimpleName <em>Simple Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Name</em>'.
   * @see org.jboss.byteman.eclipse.byteman.SimpleName
   * @generated
   */
  EClass getSimpleName();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.SimpleName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.SimpleName#getValue()
   * @see #getSimpleName()
   * @generated
   */
  EAttribute getSimpleName_Value();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.IndexedSpecialVar <em>Indexed Special Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed Special Var</em>'.
   * @see org.jboss.byteman.eclipse.byteman.IndexedSpecialVar
   * @generated
   */
  EClass getIndexedSpecialVar();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.IndexedSpecialVar#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.IndexedSpecialVar#getValue()
   * @see #getIndexedSpecialVar()
   * @generated
   */
  EAttribute getIndexedSpecialVar_Value();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.SpecialVar <em>Special Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Special Var</em>'.
   * @see org.jboss.byteman.eclipse.byteman.SpecialVar
   * @generated
   */
  EClass getSpecialVar();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.SpecialVar#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.SpecialVar#getValue()
   * @see #getSpecialVar()
   * @generated
   */
  EAttribute getSpecialVar_Value();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.IntConstantExpr <em>Int Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Constant Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.IntConstantExpr
   * @generated
   */
  EClass getIntConstantExpr();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.IntConstantExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.IntConstantExpr#getValue()
   * @see #getIntConstantExpr()
   * @generated
   */
  EAttribute getIntConstantExpr_Value();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.StringConstantExpr <em>String Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constant Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.StringConstantExpr
   * @generated
   */
  EClass getStringConstantExpr();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.StringConstantExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.StringConstantExpr#getValue()
   * @see #getStringConstantExpr()
   * @generated
   */
  EAttribute getStringConstantExpr_Value();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.BooleanConstantExpr <em>Boolean Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Constant Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BooleanConstantExpr
   * @generated
   */
  EClass getBooleanConstantExpr();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.BooleanConstantExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.BooleanConstantExpr#getValue()
   * @see #getBooleanConstantExpr()
   * @generated
   */
  EAttribute getBooleanConstantExpr_Value();

  /**
   * Returns the meta object for class '{@link org.jboss.byteman.eclipse.byteman.FloatConstantExpr <em>Float Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Constant Expr</em>'.
   * @see org.jboss.byteman.eclipse.byteman.FloatConstantExpr
   * @generated
   */
  EClass getFloatConstantExpr();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.byteman.eclipse.byteman.FloatConstantExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.byteman.eclipse.byteman.FloatConstantExpr#getValue()
   * @see #getFloatConstantExpr()
   * @generated
   */
  EAttribute getFloatConstantExpr_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BytemanFactory getBytemanFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.DomainModelImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ELEMENTS = eINSTANCE.getDomainModel_Elements();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.ElementImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.BytemanRuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanRuleImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBytemanRule()
     * @generated
     */
    EClass BYTEMAN_RULE = eINSTANCE.getBytemanRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BYTEMAN_RULE__NAME = eINSTANCE.getBytemanRule_Name();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BYTEMAN_RULE__EVENT = eINSTANCE.getBytemanRule_Event();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BYTEMAN_RULE__BODY = eINSTANCE.getBytemanRule_Body();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.BodyImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Bind</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__BIND = eINSTANCE.getBody_Bind();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__CONDITION = eINSTANCE.getBody_Condition();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__ACTIONS = eINSTANCE.getBody_Actions();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.EventImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__CLASS = eINSTANCE.getEvent_Class();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__INTERFACE = eINSTANCE.getEvent_Interface();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__METHOD = eINSTANCE.getEvent_Method();

    /**
     * The meta object literal for the '<em><b>Helper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__HELPER = eINSTANCE.getEvent_Helper();

    /**
     * The meta object literal for the '<em><b>Location Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__LOCATION_SPEC = eINSTANCE.getEvent_LocationSpec();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.EventClassImpl <em>Event Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.EventClassImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getEventClass()
     * @generated
     */
    EClass EVENT_CLASS = eINSTANCE.getEventClass();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_CLASS__KEYWORD = eINSTANCE.getEventClass_Keyword();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_CLASS__NAME = eINSTANCE.getEventClass_Name();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.EventInterfaceImpl <em>Event Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.EventInterfaceImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getEventInterface()
     * @generated
     */
    EClass EVENT_INTERFACE = eINSTANCE.getEventInterface();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_INTERFACE__KEYWORD = eINSTANCE.getEventInterface_Keyword();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_INTERFACE__NAME = eINSTANCE.getEventInterface_Name();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.EventMethodImpl <em>Event Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.EventMethodImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getEventMethod()
     * @generated
     */
    EClass EVENT_METHOD = eINSTANCE.getEventMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_METHOD__NAME = eINSTANCE.getEventMethod_Name();

    /**
     * The meta object literal for the '<em><b>Parameter Types</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_METHOD__PARAMETER_TYPES = eINSTANCE.getEventMethod_ParameterTypes();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.HelperImpl <em>Helper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.HelperImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getHelper()
     * @generated
     */
    EClass HELPER = eINSTANCE.getHelper();

    /**
     * The meta object literal for the '<em><b>Helper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__HELPER = eINSTANCE.getHelper_Helper();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.LocationSpecifierImpl <em>Location Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.LocationSpecifierImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getLocationSpecifier()
     * @generated
     */
    EClass LOCATION_SPECIFIER = eINSTANCE.getLocationSpecifier();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtLocationImpl <em>At Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtLocationImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtLocation()
     * @generated
     */
    EClass AT_LOCATION = eINSTANCE.getAtLocation();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterLocationImpl <em>After Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterLocationImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterLocation()
     * @generated
     */
    EClass AFTER_LOCATION = eINSTANCE.getAfterLocation();

    /**
     * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AFTER_LOCATION__COUNTER = eINSTANCE.getAfterLocation_Counter();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtEntryImpl <em>At Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtEntryImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtEntry()
     * @generated
     */
    EClass AT_ENTRY = eINSTANCE.getAtEntry();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtExitImpl <em>At Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtExitImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtExit()
     * @generated
     */
    EClass AT_EXIT = eINSTANCE.getAtExit();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtLineImpl <em>At Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtLineImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtLine()
     * @generated
     */
    EClass AT_LINE = eINSTANCE.getAtLine();

    /**
     * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_LINE__LINE = eINSTANCE.getAtLine_Line();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtReadImpl <em>At Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtReadImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtRead()
     * @generated
     */
    EClass AT_READ = eINSTANCE.getAtRead();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_READ__NAME = eINSTANCE.getAtRead_Name();

    /**
     * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_READ__COUNTER = eINSTANCE.getAtRead_Counter();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtReadFieldImpl <em>At Read Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtReadFieldImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtReadField()
     * @generated
     */
    EClass AT_READ_FIELD = eINSTANCE.getAtReadField();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtReadLocalImpl <em>At Read Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtReadLocalImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtReadLocal()
     * @generated
     */
    EClass AT_READ_LOCAL = eINSTANCE.getAtReadLocal();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterReadImpl <em>After Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterReadImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterRead()
     * @generated
     */
    EClass AFTER_READ = eINSTANCE.getAfterRead();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AFTER_READ__NAME = eINSTANCE.getAfterRead_Name();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterReadFieldImpl <em>After Read Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterReadFieldImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterReadField()
     * @generated
     */
    EClass AFTER_READ_FIELD = eINSTANCE.getAfterReadField();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterReadLocalImpl <em>After Read Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterReadLocalImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterReadLocal()
     * @generated
     */
    EClass AFTER_READ_LOCAL = eINSTANCE.getAfterReadLocal();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtWriteImpl <em>At Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtWriteImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtWrite()
     * @generated
     */
    EClass AT_WRITE = eINSTANCE.getAtWrite();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_WRITE__NAME = eINSTANCE.getAtWrite_Name();

    /**
     * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_WRITE__COUNTER = eINSTANCE.getAtWrite_Counter();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtWriteFieldImpl <em>At Write Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtWriteFieldImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtWriteField()
     * @generated
     */
    EClass AT_WRITE_FIELD = eINSTANCE.getAtWriteField();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtWriteLocalImpl <em>At Write Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtWriteLocalImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtWriteLocal()
     * @generated
     */
    EClass AT_WRITE_LOCAL = eINSTANCE.getAtWriteLocal();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterWriteImpl <em>After Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterWriteImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterWrite()
     * @generated
     */
    EClass AFTER_WRITE = eINSTANCE.getAfterWrite();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AFTER_WRITE__NAME = eINSTANCE.getAfterWrite_Name();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterWriteFieldImpl <em>After Write Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterWriteFieldImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterWriteField()
     * @generated
     */
    EClass AFTER_WRITE_FIELD = eINSTANCE.getAfterWriteField();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterWriteLocalImpl <em>After Write Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterWriteLocalImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterWriteLocal()
     * @generated
     */
    EClass AFTER_WRITE_LOCAL = eINSTANCE.getAfterWriteLocal();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtInvokeImpl <em>At Invoke</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtInvokeImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtInvoke()
     * @generated
     */
    EClass AT_INVOKE = eINSTANCE.getAtInvoke();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_INVOKE__NAME = eINSTANCE.getAtInvoke_Name();

    /**
     * The meta object literal for the '<em><b>Parameter Types</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT_INVOKE__PARAMETER_TYPES = eINSTANCE.getAtInvoke_ParameterTypes();

    /**
     * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_INVOKE__COUNTER = eINSTANCE.getAtInvoke_Counter();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterInvokeImpl <em>After Invoke</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterInvokeImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterInvoke()
     * @generated
     */
    EClass AFTER_INVOKE = eINSTANCE.getAfterInvoke();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AFTER_INVOKE__NAME = eINSTANCE.getAfterInvoke_Name();

    /**
     * The meta object literal for the '<em><b>Parameter Types</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFTER_INVOKE__PARAMETER_TYPES = eINSTANCE.getAfterInvoke_ParameterTypes();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtSynchronizeImpl <em>At Synchronize</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtSynchronizeImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtSynchronize()
     * @generated
     */
    EClass AT_SYNCHRONIZE = eINSTANCE.getAtSynchronize();

    /**
     * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_SYNCHRONIZE__COUNTER = eINSTANCE.getAtSynchronize_Counter();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AfterSynchronizeImpl <em>After Synchronize</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AfterSynchronizeImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAfterSynchronize()
     * @generated
     */
    EClass AFTER_SYNCHRONIZE = eINSTANCE.getAfterSynchronize();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AtThrowImpl <em>At Throw</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AtThrowImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAtThrow()
     * @generated
     */
    EClass AT_THROW = eINSTANCE.getAtThrow();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_THROW__NAME = eINSTANCE.getAtThrow_Name();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.ParameterTypesImpl <em>Parameter Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.ParameterTypesImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getParameterTypes()
     * @generated
     */
    EClass PARAMETER_TYPES = eINSTANCE.getParameterTypes();

    /**
     * The meta object literal for the '<em><b>Param Type Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_TYPES__PARAM_TYPE_NAMES = eINSTANCE.getParameterTypes_ParamTypeNames();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.BindImpl <em>Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.BindImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBind()
     * @generated
     */
    EClass BIND = eINSTANCE.getBind();

    /**
     * The meta object literal for the '<em><b>Bind</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND__BIND = eINSTANCE.getBind_Bind();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.BindingsImpl <em>Bindings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.BindingsImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBindings()
     * @generated
     */
    EClass BINDINGS = eINSTANCE.getBindings();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDINGS__BINDINGS = eINSTANCE.getBindings_Bindings();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.BindingImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Bind Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__BIND_VARIABLE = eINSTANCE.getBinding_BindVariable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__VALUE = eINSTANCE.getBinding_Value();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__TYPENAME = eINSTANCE.getBinding_Typename();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.ConditionImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.ActionsImpl <em>Actions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.ActionsImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getActions()
     * @generated
     */
    EClass ACTIONS = eINSTANCE.getActions();

    /**
     * The meta object literal for the '<em><b>Action List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIONS__ACTION_LIST = eINSTANCE.getActions_ActionList();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.ActionListImpl <em>Action List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.ActionListImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getActionList()
     * @generated
     */
    EClass ACTION_LIST = eINSTANCE.getActionList();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_LIST__ACTIONS = eINSTANCE.getActionList_Actions();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.ActionImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.ExpressionImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OP = eINSTANCE.getExpression_Op();

    /**
     * The meta object literal for the '<em><b>Operand1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__OPERAND1 = eINSTANCE.getExpression_Operand1();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.CallArgumentsImpl <em>Call Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.CallArgumentsImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getCallArguments()
     * @generated
     */
    EClass CALL_ARGUMENTS = eINSTANCE.getCallArguments();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_ARGUMENTS__ARGS = eINSTANCE.getCallArguments_Args();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AssignmentExprImpl <em>Assignment Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AssignmentExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAssignmentExpr()
     * @generated
     */
    EClass ASSIGNMENT_EXPR = eINSTANCE.getAssignmentExpr();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPR__OPERAND2 = eINSTANCE.getAssignmentExpr_Operand2();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.OperatorExprImpl <em>Operator Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.OperatorExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getOperatorExpr()
     * @generated
     */
    EClass OPERATOR_EXPR = eINSTANCE.getOperatorExpr();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR_EXPR__OPERAND2 = eINSTANCE.getOperatorExpr_Operand2();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.PlusMinusOperandImpl <em>Plus Minus Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.PlusMinusOperandImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getPlusMinusOperand()
     * @generated
     */
    EClass PLUS_MINUS_OPERAND = eINSTANCE.getPlusMinusOperand();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS_MINUS_OPERAND__OPERAND2 = eINSTANCE.getPlusMinusOperand_Operand2();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.TimesDivOperandImpl <em>Times Div Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.TimesDivOperandImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getTimesDivOperand()
     * @generated
     */
    EClass TIMES_DIV_OPERAND = eINSTANCE.getTimesDivOperand();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIMES_DIV_OPERAND__OPERAND2 = eINSTANCE.getTimesDivOperand_Operand2();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.BitwiseOperandImpl <em>Bitwise Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.BitwiseOperandImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBitwiseOperand()
     * @generated
     */
    EClass BITWISE_OPERAND = eINSTANCE.getBitwiseOperand();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_OPERAND__OPERAND2 = eINSTANCE.getBitwiseOperand_Operand2();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.LogicalOperandImpl <em>Logical Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.LogicalOperandImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getLogicalOperand()
     * @generated
     */
    EClass LOGICAL_OPERAND = eINSTANCE.getLogicalOperand();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OPERAND__OPERAND2 = eINSTANCE.getLogicalOperand_Operand2();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.AccessExprImpl <em>Access Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.AccessExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getAccessExpr()
     * @generated
     */
    EClass ACCESS_EXPR = eINSTANCE.getAccessExpr();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_EXPR__OPERAND2 = eINSTANCE.getAccessExpr_Operand2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCESS_EXPR__VALUE = eINSTANCE.getAccessExpr_Value();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_EXPR__ARGS = eINSTANCE.getAccessExpr_Args();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.BuiltinExprImpl <em>Builtin Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.BuiltinExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBuiltinExpr()
     * @generated
     */
    EClass BUILTIN_EXPR = eINSTANCE.getBuiltinExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILTIN_EXPR__VALUE = eINSTANCE.getBuiltinExpr_Value();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILTIN_EXPR__ARGS = eINSTANCE.getBuiltinExpr_Args();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.NewExprImpl <em>New Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.NewExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getNewExpr()
     * @generated
     */
    EClass NEW_EXPR = eINSTANCE.getNewExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_EXPR__VALUE = eINSTANCE.getNewExpr_Value();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_EXPR__PARAMS = eINSTANCE.getNewExpr_Params();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.SimpleNameImpl <em>Simple Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.SimpleNameImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getSimpleName()
     * @generated
     */
    EClass SIMPLE_NAME = eINSTANCE.getSimpleName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_NAME__VALUE = eINSTANCE.getSimpleName_Value();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.IndexedSpecialVarImpl <em>Indexed Special Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.IndexedSpecialVarImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getIndexedSpecialVar()
     * @generated
     */
    EClass INDEXED_SPECIAL_VAR = eINSTANCE.getIndexedSpecialVar();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEXED_SPECIAL_VAR__VALUE = eINSTANCE.getIndexedSpecialVar_Value();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.SpecialVarImpl <em>Special Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.SpecialVarImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getSpecialVar()
     * @generated
     */
    EClass SPECIAL_VAR = eINSTANCE.getSpecialVar();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIAL_VAR__VALUE = eINSTANCE.getSpecialVar_Value();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.IntConstantExprImpl <em>Int Constant Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.IntConstantExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getIntConstantExpr()
     * @generated
     */
    EClass INT_CONSTANT_EXPR = eINSTANCE.getIntConstantExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_CONSTANT_EXPR__VALUE = eINSTANCE.getIntConstantExpr_Value();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.StringConstantExprImpl <em>String Constant Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.StringConstantExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getStringConstantExpr()
     * @generated
     */
    EClass STRING_CONSTANT_EXPR = eINSTANCE.getStringConstantExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTANT_EXPR__VALUE = eINSTANCE.getStringConstantExpr_Value();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.BooleanConstantExprImpl <em>Boolean Constant Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.BooleanConstantExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getBooleanConstantExpr()
     * @generated
     */
    EClass BOOLEAN_CONSTANT_EXPR = eINSTANCE.getBooleanConstantExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_CONSTANT_EXPR__VALUE = eINSTANCE.getBooleanConstantExpr_Value();

    /**
     * The meta object literal for the '{@link org.jboss.byteman.eclipse.byteman.impl.FloatConstantExprImpl <em>Float Constant Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.byteman.eclipse.byteman.impl.FloatConstantExprImpl
     * @see org.jboss.byteman.eclipse.byteman.impl.BytemanPackageImpl#getFloatConstantExpr()
     * @generated
     */
    EClass FLOAT_CONSTANT_EXPR = eINSTANCE.getFloatConstantExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_CONSTANT_EXPR__VALUE = eINSTANCE.getFloatConstantExpr_Value();

  }

} //BytemanPackage
