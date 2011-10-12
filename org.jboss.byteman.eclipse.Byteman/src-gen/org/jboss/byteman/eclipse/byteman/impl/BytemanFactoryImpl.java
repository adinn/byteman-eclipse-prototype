/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jboss.byteman.eclipse.byteman.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BytemanFactoryImpl extends EFactoryImpl implements BytemanFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BytemanFactory init()
  {
    try
    {
      BytemanFactory theBytemanFactory = (BytemanFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.jboss.org/byteman/eclipse/Byteman"); 
      if (theBytemanFactory != null)
      {
        return theBytemanFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BytemanFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BytemanFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BytemanPackage.DOMAIN_MODEL: return createDomainModel();
      case BytemanPackage.ELEMENT: return createElement();
      case BytemanPackage.BYTEMAN_RULE: return createBytemanRule();
      case BytemanPackage.BODY: return createBody();
      case BytemanPackage.EVENT: return createEvent();
      case BytemanPackage.EVENT_CLASS: return createEventClass();
      case BytemanPackage.EVENT_INTERFACE: return createEventInterface();
      case BytemanPackage.EVENT_METHOD: return createEventMethod();
      case BytemanPackage.HELPER: return createHelper();
      case BytemanPackage.LOCATION_SPECIFIER: return createLocationSpecifier();
      case BytemanPackage.AT_LOCATION: return createAtLocation();
      case BytemanPackage.AFTER_LOCATION: return createAfterLocation();
      case BytemanPackage.AT_ENTRY: return createAtEntry();
      case BytemanPackage.AT_EXIT: return createAtExit();
      case BytemanPackage.AT_LINE: return createAtLine();
      case BytemanPackage.AT_READ: return createAtRead();
      case BytemanPackage.AT_READ_FIELD: return createAtReadField();
      case BytemanPackage.AT_READ_LOCAL: return createAtReadLocal();
      case BytemanPackage.AFTER_READ: return createAfterRead();
      case BytemanPackage.AFTER_READ_FIELD: return createAfterReadField();
      case BytemanPackage.AFTER_READ_LOCAL: return createAfterReadLocal();
      case BytemanPackage.AT_WRITE: return createAtWrite();
      case BytemanPackage.AT_WRITE_FIELD: return createAtWriteField();
      case BytemanPackage.AT_WRITE_LOCAL: return createAtWriteLocal();
      case BytemanPackage.AFTER_WRITE: return createAfterWrite();
      case BytemanPackage.AFTER_WRITE_FIELD: return createAfterWriteField();
      case BytemanPackage.AFTER_WRITE_LOCAL: return createAfterWriteLocal();
      case BytemanPackage.AT_INVOKE: return createAtInvoke();
      case BytemanPackage.AFTER_INVOKE: return createAfterInvoke();
      case BytemanPackage.AT_SYNCHRONIZE: return createAtSynchronize();
      case BytemanPackage.AFTER_SYNCHRONIZE: return createAfterSynchronize();
      case BytemanPackage.AT_THROW: return createAtThrow();
      case BytemanPackage.PARAMETER_TYPES: return createParameterTypes();
      case BytemanPackage.BIND: return createBind();
      case BytemanPackage.BINDINGS: return createBindings();
      case BytemanPackage.BINDING: return createBinding();
      case BytemanPackage.CONDITION: return createCondition();
      case BytemanPackage.ACTIONS: return createActions();
      case BytemanPackage.ACTION_LIST: return createActionList();
      case BytemanPackage.ACTION: return createAction();
      case BytemanPackage.EXPRESSION: return createExpression();
      case BytemanPackage.CALL_ARGUMENTS: return createCallArguments();
      case BytemanPackage.ASSIGNMENT_EXPR: return createAssignmentExpr();
      case BytemanPackage.OPERATOR_EXPR: return createOperatorExpr();
      case BytemanPackage.PLUS_MINUS_OPERAND: return createPlusMinusOperand();
      case BytemanPackage.TIMES_DIV_OPERAND: return createTimesDivOperand();
      case BytemanPackage.BITWISE_OPERAND: return createBitwiseOperand();
      case BytemanPackage.LOGICAL_OPERAND: return createLogicalOperand();
      case BytemanPackage.ACCESS_EXPR: return createAccessExpr();
      case BytemanPackage.BUILTIN_EXPR: return createBuiltinExpr();
      case BytemanPackage.NEW_EXPR: return createNewExpr();
      case BytemanPackage.SIMPLE_NAME: return createSimpleName();
      case BytemanPackage.INDEXED_SPECIAL_VAR: return createIndexedSpecialVar();
      case BytemanPackage.SPECIAL_VAR: return createSpecialVar();
      case BytemanPackage.INT_CONSTANT_EXPR: return createIntConstantExpr();
      case BytemanPackage.STRING_CONSTANT_EXPR: return createStringConstantExpr();
      case BytemanPackage.BOOLEAN_CONSTANT_EXPR: return createBooleanConstantExpr();
      case BytemanPackage.FLOAT_CONSTANT_EXPR: return createFloatConstantExpr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BytemanRule createBytemanRule()
  {
    BytemanRuleImpl bytemanRule = new BytemanRuleImpl();
    return bytemanRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventClass createEventClass()
  {
    EventClassImpl eventClass = new EventClassImpl();
    return eventClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventInterface createEventInterface()
  {
    EventInterfaceImpl eventInterface = new EventInterfaceImpl();
    return eventInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventMethod createEventMethod()
  {
    EventMethodImpl eventMethod = new EventMethodImpl();
    return eventMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Helper createHelper()
  {
    HelperImpl helper = new HelperImpl();
    return helper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationSpecifier createLocationSpecifier()
  {
    LocationSpecifierImpl locationSpecifier = new LocationSpecifierImpl();
    return locationSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtLocation createAtLocation()
  {
    AtLocationImpl atLocation = new AtLocationImpl();
    return atLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterLocation createAfterLocation()
  {
    AfterLocationImpl afterLocation = new AfterLocationImpl();
    return afterLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtEntry createAtEntry()
  {
    AtEntryImpl atEntry = new AtEntryImpl();
    return atEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtExit createAtExit()
  {
    AtExitImpl atExit = new AtExitImpl();
    return atExit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtLine createAtLine()
  {
    AtLineImpl atLine = new AtLineImpl();
    return atLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtRead createAtRead()
  {
    AtReadImpl atRead = new AtReadImpl();
    return atRead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtReadField createAtReadField()
  {
    AtReadFieldImpl atReadField = new AtReadFieldImpl();
    return atReadField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtReadLocal createAtReadLocal()
  {
    AtReadLocalImpl atReadLocal = new AtReadLocalImpl();
    return atReadLocal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterRead createAfterRead()
  {
    AfterReadImpl afterRead = new AfterReadImpl();
    return afterRead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterReadField createAfterReadField()
  {
    AfterReadFieldImpl afterReadField = new AfterReadFieldImpl();
    return afterReadField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterReadLocal createAfterReadLocal()
  {
    AfterReadLocalImpl afterReadLocal = new AfterReadLocalImpl();
    return afterReadLocal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtWrite createAtWrite()
  {
    AtWriteImpl atWrite = new AtWriteImpl();
    return atWrite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtWriteField createAtWriteField()
  {
    AtWriteFieldImpl atWriteField = new AtWriteFieldImpl();
    return atWriteField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtWriteLocal createAtWriteLocal()
  {
    AtWriteLocalImpl atWriteLocal = new AtWriteLocalImpl();
    return atWriteLocal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterWrite createAfterWrite()
  {
    AfterWriteImpl afterWrite = new AfterWriteImpl();
    return afterWrite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterWriteField createAfterWriteField()
  {
    AfterWriteFieldImpl afterWriteField = new AfterWriteFieldImpl();
    return afterWriteField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterWriteLocal createAfterWriteLocal()
  {
    AfterWriteLocalImpl afterWriteLocal = new AfterWriteLocalImpl();
    return afterWriteLocal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtInvoke createAtInvoke()
  {
    AtInvokeImpl atInvoke = new AtInvokeImpl();
    return atInvoke;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterInvoke createAfterInvoke()
  {
    AfterInvokeImpl afterInvoke = new AfterInvokeImpl();
    return afterInvoke;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtSynchronize createAtSynchronize()
  {
    AtSynchronizeImpl atSynchronize = new AtSynchronizeImpl();
    return atSynchronize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterSynchronize createAfterSynchronize()
  {
    AfterSynchronizeImpl afterSynchronize = new AfterSynchronizeImpl();
    return afterSynchronize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtThrow createAtThrow()
  {
    AtThrowImpl atThrow = new AtThrowImpl();
    return atThrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterTypes createParameterTypes()
  {
    ParameterTypesImpl parameterTypes = new ParameterTypesImpl();
    return parameterTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bind createBind()
  {
    BindImpl bind = new BindImpl();
    return bind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bindings createBindings()
  {
    BindingsImpl bindings = new BindingsImpl();
    return bindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions createActions()
  {
    ActionsImpl actions = new ActionsImpl();
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionList createActionList()
  {
    ActionListImpl actionList = new ActionListImpl();
    return actionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallArguments createCallArguments()
  {
    CallArgumentsImpl callArguments = new CallArgumentsImpl();
    return callArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpr createAssignmentExpr()
  {
    AssignmentExprImpl assignmentExpr = new AssignmentExprImpl();
    return assignmentExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorExpr createOperatorExpr()
  {
    OperatorExprImpl operatorExpr = new OperatorExprImpl();
    return operatorExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlusMinusOperand createPlusMinusOperand()
  {
    PlusMinusOperandImpl plusMinusOperand = new PlusMinusOperandImpl();
    return plusMinusOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimesDivOperand createTimesDivOperand()
  {
    TimesDivOperandImpl timesDivOperand = new TimesDivOperandImpl();
    return timesDivOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitwiseOperand createBitwiseOperand()
  {
    BitwiseOperandImpl bitwiseOperand = new BitwiseOperandImpl();
    return bitwiseOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOperand createLogicalOperand()
  {
    LogicalOperandImpl logicalOperand = new LogicalOperandImpl();
    return logicalOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessExpr createAccessExpr()
  {
    AccessExprImpl accessExpr = new AccessExprImpl();
    return accessExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinExpr createBuiltinExpr()
  {
    BuiltinExprImpl builtinExpr = new BuiltinExprImpl();
    return builtinExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewExpr createNewExpr()
  {
    NewExprImpl newExpr = new NewExprImpl();
    return newExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleName createSimpleName()
  {
    SimpleNameImpl simpleName = new SimpleNameImpl();
    return simpleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexedSpecialVar createIndexedSpecialVar()
  {
    IndexedSpecialVarImpl indexedSpecialVar = new IndexedSpecialVarImpl();
    return indexedSpecialVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecialVar createSpecialVar()
  {
    SpecialVarImpl specialVar = new SpecialVarImpl();
    return specialVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstantExpr createIntConstantExpr()
  {
    IntConstantExprImpl intConstantExpr = new IntConstantExprImpl();
    return intConstantExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstantExpr createStringConstantExpr()
  {
    StringConstantExprImpl stringConstantExpr = new StringConstantExprImpl();
    return stringConstantExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanConstantExpr createBooleanConstantExpr()
  {
    BooleanConstantExprImpl booleanConstantExpr = new BooleanConstantExprImpl();
    return booleanConstantExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatConstantExpr createFloatConstantExpr()
  {
    FloatConstantExprImpl floatConstantExpr = new FloatConstantExprImpl();
    return floatConstantExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BytemanPackage getBytemanPackage()
  {
    return (BytemanPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BytemanPackage getPackage()
  {
    return BytemanPackage.eINSTANCE;
  }

} //BytemanFactoryImpl
