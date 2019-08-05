/**
 * generated by Xtext 2.16.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Rule Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getPlanner2 <em>Planner2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLRulePlannerImpl extends DSLRulesImpl implements DSLRulePlanner
{
  /**
   * The cached value of the '{@link #getPlanner() <em>Planner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanner()
   * @generated
   * @ordered
   */
  protected DSLPlanner planner;

  /**
   * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledge()
   * @generated
   * @ordered
   */
  protected DSLKnowledge knowledge;

  /**
   * The cached value of the '{@link #getAnalyzer() <em>Analyzer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalyzer()
   * @generated
   * @ordered
   */
  protected DSLAnalyzer analyzer;

  /**
   * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutor()
   * @generated
   * @ordered
   */
  protected DSLExecutor executor;

  /**
   * The cached value of the '{@link #getPlanner2() <em>Planner2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanner2()
   * @generated
   * @ordered
   */
  protected DSLPlanner planner2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLRulePlannerImpl()
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
    return SasDslPackage.Literals.DSL_RULE_PLANNER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLPlanner getPlanner()
  {
    if (planner != null && planner.eIsProxy())
    {
      InternalEObject oldPlanner = (InternalEObject)planner;
      planner = (DSLPlanner)eResolveProxy(oldPlanner);
      if (planner != oldPlanner)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__PLANNER, oldPlanner, planner));
      }
    }
    return planner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPlanner basicGetPlanner()
  {
    return planner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPlanner(DSLPlanner newPlanner)
  {
    DSLPlanner oldPlanner = planner;
    planner = newPlanner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__PLANNER, oldPlanner, planner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLKnowledge getKnowledge()
  {
    if (knowledge != null && knowledge.eIsProxy())
    {
      InternalEObject oldKnowledge = (InternalEObject)knowledge;
      knowledge = (DSLKnowledge)eResolveProxy(oldKnowledge);
      if (knowledge != oldKnowledge)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE, oldKnowledge, knowledge));
      }
    }
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLKnowledge basicGetKnowledge()
  {
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKnowledge(DSLKnowledge newKnowledge)
  {
    DSLKnowledge oldKnowledge = knowledge;
    knowledge = newKnowledge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE, oldKnowledge, knowledge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLAnalyzer getAnalyzer()
  {
    if (analyzer != null && analyzer.eIsProxy())
    {
      InternalEObject oldAnalyzer = (InternalEObject)analyzer;
      analyzer = (DSLAnalyzer)eResolveProxy(oldAnalyzer);
      if (analyzer != oldAnalyzer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__ANALYZER, oldAnalyzer, analyzer));
      }
    }
    return analyzer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAnalyzer basicGetAnalyzer()
  {
    return analyzer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAnalyzer(DSLAnalyzer newAnalyzer)
  {
    DSLAnalyzer oldAnalyzer = analyzer;
    analyzer = newAnalyzer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__ANALYZER, oldAnalyzer, analyzer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLExecutor getExecutor()
  {
    if (executor != null && executor.eIsProxy())
    {
      InternalEObject oldExecutor = (InternalEObject)executor;
      executor = (DSLExecutor)eResolveProxy(oldExecutor);
      if (executor != oldExecutor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__EXECUTOR, oldExecutor, executor));
      }
    }
    return executor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLExecutor basicGetExecutor()
  {
    return executor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExecutor(DSLExecutor newExecutor)
  {
    DSLExecutor oldExecutor = executor;
    executor = newExecutor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__EXECUTOR, oldExecutor, executor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLPlanner getPlanner2()
  {
    if (planner2 != null && planner2.eIsProxy())
    {
      InternalEObject oldPlanner2 = (InternalEObject)planner2;
      planner2 = (DSLPlanner)eResolveProxy(oldPlanner2);
      if (planner2 != oldPlanner2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__PLANNER2, oldPlanner2, planner2));
      }
    }
    return planner2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPlanner basicGetPlanner2()
  {
    return planner2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPlanner2(DSLPlanner newPlanner2)
  {
    DSLPlanner oldPlanner2 = planner2;
    planner2 = newPlanner2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__PLANNER2, oldPlanner2, planner2));
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
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER:
        if (resolve) return getPlanner();
        return basicGetPlanner();
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE:
        if (resolve) return getKnowledge();
        return basicGetKnowledge();
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZER:
        if (resolve) return getAnalyzer();
        return basicGetAnalyzer();
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTOR:
        if (resolve) return getExecutor();
        return basicGetExecutor();
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER2:
        if (resolve) return getPlanner2();
        return basicGetPlanner2();
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
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER:
        setPlanner((DSLPlanner)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE:
        setKnowledge((DSLKnowledge)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZER:
        setAnalyzer((DSLAnalyzer)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTOR:
        setExecutor((DSLExecutor)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER2:
        setPlanner2((DSLPlanner)newValue);
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
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER:
        setPlanner((DSLPlanner)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE:
        setKnowledge((DSLKnowledge)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZER:
        setAnalyzer((DSLAnalyzer)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTOR:
        setExecutor((DSLExecutor)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER2:
        setPlanner2((DSLPlanner)null);
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
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER:
        return planner != null;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE:
        return knowledge != null;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZER:
        return analyzer != null;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTOR:
        return executor != null;
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER2:
        return planner2 != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLRulePlannerImpl
