/**
 * generated by Xtext 2.16.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.util;

import br.ufscar.sas.xtext.sasdsl.sasDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage
 * @generated
 */
public class SasDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SasDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SasDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SasDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SasDslPackage.ARCHITECTURE_DEFINITION:
      {
        ArchitectureDefinition architectureDefinition = (ArchitectureDefinition)theEObject;
        T result = caseArchitectureDefinition(architectureDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_RULES:
      {
        DSLRules dslRules = (DSLRules)theEObject;
        T result = caseDSLRules(dslRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_RULE_MCONTROLLER:
      {
        DSLRuleMController dslRuleMController = (DSLRuleMController)theEObject;
        T result = caseDSLRuleMController(dslRuleMController);
        if (result == null) result = caseDSLRules(dslRuleMController);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_RULE_CONTROLLER:
      {
        DSLRuleController dslRuleController = (DSLRuleController)theEObject;
        T result = caseDSLRuleController(dslRuleController);
        if (result == null) result = caseDSLRules(dslRuleController);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_RULE_MONITOR:
      {
        DSLRuleMonitor dslRuleMonitor = (DSLRuleMonitor)theEObject;
        T result = caseDSLRuleMonitor(dslRuleMonitor);
        if (result == null) result = caseDSLRules(dslRuleMonitor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_RULE_ANALYZER:
      {
        DSLRuleAnalyzer dslRuleAnalyzer = (DSLRuleAnalyzer)theEObject;
        T result = caseDSLRuleAnalyzer(dslRuleAnalyzer);
        if (result == null) result = caseDSLRules(dslRuleAnalyzer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_RULE_PLANNER:
      {
        DSLRulePlanner dslRulePlanner = (DSLRulePlanner)theEObject;
        T result = caseDSLRulePlanner(dslRulePlanner);
        if (result == null) result = caseDSLRules(dslRulePlanner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_RULE_EXECUTOR:
      {
        DSLRuleExecutor dslRuleExecutor = (DSLRuleExecutor)theEObject;
        T result = caseDSLRuleExecutor(dslRuleExecutor);
        if (result == null) result = caseDSLRules(dslRuleExecutor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_RULE_MO:
      {
        DSLRuleMO dslRuleMO = (DSLRuleMO)theEObject;
        T result = caseDSLRuleMO(dslRuleMO);
        if (result == null) result = caseDSLRules(dslRuleMO);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_MANAGING:
      {
        DSLManaging dslManaging = (DSLManaging)theEObject;
        T result = caseDSLManaging(dslManaging);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_MANAGED:
      {
        DSLManaged dslManaged = (DSLManaged)theEObject;
        T result = caseDSLManaged(dslManaged);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_MANAGER_CONTROLLER:
      {
        DSLManagerController dslManagerController = (DSLManagerController)theEObject;
        T result = caseDSLManagerController(dslManagerController);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_CONTROLLER:
      {
        DSLController dslController = (DSLController)theEObject;
        T result = caseDSLController(dslController);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_MONITOR:
      {
        DSLMonitor dslMonitor = (DSLMonitor)theEObject;
        T result = caseDSLMonitor(dslMonitor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_ANALYZER:
      {
        DSLAnalyzer dslAnalyzer = (DSLAnalyzer)theEObject;
        T result = caseDSLAnalyzer(dslAnalyzer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_PLANNER:
      {
        DSLPlanner dslPlanner = (DSLPlanner)theEObject;
        T result = caseDSLPlanner(dslPlanner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_EXECUTOR:
      {
        DSLExecutor dslExecutor = (DSLExecutor)theEObject;
        T result = caseDSLExecutor(dslExecutor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_KNOWLEDGE:
      {
        DSLKnowledge dslKnowledge = (DSLKnowledge)theEObject;
        T result = caseDSLKnowledge(dslKnowledge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_SENSOR:
      {
        DSLSensor dslSensor = (DSLSensor)theEObject;
        T result = caseDSLSensor(dslSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_EFFECTOR:
      {
        DSLEffector dslEffector = (DSLEffector)theEObject;
        T result = caseDSLEffector(dslEffector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_REFERENCE_INPUT:
      {
        DSLReferenceInput dslReferenceInput = (DSLReferenceInput)theEObject;
        T result = caseDSLReferenceInput(dslReferenceInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DSL_MEASURED_OUTPUT:
      {
        DSLMeasuredOutput dslMeasuredOutput = (DSLMeasuredOutput)theEObject;
        T result = caseDSLMeasuredOutput(dslMeasuredOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Architecture Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Architecture Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArchitectureDefinition(ArchitectureDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRules(DSLRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule MController</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule MController</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRuleMController(DSLRuleMController object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRuleController(DSLRuleController object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule Monitor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule Monitor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRuleMonitor(DSLRuleMonitor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule Analyzer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule Analyzer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRuleAnalyzer(DSLRuleAnalyzer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule Planner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule Planner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRulePlanner(DSLRulePlanner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule Executor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule Executor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRuleExecutor(DSLRuleExecutor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule MO</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule MO</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRuleMO(DSLRuleMO object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Managing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Managing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLManaging(DSLManaging object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Managed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Managed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLManaged(DSLManaged object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Manager Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Manager Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLManagerController(DSLManagerController object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLController(DSLController object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Monitor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Monitor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLMonitor(DSLMonitor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Analyzer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Analyzer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLAnalyzer(DSLAnalyzer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Planner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Planner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLPlanner(DSLPlanner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Executor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Executor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLExecutor(DSLExecutor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Knowledge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Knowledge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLKnowledge(DSLKnowledge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLSensor(DSLSensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Effector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Effector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLEffector(DSLEffector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Reference Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Reference Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLReferenceInput(DSLReferenceInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Measured Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Measured Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLMeasuredOutput(DSLMeasuredOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SasDslSwitch
