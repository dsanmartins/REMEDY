/**
 * generated by Xtext 2.21.0
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
      case SasDslPackage.DSL_RULE_KNOWLEDGE:
      {
        DSLRuleKnowledge dslRuleKnowledge = (DSLRuleKnowledge)theEObject;
        T result = caseDSLRuleKnowledge(dslRuleKnowledge);
        if (result == null) result = caseDSLRules(dslRuleKnowledge);
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
      case SasDslPackage.DSL_RULE_GENERIC:
      {
        DSLRuleGeneric dslRuleGeneric = (DSLRuleGeneric)theEObject;
        T result = caseDSLRuleGeneric(dslRuleGeneric);
        if (result == null) result = caseDSLRules(dslRuleGeneric);
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
      case SasDslPackage.DSL_DOMAIN_RULE:
      {
        DSLDomainRule dslDomainRule = (DSLDomainRule)theEObject;
        T result = caseDSLDomainRule(dslDomainRule);
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
      case SasDslPackage.DSL_ALTERNATIVE:
      {
        DSLAlternative dslAlternative = (DSLAlternative)theEObject;
        T result = caseDSLAlternative(dslAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DCL_STRUCTURE_ELEMENT:
      {
        DCLStructureElement dclStructureElement = (DCLStructureElement)theEObject;
        T result = caseDCLStructureElement(dclStructureElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DCL_LAYER:
      {
        DCLLayer dclLayer = (DCLLayer)theEObject;
        T result = caseDCLLayer(dclLayer);
        if (result == null) result = caseDCLStructureElement(dclLayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DCL_COMPONENT:
      {
        DCLComponent dclComponent = (DCLComponent)theEObject;
        T result = caseDCLComponent(dclComponent);
        if (result == null) result = caseDCLStructureElement(dclComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DCL_COMPONENT_INTERFACE:
      {
        DCLComponentInterface dclComponentInterface = (DCLComponentInterface)theEObject;
        T result = caseDCLComponentInterface(dclComponentInterface);
        if (result == null) result = caseDCLStructureElement(dclComponentInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.INTERFACE_TYPE:
      {
        InterfaceType interfaceType = (InterfaceType)theEObject;
        T result = caseInterfaceType(interfaceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DCL_SUB_SYSTEM:
      {
        DCLSubSystem dclSubSystem = (DCLSubSystem)theEObject;
        T result = caseDCLSubSystem(dclSubSystem);
        if (result == null) result = caseDCLStructureElement(dclSubSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DCL_MODULE:
      {
        DCLModule dclModule = (DCLModule)theEObject;
        T result = caseDCLModule(dclModule);
        if (result == null) result = caseDCLStructureElement(dclModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.DC_DECL:
      {
        DCDecl dcDecl = (DCDecl)theEObject;
        T result = caseDCDecl(dcDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.ONLY:
      {
        Only only = (Only)theEObject;
        T result = caseOnly(only);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.CAN:
      {
        Can can = (Can)theEObject;
        T result = caseCan(can);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.CANNOT:
      {
        Cannot cannot = (Cannot)theEObject;
        T result = caseCannot(cannot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.ONLY2:
      {
        Only2 only2 = (Only2)theEObject;
        T result = caseOnly2(only2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.MUST:
      {
        Must must = (Must)theEObject;
        T result = caseMust(must);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.ELEMENT_TYPE:
      {
        ElementType elementType = (ElementType)theEObject;
        T result = caseElementType(elementType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.BASIC_TYPE:
      {
        BasicType basicType = (BasicType)theEObject;
        T result = caseBasicType(basicType);
        if (result == null) result = caseElementType(basicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SasDslPackage.ENTITY_TYPE:
      {
        EntityType entityType = (EntityType)theEObject;
        T result = caseEntityType(entityType);
        if (result == null) result = caseElementType(entityType);
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
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule Knowledge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule Knowledge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRuleKnowledge(DSLRuleKnowledge object)
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
   * Returns the result of interpreting the object as an instance of '<em>DSL Rule Generic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Rule Generic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLRuleGeneric(DSLRuleGeneric object)
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
   * Returns the result of interpreting the object as an instance of '<em>DSL Domain Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Domain Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLDomainRule(DSLDomainRule object)
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
   * Returns the result of interpreting the object as an instance of '<em>DSL Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLAlternative(DSLAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DCL Structure Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DCL Structure Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLStructureElement(DCLStructureElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DCL Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DCL Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLLayer(DCLLayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DCL Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DCL Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLComponent(DCLComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DCL Component Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DCL Component Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLComponentInterface(DCLComponentInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceType(InterfaceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DCL Sub System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DCL Sub System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLSubSystem(DCLSubSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DCL Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DCL Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLModule(DCLModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DC Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DC Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCDecl(DCDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Only</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Only</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnly(Only object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Can</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Can</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCan(Can object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cannot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cannot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCannot(Cannot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Only2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Only2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnly2(Only2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Must</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Must</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMust(Must object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementType(ElementType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicType(BasicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityType(EntityType object)
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
