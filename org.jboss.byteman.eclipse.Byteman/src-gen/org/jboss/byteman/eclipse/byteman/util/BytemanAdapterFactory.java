/**
 * <copyright>
 * </copyright>
 *
 */
package org.jboss.byteman.eclipse.byteman.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.jboss.byteman.eclipse.byteman.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jboss.byteman.eclipse.byteman.BytemanPackage
 * @generated
 */
public class BytemanAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BytemanPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BytemanAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BytemanPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BytemanSwitch<Adapter> modelSwitch =
    new BytemanSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainModel(DomainModel object)
      {
        return createDomainModelAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseBytemanRule(BytemanRule object)
      {
        return createBytemanRuleAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseEventClass(EventClass object)
      {
        return createEventClassAdapter();
      }
      @Override
      public Adapter caseEventInterface(EventInterface object)
      {
        return createEventInterfaceAdapter();
      }
      @Override
      public Adapter caseEventMethod(EventMethod object)
      {
        return createEventMethodAdapter();
      }
      @Override
      public Adapter caseHelper(Helper object)
      {
        return createHelperAdapter();
      }
      @Override
      public Adapter caseLocationSpecifier(LocationSpecifier object)
      {
        return createLocationSpecifierAdapter();
      }
      @Override
      public Adapter caseAtLocation(AtLocation object)
      {
        return createAtLocationAdapter();
      }
      @Override
      public Adapter caseAfterLocation(AfterLocation object)
      {
        return createAfterLocationAdapter();
      }
      @Override
      public Adapter caseAtEntry(AtEntry object)
      {
        return createAtEntryAdapter();
      }
      @Override
      public Adapter caseAtExit(AtExit object)
      {
        return createAtExitAdapter();
      }
      @Override
      public Adapter caseAtLine(AtLine object)
      {
        return createAtLineAdapter();
      }
      @Override
      public Adapter caseAtRead(AtRead object)
      {
        return createAtReadAdapter();
      }
      @Override
      public Adapter caseAtReadField(AtReadField object)
      {
        return createAtReadFieldAdapter();
      }
      @Override
      public Adapter caseAtReadLocal(AtReadLocal object)
      {
        return createAtReadLocalAdapter();
      }
      @Override
      public Adapter caseAfterRead(AfterRead object)
      {
        return createAfterReadAdapter();
      }
      @Override
      public Adapter caseAfterReadField(AfterReadField object)
      {
        return createAfterReadFieldAdapter();
      }
      @Override
      public Adapter caseAfterReadLocal(AfterReadLocal object)
      {
        return createAfterReadLocalAdapter();
      }
      @Override
      public Adapter caseAtWrite(AtWrite object)
      {
        return createAtWriteAdapter();
      }
      @Override
      public Adapter caseAtWriteField(AtWriteField object)
      {
        return createAtWriteFieldAdapter();
      }
      @Override
      public Adapter caseAtWriteLocal(AtWriteLocal object)
      {
        return createAtWriteLocalAdapter();
      }
      @Override
      public Adapter caseAfterWrite(AfterWrite object)
      {
        return createAfterWriteAdapter();
      }
      @Override
      public Adapter caseAfterWriteField(AfterWriteField object)
      {
        return createAfterWriteFieldAdapter();
      }
      @Override
      public Adapter caseAfterWriteLocal(AfterWriteLocal object)
      {
        return createAfterWriteLocalAdapter();
      }
      @Override
      public Adapter caseAtInvoke(AtInvoke object)
      {
        return createAtInvokeAdapter();
      }
      @Override
      public Adapter caseAfterInvoke(AfterInvoke object)
      {
        return createAfterInvokeAdapter();
      }
      @Override
      public Adapter caseAtSynchronize(AtSynchronize object)
      {
        return createAtSynchronizeAdapter();
      }
      @Override
      public Adapter caseAfterSynchronize(AfterSynchronize object)
      {
        return createAfterSynchronizeAdapter();
      }
      @Override
      public Adapter caseAtThrow(AtThrow object)
      {
        return createAtThrowAdapter();
      }
      @Override
      public Adapter caseParameterTypes(ParameterTypes object)
      {
        return createParameterTypesAdapter();
      }
      @Override
      public Adapter caseBind(Bind object)
      {
        return createBindAdapter();
      }
      @Override
      public Adapter caseBindings(Bindings object)
      {
        return createBindingsAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseActions(Actions object)
      {
        return createActionsAdapter();
      }
      @Override
      public Adapter caseActionList(ActionList object)
      {
        return createActionListAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseCallArguments(CallArguments object)
      {
        return createCallArgumentsAdapter();
      }
      @Override
      public Adapter caseAssignmentExpr(AssignmentExpr object)
      {
        return createAssignmentExprAdapter();
      }
      @Override
      public Adapter caseOperatorExpr(OperatorExpr object)
      {
        return createOperatorExprAdapter();
      }
      @Override
      public Adapter casePlusMinusOperand(PlusMinusOperand object)
      {
        return createPlusMinusOperandAdapter();
      }
      @Override
      public Adapter caseTimesDivOperand(TimesDivOperand object)
      {
        return createTimesDivOperandAdapter();
      }
      @Override
      public Adapter caseBitwiseOperand(BitwiseOperand object)
      {
        return createBitwiseOperandAdapter();
      }
      @Override
      public Adapter caseLogicalOperand(LogicalOperand object)
      {
        return createLogicalOperandAdapter();
      }
      @Override
      public Adapter caseAccessExpr(AccessExpr object)
      {
        return createAccessExprAdapter();
      }
      @Override
      public Adapter caseBuiltinExpr(BuiltinExpr object)
      {
        return createBuiltinExprAdapter();
      }
      @Override
      public Adapter caseNewExpr(NewExpr object)
      {
        return createNewExprAdapter();
      }
      @Override
      public Adapter caseIntConstantExpr(IntConstantExpr object)
      {
        return createIntConstantExprAdapter();
      }
      @Override
      public Adapter caseStringConstantExpr(StringConstantExpr object)
      {
        return createStringConstantExprAdapter();
      }
      @Override
      public Adapter caseBooleanConstantExpr(BooleanConstantExpr object)
      {
        return createBooleanConstantExprAdapter();
      }
      @Override
      public Adapter caseFloatConstantExpr(FloatConstantExpr object)
      {
        return createFloatConstantExprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.DomainModel
   * @generated
   */
  public Adapter createDomainModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.BytemanRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.BytemanRule
   * @generated
   */
  public Adapter createBytemanRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.EventClass <em>Event Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.EventClass
   * @generated
   */
  public Adapter createEventClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.EventInterface <em>Event Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.EventInterface
   * @generated
   */
  public Adapter createEventInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.EventMethod <em>Event Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.EventMethod
   * @generated
   */
  public Adapter createEventMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Helper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Helper
   * @generated
   */
  public Adapter createHelperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.LocationSpecifier <em>Location Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.LocationSpecifier
   * @generated
   */
  public Adapter createLocationSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtLocation <em>At Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtLocation
   * @generated
   */
  public Adapter createAtLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterLocation <em>After Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterLocation
   * @generated
   */
  public Adapter createAfterLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtEntry <em>At Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtEntry
   * @generated
   */
  public Adapter createAtEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtExit <em>At Exit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtExit
   * @generated
   */
  public Adapter createAtExitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtLine <em>At Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtLine
   * @generated
   */
  public Adapter createAtLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtRead <em>At Read</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtRead
   * @generated
   */
  public Adapter createAtReadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtReadField <em>At Read Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtReadField
   * @generated
   */
  public Adapter createAtReadFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtReadLocal <em>At Read Local</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtReadLocal
   * @generated
   */
  public Adapter createAtReadLocalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterRead <em>After Read</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterRead
   * @generated
   */
  public Adapter createAfterReadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterReadField <em>After Read Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterReadField
   * @generated
   */
  public Adapter createAfterReadFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterReadLocal <em>After Read Local</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterReadLocal
   * @generated
   */
  public Adapter createAfterReadLocalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtWrite <em>At Write</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtWrite
   * @generated
   */
  public Adapter createAtWriteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtWriteField <em>At Write Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtWriteField
   * @generated
   */
  public Adapter createAtWriteFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtWriteLocal <em>At Write Local</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtWriteLocal
   * @generated
   */
  public Adapter createAtWriteLocalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterWrite <em>After Write</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterWrite
   * @generated
   */
  public Adapter createAfterWriteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterWriteField <em>After Write Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterWriteField
   * @generated
   */
  public Adapter createAfterWriteFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterWriteLocal <em>After Write Local</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterWriteLocal
   * @generated
   */
  public Adapter createAfterWriteLocalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtInvoke <em>At Invoke</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtInvoke
   * @generated
   */
  public Adapter createAtInvokeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterInvoke <em>After Invoke</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterInvoke
   * @generated
   */
  public Adapter createAfterInvokeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtSynchronize <em>At Synchronize</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtSynchronize
   * @generated
   */
  public Adapter createAtSynchronizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AfterSynchronize <em>After Synchronize</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AfterSynchronize
   * @generated
   */
  public Adapter createAfterSynchronizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AtThrow <em>At Throw</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AtThrow
   * @generated
   */
  public Adapter createAtThrowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.ParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.ParameterTypes
   * @generated
   */
  public Adapter createParameterTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Bind
   * @generated
   */
  public Adapter createBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Bindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Bindings
   * @generated
   */
  public Adapter createBindingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Binding
   * @generated
   */
  public Adapter createBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Actions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Actions
   * @generated
   */
  public Adapter createActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.ActionList <em>Action List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.ActionList
   * @generated
   */
  public Adapter createActionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.CallArguments <em>Call Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.CallArguments
   * @generated
   */
  public Adapter createCallArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AssignmentExpr <em>Assignment Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AssignmentExpr
   * @generated
   */
  public Adapter createAssignmentExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.OperatorExpr <em>Operator Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.OperatorExpr
   * @generated
   */
  public Adapter createOperatorExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.PlusMinusOperand <em>Plus Minus Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.PlusMinusOperand
   * @generated
   */
  public Adapter createPlusMinusOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.TimesDivOperand <em>Times Div Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.TimesDivOperand
   * @generated
   */
  public Adapter createTimesDivOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.BitwiseOperand <em>Bitwise Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.BitwiseOperand
   * @generated
   */
  public Adapter createBitwiseOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.LogicalOperand <em>Logical Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.LogicalOperand
   * @generated
   */
  public Adapter createLogicalOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.AccessExpr <em>Access Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.AccessExpr
   * @generated
   */
  public Adapter createAccessExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.BuiltinExpr <em>Builtin Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.BuiltinExpr
   * @generated
   */
  public Adapter createBuiltinExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.NewExpr <em>New Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.NewExpr
   * @generated
   */
  public Adapter createNewExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.IntConstantExpr <em>Int Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.IntConstantExpr
   * @generated
   */
  public Adapter createIntConstantExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.StringConstantExpr <em>String Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.StringConstantExpr
   * @generated
   */
  public Adapter createStringConstantExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.BooleanConstantExpr <em>Boolean Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.BooleanConstantExpr
   * @generated
   */
  public Adapter createBooleanConstantExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.byteman.eclipse.byteman.FloatConstantExpr <em>Float Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.byteman.eclipse.byteman.FloatConstantExpr
   * @generated
   */
  public Adapter createFloatConstantExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BytemanAdapterFactory
