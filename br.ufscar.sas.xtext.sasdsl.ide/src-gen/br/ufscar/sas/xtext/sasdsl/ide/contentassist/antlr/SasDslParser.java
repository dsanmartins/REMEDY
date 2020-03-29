/*
 * generated by Xtext 2.21.0
 */
package br.ufscar.sas.xtext.sasdsl.ide.contentassist.antlr;

import br.ufscar.sas.xtext.sasdsl.ide.contentassist.antlr.internal.InternalSasDslParser;
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SasDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SasDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SasDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDSLRulesAccess().getAlternatives(), "rule__DSLRules__Alternatives");
			builder.put(grammarAccess.getDSLRuleMControllerAccess().getAccessAlternatives_2_0(), "rule__DSLRuleMController__AccessAlternatives_2_0");
			builder.put(grammarAccess.getDSLRuleControllerAccess().getAccessAlternatives_2_0(), "rule__DSLRuleController__AccessAlternatives_2_0");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAlternatives(), "rule__DSLRuleMonitor__Alternatives");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAccessAlternatives_0_2_0(), "rule__DSLRuleMonitor__AccessAlternatives_0_2_0");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAccessAlternatives_1_2_0(), "rule__DSLRuleMonitor__AccessAlternatives_1_2_0");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAccessAlternatives_2_2_0(), "rule__DSLRuleMonitor__AccessAlternatives_2_2_0");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAccessAlternatives_3_2_0(), "rule__DSLRuleMonitor__AccessAlternatives_3_2_0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAlternatives(), "rule__DSLRuleAnalyzer__Alternatives");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAlternatives_0_2_0(), "rule__DSLRuleAnalyzer__AccessAlternatives_0_2_0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAlternatives_1_2_0(), "rule__DSLRuleAnalyzer__AccessAlternatives_1_2_0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAlternatives_2_2_0(), "rule__DSLRuleAnalyzer__AccessAlternatives_2_2_0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAlternatives_3_2_0(), "rule__DSLRuleAnalyzer__AccessAlternatives_3_2_0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAlternatives_4_2_0(), "rule__DSLRuleAnalyzer__AccessAlternatives_4_2_0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAlternatives_5_2_0(), "rule__DSLRuleAnalyzer__AccessAlternatives_5_2_0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAlternatives_6_2_0(), "rule__DSLRuleAnalyzer__AccessAlternatives_6_2_0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAlternatives(), "rule__DSLRulePlanner__Alternatives");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAlternatives_0_2_0(), "rule__DSLRulePlanner__AccessAlternatives_0_2_0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAlternatives_1_2_0(), "rule__DSLRulePlanner__AccessAlternatives_1_2_0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAlternatives_2_2_0(), "rule__DSLRulePlanner__AccessAlternatives_2_2_0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAlternatives_3_2_0(), "rule__DSLRulePlanner__AccessAlternatives_3_2_0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAlternatives_4_2_0(), "rule__DSLRulePlanner__AccessAlternatives_4_2_0");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAlternatives(), "rule__DSLRuleExecutor__Alternatives");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAccessAlternatives_0_2_0(), "rule__DSLRuleExecutor__AccessAlternatives_0_2_0");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAccessAlternatives_1_2_0(), "rule__DSLRuleExecutor__AccessAlternatives_1_2_0");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAccessAlternatives_2_2_0(), "rule__DSLRuleExecutor__AccessAlternatives_2_2_0");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAccessAlternatives_3_2_0(), "rule__DSLRuleExecutor__AccessAlternatives_3_2_0");
			builder.put(grammarAccess.getDSLRuleMOAccess().getAccessAlternatives_2_0(), "rule__DSLRuleMO__AccessAlternatives_2_0");
			builder.put(grammarAccess.getDSLTypeMCAccess().getAlternatives(), "rule__DSLTypeMC__Alternatives");
			builder.put(grammarAccess.getArchitectureDefinitionAccess().getGroup(), "rule__ArchitectureDefinition__Group__0");
			builder.put(grammarAccess.getDSLRuleMControllerAccess().getGroup(), "rule__DSLRuleMController__Group__0");
			builder.put(grammarAccess.getDSLRuleControllerAccess().getGroup(), "rule__DSLRuleController__Group__0");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getGroup_0(), "rule__DSLRuleMonitor__Group_0__0");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getGroup_1(), "rule__DSLRuleMonitor__Group_1__0");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getGroup_2(), "rule__DSLRuleMonitor__Group_2__0");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getGroup_3(), "rule__DSLRuleMonitor__Group_3__0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_0(), "rule__DSLRuleAnalyzer__Group_0__0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_1(), "rule__DSLRuleAnalyzer__Group_1__0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_2(), "rule__DSLRuleAnalyzer__Group_2__0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_3(), "rule__DSLRuleAnalyzer__Group_3__0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_4(), "rule__DSLRuleAnalyzer__Group_4__0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_5(), "rule__DSLRuleAnalyzer__Group_5__0");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_6(), "rule__DSLRuleAnalyzer__Group_6__0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getGroup_0(), "rule__DSLRulePlanner__Group_0__0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getGroup_1(), "rule__DSLRulePlanner__Group_1__0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getGroup_2(), "rule__DSLRulePlanner__Group_2__0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getGroup_3(), "rule__DSLRulePlanner__Group_3__0");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getGroup_4(), "rule__DSLRulePlanner__Group_4__0");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getGroup_0(), "rule__DSLRuleExecutor__Group_0__0");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getGroup_1(), "rule__DSLRuleExecutor__Group_1__0");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getGroup_2(), "rule__DSLRuleExecutor__Group_2__0");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getGroup_3(), "rule__DSLRuleExecutor__Group_3__0");
			builder.put(grammarAccess.getDSLRuleMOAccess().getGroup(), "rule__DSLRuleMO__Group__0");
			builder.put(grammarAccess.getDSLManagingAccess().getGroup(), "rule__DSLManaging__Group__0");
			builder.put(grammarAccess.getDSLManagedAccess().getGroup(), "rule__DSLManaged__Group__0");
			builder.put(grammarAccess.getDSLManagerControllerAccess().getGroup(), "rule__DSLManagerController__Group__0");
			builder.put(grammarAccess.getDSLControllerAccess().getGroup(), "rule__DSLController__Group__0");
			builder.put(grammarAccess.getDSLMonitorAccess().getGroup(), "rule__DSLMonitor__Group__0");
			builder.put(grammarAccess.getDSLAnalyzerAccess().getGroup(), "rule__DSLAnalyzer__Group__0");
			builder.put(grammarAccess.getDSLPlannerAccess().getGroup(), "rule__DSLPlanner__Group__0");
			builder.put(grammarAccess.getDSLExecutorAccess().getGroup(), "rule__DSLExecutor__Group__0");
			builder.put(grammarAccess.getDSLKnowledgeAccess().getGroup(), "rule__DSLKnowledge__Group__0");
			builder.put(grammarAccess.getDSLSensorAccess().getGroup(), "rule__DSLSensor__Group__0");
			builder.put(grammarAccess.getDSLEffectorAccess().getGroup(), "rule__DSLEffector__Group__0");
			builder.put(grammarAccess.getDSLReferenceInputAccess().getGroup(), "rule__DSLReferenceInput__Group__0");
			builder.put(grammarAccess.getDSLMeasuredOutputAccess().getGroup(), "rule__DSLMeasuredOutput__Group__0");
			builder.put(grammarAccess.getDSLAlternativeAccess().getGroup(), "rule__DSLAlternative__Group__0");
			builder.put(grammarAccess.getArchitectureDefinitionAccess().getNameAssignment_1(), "rule__ArchitectureDefinition__NameAssignment_1");
			builder.put(grammarAccess.getArchitectureDefinitionAccess().getManagingAssignment_3(), "rule__ArchitectureDefinition__ManagingAssignment_3");
			builder.put(grammarAccess.getArchitectureDefinitionAccess().getManagedAssignment_4(), "rule__ArchitectureDefinition__ManagedAssignment_4");
			builder.put(grammarAccess.getArchitectureDefinitionAccess().getRulesAssignment_8(), "rule__ArchitectureDefinition__RulesAssignment_8");
			builder.put(grammarAccess.getDSLRuleMControllerAccess().getMcontroller1Assignment_1(), "rule__DSLRuleMController__Mcontroller1Assignment_1");
			builder.put(grammarAccess.getDSLRuleMControllerAccess().getAccessAssignment_2(), "rule__DSLRuleMController__AccessAssignment_2");
			builder.put(grammarAccess.getDSLRuleMControllerAccess().getMcontroller2Assignment_4(), "rule__DSLRuleMController__Mcontroller2Assignment_4");
			builder.put(grammarAccess.getDSLRuleControllerAccess().getController1Assignment_1(), "rule__DSLRuleController__Controller1Assignment_1");
			builder.put(grammarAccess.getDSLRuleControllerAccess().getAccessAssignment_2(), "rule__DSLRuleController__AccessAssignment_2");
			builder.put(grammarAccess.getDSLRuleControllerAccess().getController2Assignment_4(), "rule__DSLRuleController__Controller2Assignment_4");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getMonitorAssignment_0_1(), "rule__DSLRuleMonitor__MonitorAssignment_0_1");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAccessAssignment_0_2(), "rule__DSLRuleMonitor__AccessAssignment_0_2");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getSensorAssignment_0_4(), "rule__DSLRuleMonitor__SensorAssignment_0_4");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getMonitorAssignment_1_1(), "rule__DSLRuleMonitor__MonitorAssignment_1_1");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAccessAssignment_1_2(), "rule__DSLRuleMonitor__AccessAssignment_1_2");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getKnowledgeAssignment_1_4(), "rule__DSLRuleMonitor__KnowledgeAssignment_1_4");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getMonitorAssignment_2_1(), "rule__DSLRuleMonitor__MonitorAssignment_2_1");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAccessAssignment_2_2(), "rule__DSLRuleMonitor__AccessAssignment_2_2");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAnalyzerAssignment_2_4(), "rule__DSLRuleMonitor__AnalyzerAssignment_2_4");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getMonitorAssignment_3_1(), "rule__DSLRuleMonitor__MonitorAssignment_3_1");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getAccessAssignment_3_2(), "rule__DSLRuleMonitor__AccessAssignment_3_2");
			builder.put(grammarAccess.getDSLRuleMonitorAccess().getMonitor2Assignment_3_4(), "rule__DSLRuleMonitor__Monitor2Assignment_3_4");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_0_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_0_1");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_0_2(), "rule__DSLRuleAnalyzer__AccessAssignment_0_2");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getKnowledgeAssignment_0_4(), "rule__DSLRuleAnalyzer__KnowledgeAssignment_0_4");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_1_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_1_1");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_1_2(), "rule__DSLRuleAnalyzer__AccessAssignment_1_2");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getMonitorAssignment_1_4(), "rule__DSLRuleAnalyzer__MonitorAssignment_1_4");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_2_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_2_1");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_2_2(), "rule__DSLRuleAnalyzer__AccessAssignment_2_2");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getPlannerAssignment_2_4(), "rule__DSLRuleAnalyzer__PlannerAssignment_2_4");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_3_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_3_1");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_3_2(), "rule__DSLRuleAnalyzer__AccessAssignment_3_2");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getRreferenceAssignment_3_4(), "rule__DSLRuleAnalyzer__RreferenceAssignment_3_4");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_4_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_4_1");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_4_2(), "rule__DSLRuleAnalyzer__AccessAssignment_4_2");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzer2Assignment_4_4(), "rule__DSLRuleAnalyzer__Analyzer2Assignment_4_4");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_5_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_5_1");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_5_2(), "rule__DSLRuleAnalyzer__AccessAssignment_5_2");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getShaltAssignment_5_4(), "rule__DSLRuleAnalyzer__ShaltAssignment_5_4");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_6_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_6_1");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_6_2(), "rule__DSLRuleAnalyzer__AccessAssignment_6_2");
			builder.put(grammarAccess.getDSLRuleAnalyzerAccess().getExecutorAssignment_6_4(), "rule__DSLRuleAnalyzer__ExecutorAssignment_6_4");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getPlannerAssignment_0_1(), "rule__DSLRulePlanner__PlannerAssignment_0_1");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAssignment_0_2(), "rule__DSLRulePlanner__AccessAssignment_0_2");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getKnowledgeAssignment_0_4(), "rule__DSLRulePlanner__KnowledgeAssignment_0_4");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getPlannerAssignment_1_1(), "rule__DSLRulePlanner__PlannerAssignment_1_1");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAssignment_1_2(), "rule__DSLRulePlanner__AccessAssignment_1_2");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAnalyzerAssignment_1_4(), "rule__DSLRulePlanner__AnalyzerAssignment_1_4");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getPlannerAssignment_2_1(), "rule__DSLRulePlanner__PlannerAssignment_2_1");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAssignment_2_2(), "rule__DSLRulePlanner__AccessAssignment_2_2");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getExecutorAssignment_2_4(), "rule__DSLRulePlanner__ExecutorAssignment_2_4");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getPlannerAssignment_3_1(), "rule__DSLRulePlanner__PlannerAssignment_3_1");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAssignment_3_2(), "rule__DSLRulePlanner__AccessAssignment_3_2");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getPlanner2Assignment_3_4(), "rule__DSLRulePlanner__Planner2Assignment_3_4");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getPlannerAssignment_4_1(), "rule__DSLRulePlanner__PlannerAssignment_4_1");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getAccessAssignment_4_2(), "rule__DSLRulePlanner__AccessAssignment_4_2");
			builder.put(grammarAccess.getDSLRulePlannerAccess().getShaltAssignment_4_4(), "rule__DSLRulePlanner__ShaltAssignment_4_4");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getExecutorAssignment_0_1(), "rule__DSLRuleExecutor__ExecutorAssignment_0_1");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAccessAssignment_0_2(), "rule__DSLRuleExecutor__AccessAssignment_0_2");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getEffectorAssignment_0_4(), "rule__DSLRuleExecutor__EffectorAssignment_0_4");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getExecutorAssignment_1_1(), "rule__DSLRuleExecutor__ExecutorAssignment_1_1");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAccessAssignment_1_2(), "rule__DSLRuleExecutor__AccessAssignment_1_2");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getPlannerAssignment_1_4(), "rule__DSLRuleExecutor__PlannerAssignment_1_4");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getExecutorAssignment_2_1(), "rule__DSLRuleExecutor__ExecutorAssignment_2_1");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAccessAssignment_2_2(), "rule__DSLRuleExecutor__AccessAssignment_2_2");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getKnowledgeAssignment_2_4(), "rule__DSLRuleExecutor__KnowledgeAssignment_2_4");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getExecutorAssignment_3_1(), "rule__DSLRuleExecutor__ExecutorAssignment_3_1");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getAccessAssignment_3_2(), "rule__DSLRuleExecutor__AccessAssignment_3_2");
			builder.put(grammarAccess.getDSLRuleExecutorAccess().getExecutor2Assignment_3_4(), "rule__DSLRuleExecutor__Executor2Assignment_3_4");
			builder.put(grammarAccess.getDSLRuleMOAccess().getSensorAssignment_1(), "rule__DSLRuleMO__SensorAssignment_1");
			builder.put(grammarAccess.getDSLRuleMOAccess().getAccessAssignment_2(), "rule__DSLRuleMO__AccessAssignment_2");
			builder.put(grammarAccess.getDSLRuleMOAccess().getMeasuredAssignment_4(), "rule__DSLRuleMO__MeasuredAssignment_4");
			builder.put(grammarAccess.getDSLManagingAccess().getNameAssignment_1(), "rule__DSLManaging__NameAssignment_1");
			builder.put(grammarAccess.getDSLManagingAccess().getManagerControllerAssignment_3(), "rule__DSLManaging__ManagerControllerAssignment_3");
			builder.put(grammarAccess.getDSLManagingAccess().getControllerAssignment_4(), "rule__DSLManaging__ControllerAssignment_4");
			builder.put(grammarAccess.getDSLManagedAccess().getNameAssignment_1(), "rule__DSLManaged__NameAssignment_1");
			builder.put(grammarAccess.getDSLManagedAccess().getSensorAssignment_3(), "rule__DSLManaged__SensorAssignment_3");
			builder.put(grammarAccess.getDSLManagedAccess().getEffectorAssignment_4(), "rule__DSLManaged__EffectorAssignment_4");
			builder.put(grammarAccess.getDSLManagedAccess().getMeasuredOutputAssignment_5(), "rule__DSLManaged__MeasuredOutputAssignment_5");
			builder.put(grammarAccess.getDSLManagerControllerAccess().getNameAssignment_1(), "rule__DSLManagerController__NameAssignment_1");
			builder.put(grammarAccess.getDSLManagerControllerAccess().getDslTypeMCAssignment_3(), "rule__DSLManagerController__DslTypeMCAssignment_3");
			builder.put(grammarAccess.getDSLManagerControllerAccess().getControllerAssignment_5(), "rule__DSLManagerController__ControllerAssignment_5");
			builder.put(grammarAccess.getDSLControllerAccess().getNameAssignment_1(), "rule__DSLController__NameAssignment_1");
			builder.put(grammarAccess.getDSLControllerAccess().getMonitorAssignment_3(), "rule__DSLController__MonitorAssignment_3");
			builder.put(grammarAccess.getDSLControllerAccess().getAnalyzerAssignment_4(), "rule__DSLController__AnalyzerAssignment_4");
			builder.put(grammarAccess.getDSLControllerAccess().getPlannerAssignment_5(), "rule__DSLController__PlannerAssignment_5");
			builder.put(grammarAccess.getDSLControllerAccess().getExecutorAssignment_6(), "rule__DSLController__ExecutorAssignment_6");
			builder.put(grammarAccess.getDSLControllerAccess().getKnowledgeAssignment_7(), "rule__DSLController__KnowledgeAssignment_7");
			builder.put(grammarAccess.getDSLMonitorAccess().getNameAssignment_1(), "rule__DSLMonitor__NameAssignment_1");
			builder.put(grammarAccess.getDSLAnalyzerAccess().getNameAssignment_1(), "rule__DSLAnalyzer__NameAssignment_1");
			builder.put(grammarAccess.getDSLPlannerAccess().getNameAssignment_1(), "rule__DSLPlanner__NameAssignment_1");
			builder.put(grammarAccess.getDSLExecutorAccess().getNameAssignment_1(), "rule__DSLExecutor__NameAssignment_1");
			builder.put(grammarAccess.getDSLKnowledgeAccess().getNameAssignment_1(), "rule__DSLKnowledge__NameAssignment_1");
			builder.put(grammarAccess.getDSLKnowledgeAccess().getReferenceInputAssignment_3(), "rule__DSLKnowledge__ReferenceInputAssignment_3");
			builder.put(grammarAccess.getDSLKnowledgeAccess().getShaltAssignment_4(), "rule__DSLKnowledge__ShaltAssignment_4");
			builder.put(grammarAccess.getDSLSensorAccess().getNameAssignment_1(), "rule__DSLSensor__NameAssignment_1");
			builder.put(grammarAccess.getDSLEffectorAccess().getNameAssignment_1(), "rule__DSLEffector__NameAssignment_1");
			builder.put(grammarAccess.getDSLReferenceInputAccess().getNameAssignment_1(), "rule__DSLReferenceInput__NameAssignment_1");
			builder.put(grammarAccess.getDSLMeasuredOutputAccess().getNameAssignment_1(), "rule__DSLMeasuredOutput__NameAssignment_1");
			builder.put(grammarAccess.getDSLAlternativeAccess().getNameAssignment_1(), "rule__DSLAlternative__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SasDslGrammarAccess grammarAccess;

	@Override
	protected InternalSasDslParser createParser() {
		InternalSasDslParser result = new InternalSasDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SasDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SasDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
