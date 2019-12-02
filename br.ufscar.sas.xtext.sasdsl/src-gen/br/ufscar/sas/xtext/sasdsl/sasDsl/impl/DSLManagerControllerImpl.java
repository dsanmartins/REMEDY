/**
 * generated by Xtext 2.16.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManagerController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Manager Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLManagerControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLManagerControllerImpl#getDslTypeMC <em>Dsl Type MC</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLManagerControllerImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLManagerControllerImpl extends MinimalEObjectImpl.Container implements DSLManagerController
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDslTypeMC() <em>Dsl Type MC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslTypeMC()
   * @generated
   * @ordered
   */
  protected static final String DSL_TYPE_MC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDslTypeMC() <em>Dsl Type MC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslTypeMC()
   * @generated
   * @ordered
   */
  protected String dslTypeMC = DSL_TYPE_MC_EDEFAULT;

  /**
   * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getController()
   * @generated
   * @ordered
   */
  protected EList<DSLController> controller;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLManagerControllerImpl()
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
    return SasDslPackage.Literals.DSL_MANAGER_CONTROLLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_MANAGER_CONTROLLER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDslTypeMC()
  {
    return dslTypeMC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDslTypeMC(String newDslTypeMC)
  {
    String oldDslTypeMC = dslTypeMC;
    dslTypeMC = newDslTypeMC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_MANAGER_CONTROLLER__DSL_TYPE_MC, oldDslTypeMC, dslTypeMC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DSLController> getController()
  {
    if (controller == null)
    {
      controller = new EObjectContainmentEList<DSLController>(DSLController.class, this, SasDslPackage.DSL_MANAGER_CONTROLLER__CONTROLLER);
    }
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SasDslPackage.DSL_MANAGER_CONTROLLER__CONTROLLER:
        return ((InternalEList<?>)getController()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SasDslPackage.DSL_MANAGER_CONTROLLER__NAME:
        return getName();
      case SasDslPackage.DSL_MANAGER_CONTROLLER__DSL_TYPE_MC:
        return getDslTypeMC();
      case SasDslPackage.DSL_MANAGER_CONTROLLER__CONTROLLER:
        return getController();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SasDslPackage.DSL_MANAGER_CONTROLLER__NAME:
        setName((String)newValue);
        return;
      case SasDslPackage.DSL_MANAGER_CONTROLLER__DSL_TYPE_MC:
        setDslTypeMC((String)newValue);
        return;
      case SasDslPackage.DSL_MANAGER_CONTROLLER__CONTROLLER:
        getController().clear();
        getController().addAll((Collection<? extends DSLController>)newValue);
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
      case SasDslPackage.DSL_MANAGER_CONTROLLER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SasDslPackage.DSL_MANAGER_CONTROLLER__DSL_TYPE_MC:
        setDslTypeMC(DSL_TYPE_MC_EDEFAULT);
        return;
      case SasDslPackage.DSL_MANAGER_CONTROLLER__CONTROLLER:
        getController().clear();
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
      case SasDslPackage.DSL_MANAGER_CONTROLLER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SasDslPackage.DSL_MANAGER_CONTROLLER__DSL_TYPE_MC:
        return DSL_TYPE_MC_EDEFAULT == null ? dslTypeMC != null : !DSL_TYPE_MC_EDEFAULT.equals(dslTypeMC);
      case SasDslPackage.DSL_MANAGER_CONTROLLER__CONTROLLER:
        return controller != null && !controller.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", dslTypeMC: ");
    result.append(dslTypeMC);
    result.append(')');
    return result.toString();
  }

} //DSLManagerControllerImpl
