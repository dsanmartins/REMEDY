/**
 * generated by Xtext 2.16.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffector;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Rule Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleExecutorImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleExecutorImpl#getEffector <em>Effector</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleExecutorImpl#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleExecutorImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleExecutorImpl#getExecutor2 <em>Executor2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLRuleExecutorImpl extends DSLRulesImpl implements DSLRuleExecutor
{
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
   * The cached value of the '{@link #getEffector() <em>Effector</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffector()
   * @generated
   * @ordered
   */
  protected DSLEffector effector;

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
   * The cached value of the '{@link #getExecutor2() <em>Executor2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutor2()
   * @generated
   * @ordered
   */
  protected DSLExecutor executor2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLRuleExecutorImpl()
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
    return SasDslPackage.Literals.DSL_RULE_EXECUTOR;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR, oldExecutor, executor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR, oldExecutor, executor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLEffector getEffector()
  {
    if (effector != null && effector.eIsProxy())
    {
      InternalEObject oldEffector = (InternalEObject)effector;
      effector = (DSLEffector)eResolveProxy(oldEffector);
      if (effector != oldEffector)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_EXECUTOR__EFFECTOR, oldEffector, effector));
      }
    }
    return effector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLEffector basicGetEffector()
  {
    return effector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEffector(DSLEffector newEffector)
  {
    DSLEffector oldEffector = effector;
    effector = newEffector;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_EXECUTOR__EFFECTOR, oldEffector, effector));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_EXECUTOR__PLANNER, oldPlanner, planner));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_EXECUTOR__PLANNER, oldPlanner, planner));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_EXECUTOR__KNOWLEDGE, oldKnowledge, knowledge));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_EXECUTOR__KNOWLEDGE, oldKnowledge, knowledge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLExecutor getExecutor2()
  {
    if (executor2 != null && executor2.eIsProxy())
    {
      InternalEObject oldExecutor2 = (InternalEObject)executor2;
      executor2 = (DSLExecutor)eResolveProxy(oldExecutor2);
      if (executor2 != oldExecutor2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR2, oldExecutor2, executor2));
      }
    }
    return executor2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLExecutor basicGetExecutor2()
  {
    return executor2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExecutor2(DSLExecutor newExecutor2)
  {
    DSLExecutor oldExecutor2 = executor2;
    executor2 = newExecutor2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR2, oldExecutor2, executor2));
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
      case SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR:
        if (resolve) return getExecutor();
        return basicGetExecutor();
      case SasDslPackage.DSL_RULE_EXECUTOR__EFFECTOR:
        if (resolve) return getEffector();
        return basicGetEffector();
      case SasDslPackage.DSL_RULE_EXECUTOR__PLANNER:
        if (resolve) return getPlanner();
        return basicGetPlanner();
      case SasDslPackage.DSL_RULE_EXECUTOR__KNOWLEDGE:
        if (resolve) return getKnowledge();
        return basicGetKnowledge();
      case SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR2:
        if (resolve) return getExecutor2();
        return basicGetExecutor2();
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
      case SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR:
        setExecutor((DSLExecutor)newValue);
        return;
      case SasDslPackage.DSL_RULE_EXECUTOR__EFFECTOR:
        setEffector((DSLEffector)newValue);
        return;
      case SasDslPackage.DSL_RULE_EXECUTOR__PLANNER:
        setPlanner((DSLPlanner)newValue);
        return;
      case SasDslPackage.DSL_RULE_EXECUTOR__KNOWLEDGE:
        setKnowledge((DSLKnowledge)newValue);
        return;
      case SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR2:
        setExecutor2((DSLExecutor)newValue);
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
      case SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR:
        setExecutor((DSLExecutor)null);
        return;
      case SasDslPackage.DSL_RULE_EXECUTOR__EFFECTOR:
        setEffector((DSLEffector)null);
        return;
      case SasDslPackage.DSL_RULE_EXECUTOR__PLANNER:
        setPlanner((DSLPlanner)null);
        return;
      case SasDslPackage.DSL_RULE_EXECUTOR__KNOWLEDGE:
        setKnowledge((DSLKnowledge)null);
        return;
      case SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR2:
        setExecutor2((DSLExecutor)null);
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
      case SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR:
        return executor != null;
      case SasDslPackage.DSL_RULE_EXECUTOR__EFFECTOR:
        return effector != null;
      case SasDslPackage.DSL_RULE_EXECUTOR__PLANNER:
        return planner != null;
      case SasDslPackage.DSL_RULE_EXECUTOR__KNOWLEDGE:
        return knowledge != null;
      case SasDslPackage.DSL_RULE_EXECUTOR__EXECUTOR2:
        return executor2 != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLRuleExecutorImpl
