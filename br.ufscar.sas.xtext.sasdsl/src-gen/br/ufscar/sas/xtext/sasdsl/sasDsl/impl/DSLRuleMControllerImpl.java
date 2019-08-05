/**
 * generated by Xtext 2.16.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManagerController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Rule MController</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleMControllerImpl#getMcontroller1 <em>Mcontroller1</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleMControllerImpl#getMcontroller2 <em>Mcontroller2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLRuleMControllerImpl extends DSLRulesImpl implements DSLRuleMController
{
  /**
   * The cached value of the '{@link #getMcontroller1() <em>Mcontroller1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMcontroller1()
   * @generated
   * @ordered
   */
  protected DSLManagerController mcontroller1;

  /**
   * The cached value of the '{@link #getMcontroller2() <em>Mcontroller2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMcontroller2()
   * @generated
   * @ordered
   */
  protected DSLManagerController mcontroller2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLRuleMControllerImpl()
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
    return SasDslPackage.Literals.DSL_RULE_MCONTROLLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLManagerController getMcontroller1()
  {
    if (mcontroller1 != null && mcontroller1.eIsProxy())
    {
      InternalEObject oldMcontroller1 = (InternalEObject)mcontroller1;
      mcontroller1 = (DSLManagerController)eResolveProxy(oldMcontroller1);
      if (mcontroller1 != oldMcontroller1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER1, oldMcontroller1, mcontroller1));
      }
    }
    return mcontroller1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLManagerController basicGetMcontroller1()
  {
    return mcontroller1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMcontroller1(DSLManagerController newMcontroller1)
  {
    DSLManagerController oldMcontroller1 = mcontroller1;
    mcontroller1 = newMcontroller1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER1, oldMcontroller1, mcontroller1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLManagerController getMcontroller2()
  {
    if (mcontroller2 != null && mcontroller2.eIsProxy())
    {
      InternalEObject oldMcontroller2 = (InternalEObject)mcontroller2;
      mcontroller2 = (DSLManagerController)eResolveProxy(oldMcontroller2);
      if (mcontroller2 != oldMcontroller2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER2, oldMcontroller2, mcontroller2));
      }
    }
    return mcontroller2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLManagerController basicGetMcontroller2()
  {
    return mcontroller2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMcontroller2(DSLManagerController newMcontroller2)
  {
    DSLManagerController oldMcontroller2 = mcontroller2;
    mcontroller2 = newMcontroller2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER2, oldMcontroller2, mcontroller2));
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
      case SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER1:
        if (resolve) return getMcontroller1();
        return basicGetMcontroller1();
      case SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER2:
        if (resolve) return getMcontroller2();
        return basicGetMcontroller2();
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
      case SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER1:
        setMcontroller1((DSLManagerController)newValue);
        return;
      case SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER2:
        setMcontroller2((DSLManagerController)newValue);
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
      case SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER1:
        setMcontroller1((DSLManagerController)null);
        return;
      case SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER2:
        setMcontroller2((DSLManagerController)null);
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
      case SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER1:
        return mcontroller1 != null;
      case SasDslPackage.DSL_RULE_MCONTROLLER__MCONTROLLER2:
        return mcontroller2 != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLRuleMControllerImpl
