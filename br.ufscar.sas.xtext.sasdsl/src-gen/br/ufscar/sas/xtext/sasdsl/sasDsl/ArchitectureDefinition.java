/**
 * generated by Xtext 2.21.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getName <em>Name</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getManaging <em>Managing</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getManaged <em>Managed</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getRules <em>Rules</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getDCDecl <em>DC Decl</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition()
 * @model
 * @generated
 */
public interface ArchitectureDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Managing</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaging}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Managing</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition_Managing()
   * @model containment="true"
   * @generated
   */
  EList<DSLManaging> getManaging();

  /**
   * Returns the value of the '<em><b>Managed</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Managed</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition_Managed()
   * @model containment="true"
   * @generated
   */
  EList<DSLManaged> getManaged();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRules}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition_Rules()
   * @model containment="true"
   * @generated
   */
  EList<DSLRules> getRules();

  /**
   * Returns the value of the '<em><b>DC Decl</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>DC Decl</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition_DCDecl()
   * @model containment="true"
   * @generated
   */
  EList<DCDecl> getDCDecl();

} // ArchitectureDefinition
