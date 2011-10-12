/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.jboss.byteman.eclipse.byteman.AccessExpr;
import org.jboss.byteman.eclipse.byteman.Action;
import org.jboss.byteman.eclipse.byteman.ActionList;
import org.jboss.byteman.eclipse.byteman.Actions;
import org.jboss.byteman.eclipse.byteman.AfterInvoke;
import org.jboss.byteman.eclipse.byteman.AfterLocation;
import org.jboss.byteman.eclipse.byteman.AfterRead;
import org.jboss.byteman.eclipse.byteman.AfterReadField;
import org.jboss.byteman.eclipse.byteman.AfterReadLocal;
import org.jboss.byteman.eclipse.byteman.AfterSynchronize;
import org.jboss.byteman.eclipse.byteman.AfterWrite;
import org.jboss.byteman.eclipse.byteman.AfterWriteField;
import org.jboss.byteman.eclipse.byteman.AfterWriteLocal;
import org.jboss.byteman.eclipse.byteman.AssignmentExpr;
import org.jboss.byteman.eclipse.byteman.AtEntry;
import org.jboss.byteman.eclipse.byteman.AtExit;
import org.jboss.byteman.eclipse.byteman.AtInvoke;
import org.jboss.byteman.eclipse.byteman.AtLine;
import org.jboss.byteman.eclipse.byteman.AtLocation;
import org.jboss.byteman.eclipse.byteman.AtRead;
import org.jboss.byteman.eclipse.byteman.AtReadField;
import org.jboss.byteman.eclipse.byteman.AtReadLocal;
import org.jboss.byteman.eclipse.byteman.AtSynchronize;
import org.jboss.byteman.eclipse.byteman.AtThrow;
import org.jboss.byteman.eclipse.byteman.AtWrite;
import org.jboss.byteman.eclipse.byteman.AtWriteField;
import org.jboss.byteman.eclipse.byteman.AtWriteLocal;
import org.jboss.byteman.eclipse.byteman.Bind;
import org.jboss.byteman.eclipse.byteman.Binding;
import org.jboss.byteman.eclipse.byteman.Bindings;
import org.jboss.byteman.eclipse.byteman.BitwiseOperand;
import org.jboss.byteman.eclipse.byteman.Body;
import org.jboss.byteman.eclipse.byteman.BooleanConstantExpr;
import org.jboss.byteman.eclipse.byteman.BuiltinExpr;
import org.jboss.byteman.eclipse.byteman.BytemanFactory;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.BytemanRule;
import org.jboss.byteman.eclipse.byteman.CallArguments;
import org.jboss.byteman.eclipse.byteman.Condition;
import org.jboss.byteman.eclipse.byteman.DomainModel;
import org.jboss.byteman.eclipse.byteman.Element;
import org.jboss.byteman.eclipse.byteman.Event;
import org.jboss.byteman.eclipse.byteman.EventClass;
import org.jboss.byteman.eclipse.byteman.EventInterface;
import org.jboss.byteman.eclipse.byteman.EventMethod;
import org.jboss.byteman.eclipse.byteman.Expression;
import org.jboss.byteman.eclipse.byteman.FloatConstantExpr;
import org.jboss.byteman.eclipse.byteman.Helper;
import org.jboss.byteman.eclipse.byteman.IntConstantExpr;
import org.jboss.byteman.eclipse.byteman.LocationSpecifier;
import org.jboss.byteman.eclipse.byteman.LogicalOperand;
import org.jboss.byteman.eclipse.byteman.NewExpr;
import org.jboss.byteman.eclipse.byteman.OperatorExpr;
import org.jboss.byteman.eclipse.byteman.ParameterTypes;
import org.jboss.byteman.eclipse.byteman.PlusMinusOperand;
import org.jboss.byteman.eclipse.byteman.StringConstantExpr;
import org.jboss.byteman.eclipse.byteman.TimesDivOperand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BytemanPackageImpl extends EPackageImpl implements BytemanPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bytemanRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventInterfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationSpecifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atLocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterLocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atExitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atLineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atReadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atReadFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atReadLocalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterReadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterReadFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterReadLocalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atWriteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atWriteFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atWriteLocalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterWriteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterWriteFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterWriteLocalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atInvokeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterInvokeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atSynchronizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterSynchronizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atThrowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterTypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callArgumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusMinusOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timesDivOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitwiseOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtinExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConstantExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanConstantExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatConstantExprEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.jboss.byteman.eclipse.byteman.BytemanPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BytemanPackageImpl()
  {
    super(eNS_URI, BytemanFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BytemanPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BytemanPackage init()
  {
    if (isInited) return (BytemanPackage)EPackage.Registry.INSTANCE.getEPackage(BytemanPackage.eNS_URI);

    // Obtain or create and register package
    BytemanPackageImpl theBytemanPackage = (BytemanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BytemanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BytemanPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBytemanPackage.createPackageContents();

    // Initialize created meta-data
    theBytemanPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBytemanPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BytemanPackage.eNS_URI, theBytemanPackage);
    return theBytemanPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainModel()
  {
    return domainModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModel_Elements()
  {
    return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBytemanRule()
  {
    return bytemanRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBytemanRule_Name()
  {
    return (EAttribute)bytemanRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBytemanRule_Event()
  {
    return (EReference)bytemanRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBytemanRule_Body()
  {
    return (EReference)bytemanRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Bind()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Condition()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Actions()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Class()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Interface()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Method()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Helper()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_LocationSpec()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventClass()
  {
    return eventClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventClass_Keyword()
  {
    return (EAttribute)eventClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventClass_Name()
  {
    return (EAttribute)eventClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventInterface()
  {
    return eventInterfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventInterface_Keyword()
  {
    return (EAttribute)eventInterfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventInterface_Name()
  {
    return (EAttribute)eventInterfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventMethod()
  {
    return eventMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventMethod_Name()
  {
    return (EAttribute)eventMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventMethod_ParameterTypes()
  {
    return (EReference)eventMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelper()
  {
    return helperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Helper()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationSpecifier()
  {
    return locationSpecifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtLocation()
  {
    return atLocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterLocation()
  {
    return afterLocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAfterLocation_Counter()
  {
    return (EAttribute)afterLocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtEntry()
  {
    return atEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtExit()
  {
    return atExitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtLine()
  {
    return atLineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtLine_Line()
  {
    return (EAttribute)atLineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtRead()
  {
    return atReadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtRead_Name()
  {
    return (EAttribute)atReadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtRead_Counter()
  {
    return (EAttribute)atReadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtReadField()
  {
    return atReadFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtReadLocal()
  {
    return atReadLocalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterRead()
  {
    return afterReadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAfterRead_Name()
  {
    return (EAttribute)afterReadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterReadField()
  {
    return afterReadFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterReadLocal()
  {
    return afterReadLocalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtWrite()
  {
    return atWriteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtWrite_Name()
  {
    return (EAttribute)atWriteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtWrite_Counter()
  {
    return (EAttribute)atWriteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtWriteField()
  {
    return atWriteFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtWriteLocal()
  {
    return atWriteLocalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterWrite()
  {
    return afterWriteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAfterWrite_Name()
  {
    return (EAttribute)afterWriteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterWriteField()
  {
    return afterWriteFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterWriteLocal()
  {
    return afterWriteLocalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtInvoke()
  {
    return atInvokeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtInvoke_Name()
  {
    return (EAttribute)atInvokeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtInvoke_ParameterTypes()
  {
    return (EReference)atInvokeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtInvoke_Counter()
  {
    return (EAttribute)atInvokeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterInvoke()
  {
    return afterInvokeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAfterInvoke_Name()
  {
    return (EAttribute)afterInvokeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAfterInvoke_ParameterTypes()
  {
    return (EReference)afterInvokeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtSynchronize()
  {
    return atSynchronizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtSynchronize_Counter()
  {
    return (EAttribute)atSynchronizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterSynchronize()
  {
    return afterSynchronizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtThrow()
  {
    return atThrowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtThrow_Name()
  {
    return (EAttribute)atThrowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterTypes()
  {
    return parameterTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterTypes_ParamTypeNames()
  {
    return (EAttribute)parameterTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBind()
  {
    return bindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBind_Bind()
  {
    return (EReference)bindEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindings()
  {
    return bindingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindings_Bindings()
  {
    return (EReference)bindingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding()
  {
    return bindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinding_BindVariable()
  {
    return (EAttribute)bindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinding_Typename()
  {
    return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_Value()
  {
    return (EReference)bindingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActions()
  {
    return actionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActions_ActionList()
  {
    return (EReference)actionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionList()
  {
    return actionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionList_Actions()
  {
    return (EReference)actionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Op()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Operand1()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Value()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallArguments()
  {
    return callArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallArguments_Args()
  {
    return (EReference)callArgumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentExpr()
  {
    return assignmentExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentExpr_Operand2()
  {
    return (EReference)assignmentExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorExpr()
  {
    return operatorExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperatorExpr_Operand2()
  {
    return (EReference)operatorExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlusMinusOperand()
  {
    return plusMinusOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlusMinusOperand_Operand2()
  {
    return (EReference)plusMinusOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimesDivOperand()
  {
    return timesDivOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimesDivOperand_Operand2()
  {
    return (EReference)timesDivOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitwiseOperand()
  {
    return bitwiseOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitwiseOperand_Operand2()
  {
    return (EReference)bitwiseOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalOperand()
  {
    return logicalOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalOperand_Operand2()
  {
    return (EReference)logicalOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessExpr()
  {
    return accessExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessExpr_Operand2()
  {
    return (EReference)accessExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessExpr_Args()
  {
    return (EReference)accessExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltinExpr()
  {
    return builtinExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltinExpr_Args()
  {
    return (EReference)builtinExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewExpr()
  {
    return newExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewExpr_Params()
  {
    return (EReference)newExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntConstantExpr()
  {
    return intConstantExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringConstantExpr()
  {
    return stringConstantExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanConstantExpr()
  {
    return booleanConstantExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatConstantExpr()
  {
    return floatConstantExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BytemanFactory getBytemanFactory()
  {
    return (BytemanFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainModelEClass = createEClass(DOMAIN_MODEL);
    createEReference(domainModelEClass, DOMAIN_MODEL__ELEMENTS);

    elementEClass = createEClass(ELEMENT);

    bytemanRuleEClass = createEClass(BYTEMAN_RULE);
    createEAttribute(bytemanRuleEClass, BYTEMAN_RULE__NAME);
    createEReference(bytemanRuleEClass, BYTEMAN_RULE__EVENT);
    createEReference(bytemanRuleEClass, BYTEMAN_RULE__BODY);

    bodyEClass = createEClass(BODY);
    createEReference(bodyEClass, BODY__BIND);
    createEReference(bodyEClass, BODY__CONDITION);
    createEReference(bodyEClass, BODY__ACTIONS);

    eventEClass = createEClass(EVENT);
    createEReference(eventEClass, EVENT__CLASS);
    createEReference(eventEClass, EVENT__INTERFACE);
    createEReference(eventEClass, EVENT__METHOD);
    createEReference(eventEClass, EVENT__HELPER);
    createEReference(eventEClass, EVENT__LOCATION_SPEC);

    eventClassEClass = createEClass(EVENT_CLASS);
    createEAttribute(eventClassEClass, EVENT_CLASS__KEYWORD);
    createEAttribute(eventClassEClass, EVENT_CLASS__NAME);

    eventInterfaceEClass = createEClass(EVENT_INTERFACE);
    createEAttribute(eventInterfaceEClass, EVENT_INTERFACE__KEYWORD);
    createEAttribute(eventInterfaceEClass, EVENT_INTERFACE__NAME);

    eventMethodEClass = createEClass(EVENT_METHOD);
    createEAttribute(eventMethodEClass, EVENT_METHOD__NAME);
    createEReference(eventMethodEClass, EVENT_METHOD__PARAMETER_TYPES);

    helperEClass = createEClass(HELPER);
    createEAttribute(helperEClass, HELPER__HELPER);

    locationSpecifierEClass = createEClass(LOCATION_SPECIFIER);

    atLocationEClass = createEClass(AT_LOCATION);

    afterLocationEClass = createEClass(AFTER_LOCATION);
    createEAttribute(afterLocationEClass, AFTER_LOCATION__COUNTER);

    atEntryEClass = createEClass(AT_ENTRY);

    atExitEClass = createEClass(AT_EXIT);

    atLineEClass = createEClass(AT_LINE);
    createEAttribute(atLineEClass, AT_LINE__LINE);

    atReadEClass = createEClass(AT_READ);
    createEAttribute(atReadEClass, AT_READ__NAME);
    createEAttribute(atReadEClass, AT_READ__COUNTER);

    atReadFieldEClass = createEClass(AT_READ_FIELD);

    atReadLocalEClass = createEClass(AT_READ_LOCAL);

    afterReadEClass = createEClass(AFTER_READ);
    createEAttribute(afterReadEClass, AFTER_READ__NAME);

    afterReadFieldEClass = createEClass(AFTER_READ_FIELD);

    afterReadLocalEClass = createEClass(AFTER_READ_LOCAL);

    atWriteEClass = createEClass(AT_WRITE);
    createEAttribute(atWriteEClass, AT_WRITE__NAME);
    createEAttribute(atWriteEClass, AT_WRITE__COUNTER);

    atWriteFieldEClass = createEClass(AT_WRITE_FIELD);

    atWriteLocalEClass = createEClass(AT_WRITE_LOCAL);

    afterWriteEClass = createEClass(AFTER_WRITE);
    createEAttribute(afterWriteEClass, AFTER_WRITE__NAME);

    afterWriteFieldEClass = createEClass(AFTER_WRITE_FIELD);

    afterWriteLocalEClass = createEClass(AFTER_WRITE_LOCAL);

    atInvokeEClass = createEClass(AT_INVOKE);
    createEAttribute(atInvokeEClass, AT_INVOKE__NAME);
    createEReference(atInvokeEClass, AT_INVOKE__PARAMETER_TYPES);
    createEAttribute(atInvokeEClass, AT_INVOKE__COUNTER);

    afterInvokeEClass = createEClass(AFTER_INVOKE);
    createEAttribute(afterInvokeEClass, AFTER_INVOKE__NAME);
    createEReference(afterInvokeEClass, AFTER_INVOKE__PARAMETER_TYPES);

    atSynchronizeEClass = createEClass(AT_SYNCHRONIZE);
    createEAttribute(atSynchronizeEClass, AT_SYNCHRONIZE__COUNTER);

    afterSynchronizeEClass = createEClass(AFTER_SYNCHRONIZE);

    atThrowEClass = createEClass(AT_THROW);
    createEAttribute(atThrowEClass, AT_THROW__NAME);

    parameterTypesEClass = createEClass(PARAMETER_TYPES);
    createEAttribute(parameterTypesEClass, PARAMETER_TYPES__PARAM_TYPE_NAMES);

    bindEClass = createEClass(BIND);
    createEReference(bindEClass, BIND__BIND);

    bindingsEClass = createEClass(BINDINGS);
    createEReference(bindingsEClass, BINDINGS__BINDINGS);

    bindingEClass = createEClass(BINDING);
    createEAttribute(bindingEClass, BINDING__BIND_VARIABLE);
    createEAttribute(bindingEClass, BINDING__TYPENAME);
    createEReference(bindingEClass, BINDING__VALUE);

    conditionEClass = createEClass(CONDITION);

    actionsEClass = createEClass(ACTIONS);
    createEReference(actionsEClass, ACTIONS__ACTION_LIST);

    actionListEClass = createEClass(ACTION_LIST);
    createEReference(actionListEClass, ACTION_LIST__ACTIONS);

    actionEClass = createEClass(ACTION);

    expressionEClass = createEClass(EXPRESSION);
    createEAttribute(expressionEClass, EXPRESSION__OP);
    createEReference(expressionEClass, EXPRESSION__OPERAND1);
    createEAttribute(expressionEClass, EXPRESSION__VALUE);

    callArgumentsEClass = createEClass(CALL_ARGUMENTS);
    createEReference(callArgumentsEClass, CALL_ARGUMENTS__ARGS);

    assignmentExprEClass = createEClass(ASSIGNMENT_EXPR);
    createEReference(assignmentExprEClass, ASSIGNMENT_EXPR__OPERAND2);

    operatorExprEClass = createEClass(OPERATOR_EXPR);
    createEReference(operatorExprEClass, OPERATOR_EXPR__OPERAND2);

    plusMinusOperandEClass = createEClass(PLUS_MINUS_OPERAND);
    createEReference(plusMinusOperandEClass, PLUS_MINUS_OPERAND__OPERAND2);

    timesDivOperandEClass = createEClass(TIMES_DIV_OPERAND);
    createEReference(timesDivOperandEClass, TIMES_DIV_OPERAND__OPERAND2);

    bitwiseOperandEClass = createEClass(BITWISE_OPERAND);
    createEReference(bitwiseOperandEClass, BITWISE_OPERAND__OPERAND2);

    logicalOperandEClass = createEClass(LOGICAL_OPERAND);
    createEReference(logicalOperandEClass, LOGICAL_OPERAND__OPERAND2);

    accessExprEClass = createEClass(ACCESS_EXPR);
    createEReference(accessExprEClass, ACCESS_EXPR__OPERAND2);
    createEReference(accessExprEClass, ACCESS_EXPR__ARGS);

    builtinExprEClass = createEClass(BUILTIN_EXPR);
    createEReference(builtinExprEClass, BUILTIN_EXPR__ARGS);

    newExprEClass = createEClass(NEW_EXPR);
    createEReference(newExprEClass, NEW_EXPR__PARAMS);

    intConstantExprEClass = createEClass(INT_CONSTANT_EXPR);

    stringConstantExprEClass = createEClass(STRING_CONSTANT_EXPR);

    booleanConstantExprEClass = createEClass(BOOLEAN_CONSTANT_EXPR);

    floatConstantExprEClass = createEClass(FLOAT_CONSTANT_EXPR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bytemanRuleEClass.getESuperTypes().add(this.getElement());
    helperEClass.getESuperTypes().add(this.getElement());
    atLocationEClass.getESuperTypes().add(this.getLocationSpecifier());
    afterLocationEClass.getESuperTypes().add(this.getLocationSpecifier());
    atEntryEClass.getESuperTypes().add(this.getAtLocation());
    atExitEClass.getESuperTypes().add(this.getAtLocation());
    atLineEClass.getESuperTypes().add(this.getLocationSpecifier());
    atLineEClass.getESuperTypes().add(this.getAtLocation());
    atReadEClass.getESuperTypes().add(this.getAtLocation());
    atReadFieldEClass.getESuperTypes().add(this.getAtRead());
    atReadLocalEClass.getESuperTypes().add(this.getAtRead());
    afterReadEClass.getESuperTypes().add(this.getAfterLocation());
    afterReadFieldEClass.getESuperTypes().add(this.getAfterRead());
    afterReadLocalEClass.getESuperTypes().add(this.getAfterRead());
    atWriteEClass.getESuperTypes().add(this.getAtLocation());
    atWriteFieldEClass.getESuperTypes().add(this.getAtWrite());
    atWriteLocalEClass.getESuperTypes().add(this.getAtWrite());
    afterWriteEClass.getESuperTypes().add(this.getAfterLocation());
    afterWriteFieldEClass.getESuperTypes().add(this.getAfterWrite());
    afterWriteLocalEClass.getESuperTypes().add(this.getAfterWrite());
    atInvokeEClass.getESuperTypes().add(this.getAtLocation());
    afterInvokeEClass.getESuperTypes().add(this.getAfterLocation());
    atSynchronizeEClass.getESuperTypes().add(this.getAtLocation());
    afterSynchronizeEClass.getESuperTypes().add(this.getAfterLocation());
    atThrowEClass.getESuperTypes().add(this.getAtLocation());
    atThrowEClass.getESuperTypes().add(this.getAfterLocation());
    expressionEClass.getESuperTypes().add(this.getCondition());
    expressionEClass.getESuperTypes().add(this.getAction());
    assignmentExprEClass.getESuperTypes().add(this.getExpression());
    operatorExprEClass.getESuperTypes().add(this.getExpression());
    plusMinusOperandEClass.getESuperTypes().add(this.getExpression());
    timesDivOperandEClass.getESuperTypes().add(this.getExpression());
    bitwiseOperandEClass.getESuperTypes().add(this.getExpression());
    logicalOperandEClass.getESuperTypes().add(this.getExpression());
    accessExprEClass.getESuperTypes().add(this.getExpression());
    builtinExprEClass.getESuperTypes().add(this.getExpression());
    newExprEClass.getESuperTypes().add(this.getExpression());
    intConstantExprEClass.getESuperTypes().add(this.getExpression());
    stringConstantExprEClass.getESuperTypes().add(this.getExpression());
    booleanConstantExprEClass.getESuperTypes().add(this.getExpression());
    floatConstantExprEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainModel_Elements(), this.getElement(), null, "elements", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bytemanRuleEClass, BytemanRule.class, "BytemanRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBytemanRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, BytemanRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBytemanRule_Event(), this.getEvent(), null, "event", null, 0, 1, BytemanRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBytemanRule_Body(), this.getBody(), null, "body", null, 0, 1, BytemanRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBody_Bind(), this.getBind(), null, "bind", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_Condition(), this.getCondition(), null, "condition", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_Actions(), this.getActions(), null, "actions", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvent_Class(), this.getEventClass(), null, "class", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Interface(), this.getEventInterface(), null, "interface", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Method(), this.getEventMethod(), null, "method", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Helper(), this.getHelper(), null, "helper", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_LocationSpec(), this.getLocationSpecifier(), null, "locationSpec", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventClassEClass, EventClass.class, "EventClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventClass_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, EventClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventInterfaceEClass, EventInterface.class, "EventInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventInterface_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, EventInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventMethodEClass, EventMethod.class, "EventMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventMethod_ParameterTypes(), this.getParameterTypes(), null, "parameterTypes", null, 0, 1, EventMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helperEClass, Helper.class, "Helper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHelper_Helper(), ecorePackage.getEString(), "helper", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationSpecifierEClass, LocationSpecifier.class, "LocationSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atLocationEClass, AtLocation.class, "AtLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(afterLocationEClass, AfterLocation.class, "AfterLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAfterLocation_Counter(), ecorePackage.getEString(), "counter", null, 0, 1, AfterLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atEntryEClass, AtEntry.class, "AtEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atExitEClass, AtExit.class, "AtExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atLineEClass, AtLine.class, "AtLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtLine_Line(), ecorePackage.getEString(), "line", null, 0, 1, AtLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atReadEClass, AtRead.class, "AtRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtRead_Name(), ecorePackage.getEString(), "name", null, 0, 1, AtRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtRead_Counter(), ecorePackage.getEString(), "counter", null, 0, 1, AtRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atReadFieldEClass, AtReadField.class, "AtReadField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atReadLocalEClass, AtReadLocal.class, "AtReadLocal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(afterReadEClass, AfterRead.class, "AfterRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAfterRead_Name(), ecorePackage.getEString(), "name", null, 0, 1, AfterRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(afterReadFieldEClass, AfterReadField.class, "AfterReadField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(afterReadLocalEClass, AfterReadLocal.class, "AfterReadLocal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atWriteEClass, AtWrite.class, "AtWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtWrite_Name(), ecorePackage.getEString(), "name", null, 0, 1, AtWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtWrite_Counter(), ecorePackage.getEString(), "counter", null, 0, 1, AtWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atWriteFieldEClass, AtWriteField.class, "AtWriteField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atWriteLocalEClass, AtWriteLocal.class, "AtWriteLocal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(afterWriteEClass, AfterWrite.class, "AfterWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAfterWrite_Name(), ecorePackage.getEString(), "name", null, 0, 1, AfterWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(afterWriteFieldEClass, AfterWriteField.class, "AfterWriteField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(afterWriteLocalEClass, AfterWriteLocal.class, "AfterWriteLocal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atInvokeEClass, AtInvoke.class, "AtInvoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtInvoke_Name(), ecorePackage.getEString(), "name", null, 0, 1, AtInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtInvoke_ParameterTypes(), this.getParameterTypes(), null, "parameterTypes", null, 0, 1, AtInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtInvoke_Counter(), ecorePackage.getEString(), "counter", null, 0, 1, AtInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(afterInvokeEClass, AfterInvoke.class, "AfterInvoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAfterInvoke_Name(), ecorePackage.getEString(), "name", null, 0, 1, AfterInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAfterInvoke_ParameterTypes(), this.getParameterTypes(), null, "parameterTypes", null, 0, 1, AfterInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atSynchronizeEClass, AtSynchronize.class, "AtSynchronize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtSynchronize_Counter(), ecorePackage.getEString(), "counter", null, 0, 1, AtSynchronize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(afterSynchronizeEClass, AfterSynchronize.class, "AfterSynchronize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atThrowEClass, AtThrow.class, "AtThrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtThrow_Name(), ecorePackage.getEString(), "name", null, 0, 1, AtThrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterTypesEClass, ParameterTypes.class, "ParameterTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterTypes_ParamTypeNames(), ecorePackage.getEString(), "paramTypeNames", null, 0, -1, ParameterTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindEClass, Bind.class, "Bind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBind_Bind(), this.getBindings(), null, "bind", null, 0, 1, Bind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingsEClass, Bindings.class, "Bindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBindings_Bindings(), this.getBinding(), null, "bindings", null, 0, -1, Bindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinding_BindVariable(), ecorePackage.getEString(), "bindVariable", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinding_Typename(), ecorePackage.getEString(), "typename", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinding_Value(), this.getExpression(), null, "value", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actionsEClass, Actions.class, "Actions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActions_ActionList(), this.getActionList(), null, "actionList", null, 0, 1, Actions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionListEClass, ActionList.class, "ActionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionList_Actions(), this.getAction(), null, "actions", null, 0, -1, ActionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Operand1(), this.getExpression(), null, "operand1", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callArgumentsEClass, CallArguments.class, "CallArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallArguments_Args(), this.getExpression(), null, "args", null, 0, -1, CallArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentExprEClass, AssignmentExpr.class, "AssignmentExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentExpr_Operand2(), this.getExpression(), null, "operand2", null, 0, 1, AssignmentExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorExprEClass, OperatorExpr.class, "OperatorExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperatorExpr_Operand2(), this.getExpression(), null, "operand2", null, 0, 1, OperatorExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusMinusOperandEClass, PlusMinusOperand.class, "PlusMinusOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlusMinusOperand_Operand2(), this.getExpression(), null, "operand2", null, 0, 1, PlusMinusOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timesDivOperandEClass, TimesDivOperand.class, "TimesDivOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTimesDivOperand_Operand2(), this.getExpression(), null, "operand2", null, 0, 1, TimesDivOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitwiseOperandEClass, BitwiseOperand.class, "BitwiseOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBitwiseOperand_Operand2(), this.getExpression(), null, "operand2", null, 0, 1, BitwiseOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalOperandEClass, LogicalOperand.class, "LogicalOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalOperand_Operand2(), this.getExpression(), null, "operand2", null, 0, 1, LogicalOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accessExprEClass, AccessExpr.class, "AccessExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccessExpr_Operand2(), this.getExpression(), null, "operand2", null, 0, 1, AccessExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessExpr_Args(), this.getCallArguments(), null, "args", null, 0, 1, AccessExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(builtinExprEClass, BuiltinExpr.class, "BuiltinExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuiltinExpr_Args(), this.getCallArguments(), null, "args", null, 0, 1, BuiltinExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newExprEClass, NewExpr.class, "NewExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewExpr_Params(), this.getCallArguments(), null, "params", null, 0, 1, NewExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantExprEClass, IntConstantExpr.class, "IntConstantExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringConstantExprEClass, StringConstantExpr.class, "StringConstantExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanConstantExprEClass, BooleanConstantExpr.class, "BooleanConstantExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatConstantExprEClass, FloatConstantExpr.class, "FloatConstantExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //BytemanPackageImpl
