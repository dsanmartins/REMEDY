/**
 * generated by Xtext 2.21.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Rule Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getExecutor <em>Executor</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleKnowledge()
 * @model
 * @generated
 */
public interface DSLRuleKnowledge extends DSLRules
{
  /**
   * Returns the value of the '<em><b>Knowledge</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledge</em>' reference.
   * @see #setKnowledge(DSLKnowledge)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleKnowledge_Knowledge()
   * @model
   * @generated
   */
  DSLKnowledge getKnowledge();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getKnowledge <em>Knowledge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledge</em>' reference.
   * @see #getKnowledge()
   * @generated
   */
  void setKnowledge(DSLKnowledge value);

  /**
   * Returns the value of the '<em><b>Monitor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monitor</em>' reference.
   * @see #setMonitor(DSLMonitor)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleKnowledge_Monitor()
   * @model
   * @generated
   */
  DSLMonitor getMonitor();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getMonitor <em>Monitor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Monitor</em>' reference.
   * @see #getMonitor()
   * @generated
   */
  void setMonitor(DSLMonitor value);

  /**
   * Returns the value of the '<em><b>Analyzer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Analyzer</em>' reference.
   * @see #setAnalyzer(DSLAnalyzer)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleKnowledge_Analyzer()
   * @model
   * @generated
   */
  DSLAnalyzer getAnalyzer();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getAnalyzer <em>Analyzer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Analyzer</em>' reference.
   * @see #getAnalyzer()
   * @generated
   */
  void setAnalyzer(DSLAnalyzer value);

  /**
   * Returns the value of the '<em><b>Planner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Planner</em>' reference.
   * @see #setPlanner(DSLPlanner)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleKnowledge_Planner()
   * @model
   * @generated
   */
  DSLPlanner getPlanner();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getPlanner <em>Planner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Planner</em>' reference.
   * @see #getPlanner()
   * @generated
   */
  void setPlanner(DSLPlanner value);

  /**
   * Returns the value of the '<em><b>Executor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executor</em>' reference.
   * @see #setExecutor(DSLExecutor)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleKnowledge_Executor()
   * @model
   * @generated
   */
  DSLExecutor getExecutor();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleKnowledge#getExecutor <em>Executor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Executor</em>' reference.
   * @see #getExecutor()
   * @generated
   */
  void setExecutor(DSLExecutor value);

} // DSLRuleKnowledge
