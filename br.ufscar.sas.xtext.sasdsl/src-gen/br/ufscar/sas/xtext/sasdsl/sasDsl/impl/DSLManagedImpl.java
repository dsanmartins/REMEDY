/**
 * generated by Xtext 2.21.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DCLStructureElement;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffector;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaged;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOutput;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLSensor;
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
 * An implementation of the model object '<em><b>DSL Managed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLManagedImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLManagedImpl#getStructureElements <em>Structure Elements</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLManagedImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLManagedImpl#getEffector <em>Effector</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLManagedImpl#getMeasuredOutput <em>Measured Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLManagedImpl extends MinimalEObjectImpl.Container implements DSLManaged
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
   * The cached value of the '{@link #getStructureElements() <em>Structure Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructureElements()
   * @generated
   * @ordered
   */
  protected EList<DCLStructureElement> structureElements;

  /**
   * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensor()
   * @generated
   * @ordered
   */
  protected EList<DSLSensor> sensor;

  /**
   * The cached value of the '{@link #getEffector() <em>Effector</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffector()
   * @generated
   * @ordered
   */
  protected EList<DSLEffector> effector;

  /**
   * The cached value of the '{@link #getMeasuredOutput() <em>Measured Output</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasuredOutput()
   * @generated
   * @ordered
   */
  protected EList<DSLMeasuredOutput> measuredOutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLManagedImpl()
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
    return SasDslPackage.Literals.DSL_MANAGED;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_MANAGED__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DCLStructureElement> getStructureElements()
  {
    if (structureElements == null)
    {
      structureElements = new EObjectContainmentEList<DCLStructureElement>(DCLStructureElement.class, this, SasDslPackage.DSL_MANAGED__STRUCTURE_ELEMENTS);
    }
    return structureElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DSLSensor> getSensor()
  {
    if (sensor == null)
    {
      sensor = new EObjectContainmentEList<DSLSensor>(DSLSensor.class, this, SasDslPackage.DSL_MANAGED__SENSOR);
    }
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DSLEffector> getEffector()
  {
    if (effector == null)
    {
      effector = new EObjectContainmentEList<DSLEffector>(DSLEffector.class, this, SasDslPackage.DSL_MANAGED__EFFECTOR);
    }
    return effector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DSLMeasuredOutput> getMeasuredOutput()
  {
    if (measuredOutput == null)
    {
      measuredOutput = new EObjectContainmentEList<DSLMeasuredOutput>(DSLMeasuredOutput.class, this, SasDslPackage.DSL_MANAGED__MEASURED_OUTPUT);
    }
    return measuredOutput;
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
      case SasDslPackage.DSL_MANAGED__STRUCTURE_ELEMENTS:
        return ((InternalEList<?>)getStructureElements()).basicRemove(otherEnd, msgs);
      case SasDslPackage.DSL_MANAGED__SENSOR:
        return ((InternalEList<?>)getSensor()).basicRemove(otherEnd, msgs);
      case SasDslPackage.DSL_MANAGED__EFFECTOR:
        return ((InternalEList<?>)getEffector()).basicRemove(otherEnd, msgs);
      case SasDslPackage.DSL_MANAGED__MEASURED_OUTPUT:
        return ((InternalEList<?>)getMeasuredOutput()).basicRemove(otherEnd, msgs);
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
      case SasDslPackage.DSL_MANAGED__NAME:
        return getName();
      case SasDslPackage.DSL_MANAGED__STRUCTURE_ELEMENTS:
        return getStructureElements();
      case SasDslPackage.DSL_MANAGED__SENSOR:
        return getSensor();
      case SasDslPackage.DSL_MANAGED__EFFECTOR:
        return getEffector();
      case SasDslPackage.DSL_MANAGED__MEASURED_OUTPUT:
        return getMeasuredOutput();
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
      case SasDslPackage.DSL_MANAGED__NAME:
        setName((String)newValue);
        return;
      case SasDslPackage.DSL_MANAGED__STRUCTURE_ELEMENTS:
        getStructureElements().clear();
        getStructureElements().addAll((Collection<? extends DCLStructureElement>)newValue);
        return;
      case SasDslPackage.DSL_MANAGED__SENSOR:
        getSensor().clear();
        getSensor().addAll((Collection<? extends DSLSensor>)newValue);
        return;
      case SasDslPackage.DSL_MANAGED__EFFECTOR:
        getEffector().clear();
        getEffector().addAll((Collection<? extends DSLEffector>)newValue);
        return;
      case SasDslPackage.DSL_MANAGED__MEASURED_OUTPUT:
        getMeasuredOutput().clear();
        getMeasuredOutput().addAll((Collection<? extends DSLMeasuredOutput>)newValue);
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
      case SasDslPackage.DSL_MANAGED__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SasDslPackage.DSL_MANAGED__STRUCTURE_ELEMENTS:
        getStructureElements().clear();
        return;
      case SasDslPackage.DSL_MANAGED__SENSOR:
        getSensor().clear();
        return;
      case SasDslPackage.DSL_MANAGED__EFFECTOR:
        getEffector().clear();
        return;
      case SasDslPackage.DSL_MANAGED__MEASURED_OUTPUT:
        getMeasuredOutput().clear();
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
      case SasDslPackage.DSL_MANAGED__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SasDslPackage.DSL_MANAGED__STRUCTURE_ELEMENTS:
        return structureElements != null && !structureElements.isEmpty();
      case SasDslPackage.DSL_MANAGED__SENSOR:
        return sensor != null && !sensor.isEmpty();
      case SasDslPackage.DSL_MANAGED__EFFECTOR:
        return effector != null && !effector.isEmpty();
      case SasDslPackage.DSL_MANAGED__MEASURED_OUTPUT:
        return measuredOutput != null && !measuredOutput.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //DSLManagedImpl
