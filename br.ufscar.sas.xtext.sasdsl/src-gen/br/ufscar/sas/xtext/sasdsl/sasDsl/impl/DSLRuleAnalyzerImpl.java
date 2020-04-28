/**
 * generated by Xtext 2.21.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAlternative;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInput;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Rule Analyzer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleAnalyzerImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleAnalyzerImpl#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleAnalyzerImpl#getAnalyzer2 <em>Analyzer2</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleAnalyzerImpl#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleAnalyzerImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleAnalyzerImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleAnalyzerImpl#getRreference <em>Rreference</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleAnalyzerImpl#getShalt <em>Shalt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLRuleAnalyzerImpl extends DSLRulesImpl implements DSLRuleAnalyzer
{
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
   * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitor()
   * @generated
   * @ordered
   */
  protected DSLMonitor monitor;

  /**
   * The cached value of the '{@link #getAnalyzer2() <em>Analyzer2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalyzer2()
   * @generated
   * @ordered
   */
  protected DSLAnalyzer analyzer2;

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
   * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutor()
   * @generated
   * @ordered
   */
  protected DSLExecutor executor;

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
   * The cached value of the '{@link #getRreference() <em>Rreference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRreference()
   * @generated
   * @ordered
   */
  protected DSLReferenceInput rreference;

  /**
   * The cached value of the '{@link #getShalt() <em>Shalt</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShalt()
   * @generated
   * @ordered
   */
  protected DSLAlternative shalt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLRuleAnalyzerImpl()
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
    return SasDslPackage.Literals.DSL_RULE_ANALYZER;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_ANALYZER__ANALYZER, oldAnalyzer, analyzer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_ANALYZER__ANALYZER, oldAnalyzer, analyzer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLMonitor getMonitor()
  {
    if (monitor != null && monitor.eIsProxy())
    {
      InternalEObject oldMonitor = (InternalEObject)monitor;
      monitor = (DSLMonitor)eResolveProxy(oldMonitor);
      if (monitor != oldMonitor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_ANALYZER__MONITOR, oldMonitor, monitor));
      }
    }
    return monitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLMonitor basicGetMonitor()
  {
    return monitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMonitor(DSLMonitor newMonitor)
  {
    DSLMonitor oldMonitor = monitor;
    monitor = newMonitor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_ANALYZER__MONITOR, oldMonitor, monitor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLAnalyzer getAnalyzer2()
  {
    if (analyzer2 != null && analyzer2.eIsProxy())
    {
      InternalEObject oldAnalyzer2 = (InternalEObject)analyzer2;
      analyzer2 = (DSLAnalyzer)eResolveProxy(oldAnalyzer2);
      if (analyzer2 != oldAnalyzer2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_ANALYZER__ANALYZER2, oldAnalyzer2, analyzer2));
      }
    }
    return analyzer2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAnalyzer basicGetAnalyzer2()
  {
    return analyzer2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAnalyzer2(DSLAnalyzer newAnalyzer2)
  {
    DSLAnalyzer oldAnalyzer2 = analyzer2;
    analyzer2 = newAnalyzer2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_ANALYZER__ANALYZER2, oldAnalyzer2, analyzer2));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_ANALYZER__PLANNER, oldPlanner, planner));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_ANALYZER__PLANNER, oldPlanner, planner));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_ANALYZER__EXECUTOR, oldExecutor, executor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_ANALYZER__EXECUTOR, oldExecutor, executor));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_ANALYZER__KNOWLEDGE, oldKnowledge, knowledge));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_ANALYZER__KNOWLEDGE, oldKnowledge, knowledge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLReferenceInput getRreference()
  {
    if (rreference != null && rreference.eIsProxy())
    {
      InternalEObject oldRreference = (InternalEObject)rreference;
      rreference = (DSLReferenceInput)eResolveProxy(oldRreference);
      if (rreference != oldRreference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_ANALYZER__RREFERENCE, oldRreference, rreference));
      }
    }
    return rreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLReferenceInput basicGetRreference()
  {
    return rreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRreference(DSLReferenceInput newRreference)
  {
    DSLReferenceInput oldRreference = rreference;
    rreference = newRreference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_ANALYZER__RREFERENCE, oldRreference, rreference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLAlternative getShalt()
  {
    if (shalt != null && shalt.eIsProxy())
    {
      InternalEObject oldShalt = (InternalEObject)shalt;
      shalt = (DSLAlternative)eResolveProxy(oldShalt);
      if (shalt != oldShalt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_ANALYZER__SHALT, oldShalt, shalt));
      }
    }
    return shalt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAlternative basicGetShalt()
  {
    return shalt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setShalt(DSLAlternative newShalt)
  {
    DSLAlternative oldShalt = shalt;
    shalt = newShalt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_ANALYZER__SHALT, oldShalt, shalt));
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
      case SasDslPackage.DSL_RULE_ANALYZER__ANALYZER:
        if (resolve) return getAnalyzer();
        return basicGetAnalyzer();
      case SasDslPackage.DSL_RULE_ANALYZER__MONITOR:
        if (resolve) return getMonitor();
        return basicGetMonitor();
      case SasDslPackage.DSL_RULE_ANALYZER__ANALYZER2:
        if (resolve) return getAnalyzer2();
        return basicGetAnalyzer2();
      case SasDslPackage.DSL_RULE_ANALYZER__PLANNER:
        if (resolve) return getPlanner();
        return basicGetPlanner();
      case SasDslPackage.DSL_RULE_ANALYZER__EXECUTOR:
        if (resolve) return getExecutor();
        return basicGetExecutor();
      case SasDslPackage.DSL_RULE_ANALYZER__KNOWLEDGE:
        if (resolve) return getKnowledge();
        return basicGetKnowledge();
      case SasDslPackage.DSL_RULE_ANALYZER__RREFERENCE:
        if (resolve) return getRreference();
        return basicGetRreference();
      case SasDslPackage.DSL_RULE_ANALYZER__SHALT:
        if (resolve) return getShalt();
        return basicGetShalt();
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
      case SasDslPackage.DSL_RULE_ANALYZER__ANALYZER:
        setAnalyzer((DSLAnalyzer)newValue);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__MONITOR:
        setMonitor((DSLMonitor)newValue);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__ANALYZER2:
        setAnalyzer2((DSLAnalyzer)newValue);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__PLANNER:
        setPlanner((DSLPlanner)newValue);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__EXECUTOR:
        setExecutor((DSLExecutor)newValue);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__KNOWLEDGE:
        setKnowledge((DSLKnowledge)newValue);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__RREFERENCE:
        setRreference((DSLReferenceInput)newValue);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__SHALT:
        setShalt((DSLAlternative)newValue);
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
      case SasDslPackage.DSL_RULE_ANALYZER__ANALYZER:
        setAnalyzer((DSLAnalyzer)null);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__MONITOR:
        setMonitor((DSLMonitor)null);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__ANALYZER2:
        setAnalyzer2((DSLAnalyzer)null);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__PLANNER:
        setPlanner((DSLPlanner)null);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__EXECUTOR:
        setExecutor((DSLExecutor)null);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__KNOWLEDGE:
        setKnowledge((DSLKnowledge)null);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__RREFERENCE:
        setRreference((DSLReferenceInput)null);
        return;
      case SasDslPackage.DSL_RULE_ANALYZER__SHALT:
        setShalt((DSLAlternative)null);
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
      case SasDslPackage.DSL_RULE_ANALYZER__ANALYZER:
        return analyzer != null;
      case SasDslPackage.DSL_RULE_ANALYZER__MONITOR:
        return monitor != null;
      case SasDslPackage.DSL_RULE_ANALYZER__ANALYZER2:
        return analyzer2 != null;
      case SasDslPackage.DSL_RULE_ANALYZER__PLANNER:
        return planner != null;
      case SasDslPackage.DSL_RULE_ANALYZER__EXECUTOR:
        return executor != null;
      case SasDslPackage.DSL_RULE_ANALYZER__KNOWLEDGE:
        return knowledge != null;
      case SasDslPackage.DSL_RULE_ANALYZER__RREFERENCE:
        return rreference != null;
      case SasDslPackage.DSL_RULE_ANALYZER__SHALT:
        return shalt != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLRuleAnalyzerImpl
