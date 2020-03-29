/*
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.validation

import br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleAnalyzer
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleController
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMController
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMO
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRules
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage
import com.google.common.collect.HashMultimap
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SasDslValidator extends AbstractSasDslValidator {
	
	protected static val ISSUE_CODE_PREFIX = "br.ufscar.abstractions.rules.";
	public static val DUCPLICATE_MCONTROLLER_ACCESS = ISSUE_CODE_PREFIX + "AccessSameMController"
	public static val DUCPLICATE_CONTROLLER_ACCESS = ISSUE_CODE_PREFIX + "AccessSameController"
	public static val DUCPLICATE_MONITOR_ACCESS = ISSUE_CODE_PREFIX + "AccessSameMonitor"
	public static val DUCPLICATE_ANALYZER_ACCESS = ISSUE_CODE_PREFIX + "AccessSameAnalyzer"
	public static val DUCPLICATE_PLANNER_ACCESS = ISSUE_CODE_PREFIX + "AccessSamePlanner"
	public static val DUCPLICATE_EXECUTOR_ACCESS = ISSUE_CODE_PREFIX + "AccessSameExecutor"
	public static val DUCPLICATE_RULES = ISSUE_CODE_PREFIX + "DuplicateRules"


	@Check
	def checkInMControllerRuleNotAccessTheSame(DSLRuleMController dslRuleMController)
	{
		if (dslRuleMController.mcontroller2 !== null)
			if (dslRuleMController.mcontroller1 == dslRuleMController.mcontroller2)
				error("Manager controllers cannot access themselves", SasDslPackage.eINSTANCE.DSLRuleMController_Mcontroller2, DUCPLICATE_CONTROLLER_ACCESS)
	}

	@Check
	def checkInControllerRuleNotAccessTheSame(DSLRuleController dslRuleController)
	{
		if (dslRuleController.controller2 !== null)
			if (dslRuleController.controller1 == dslRuleController.controller2)
				error("Controllers cannot access themselves", SasDslPackage.eINSTANCE.DSLRuleController_Controller2, DUCPLICATE_CONTROLLER_ACCESS)
	}
	
	@Check
	def checkInMonitorRuleNotAccessTheSame(DSLRuleMonitor dslRuleMonitor)
	{
		if (dslRuleMonitor.monitor2 !== null)
			if (dslRuleMonitor.monitor == dslRuleMonitor.monitor2)
				error("Monitors cannot access themselves", SasDslPackage.eINSTANCE.DSLRuleMonitor_Monitor2, DUCPLICATE_MONITOR_ACCESS)
	}
	
	@Check
	def checkInAnalyzerRuleNotAccessTheSame(DSLRuleAnalyzer dslRuleAnalyzer)
	{
		if (dslRuleAnalyzer.analyzer2 !== null)
			if (dslRuleAnalyzer.analyzer == dslRuleAnalyzer.analyzer2)
				error("Analyzers cannot access themselves", SasDslPackage.eINSTANCE.DSLRuleAnalyzer_Analyzer2, DUCPLICATE_ANALYZER_ACCESS)
	}
	
	@Check
	def checkInPlannerRuleNotAccessTheSame(DSLRulePlanner dslRulePlanner)
	{
		if (dslRulePlanner.planner2 !== null)
			if (dslRulePlanner.planner == dslRulePlanner.planner2)
				error("Planners cannot access themselves", SasDslPackage.eINSTANCE.DSLRulePlanner_Planner2, DUCPLICATE_PLANNER_ACCESS)
	}
	
	@Check
	def checkInExecutorRuleNotAccessTheSame(DSLRuleExecutor dslRuleExecutor)
	{
		if (dslRuleExecutor.executor2 !== null)
			if (dslRuleExecutor.executor == dslRuleExecutor.executor2)
				error("Executors cannot access themselves", SasDslPackage.eINSTANCE.DSLRuleExecutor_Executor2, DUCPLICATE_EXECUTOR_ACCESS)
	}
	
	@Check def void checkNoDuplicateControllers(ArchitectureDefinition r){
		
		checkNoDuplicateRules(r.rules)
	}
	
	def private void checkNoDuplicateRules(EList<DSLRules> rules){
		
		val multiMapRuleMController = HashMultimap.create()
		val multiMapRuleController = HashMultimap.create()
		
		val multiMapRuleMonitor2Monitor = HashMultimap.create()
		val multiMapRuleMonitor2Analyzer = HashMultimap.create()
		val multiMapRuleMonitor2Sensor = HashMultimap.create()
		val multiMapRuleMonitor2Knowledge = HashMultimap.create() 
		 
		val multiMapRuleAnalyzer2Analyzer = HashMultimap.create()
		val multiMapRuleAnalyzer2Monitor = HashMultimap.create()
		val multiMapRuleAnalyzer2Rreference = HashMultimap.create()
		val multiMapRuleAnalyzer2Planner = HashMultimap.create()
		val multiMapRuleAnalyzer2Knowledge= HashMultimap.create()
		val multiMapRuleAnalyzer2Executor= HashMultimap.create()
		val multiMapRuleAnalyzer2Alternative = HashMultimap.create()
		
		val multiMapRulePlanner2Planner = HashMultimap.create()
		val multiMapRulePlanner2Analyzer = HashMultimap.create()
		val multiMapRulePlanner2Executor= HashMultimap.create()
		val multiMapRulePlanner2Knowledge= HashMultimap.create()
		
		val multiMapRuleExecutor2Executor = HashMultimap.create()
		val multiMapRuleExecutor2Planner = HashMultimap.create()
		val multiMapRuleExecutor2Effector = HashMultimap.create()
		val multiMapRuleExecutor2Knowledge = HashMultimap.create()
		
		val multiMapRuleSensor = HashMultimap.create()
		
		
		for(r:rules)
		{
			if (r instanceof DSLRuleController)
				multiMapRuleController.put(r.controller1.name+r.controller2.name,r)
				
			if (r instanceof DSLRuleMController)
				multiMapRuleMController.put(r.mcontroller1.name+r.mcontroller2.name,r)
				
			if (r instanceof DSLRuleMonitor)
			{
				if (r.monitor2 !== null)
					multiMapRuleMonitor2Monitor.put(r.monitor.name+r.monitor2.name,r)	
				if (r.analyzer !== null)
					multiMapRuleMonitor2Analyzer.put(r.monitor.name+r.analyzer.name,r)	
				if (r.sensor !== null)
					multiMapRuleMonitor2Sensor.put(r.monitor.name+r.sensor.name,r)
				if (r.knowledge !== null)	
					multiMapRuleMonitor2Knowledge.put(r.monitor.name+r.knowledge.name,r)	
			}
			if (r instanceof DSLRuleAnalyzer)
			{
				if (r.analyzer2 !== null)
					multiMapRuleAnalyzer2Analyzer.put(r.analyzer.name+r.analyzer2.name,r)	
				if (r.monitor !== null)
					multiMapRuleAnalyzer2Monitor.put(r.analyzer.name+r.monitor.name,r)	
				if (r.rreference !== null)
					multiMapRuleAnalyzer2Rreference.put(r.analyzer.name+r.rreference.name,r)	
				if (r.planner !== null)
					multiMapRuleAnalyzer2Planner.put(r.analyzer.name+r.planner.name,r)	
				if (r.knowledge !== null)
					multiMapRuleAnalyzer2Knowledge.put(r.analyzer.name+r.knowledge.name,r)	
				if (r.executor !== null)
					multiMapRuleAnalyzer2Executor.put(r.analyzer.name+r.executor.name,r)	
				if (r.shalt !== null)
					multiMapRuleAnalyzer2Executor.put(r.analyzer.name+r.shalt.name,r)	
			}
			
			if (r instanceof DSLRulePlanner)
			{
				if (r.planner2 !== null)
					multiMapRulePlanner2Planner.put(r.planner.name+r.planner2.name,r)	
				if (r.analyzer !== null)
					multiMapRulePlanner2Analyzer.put(r.planner.name+r.analyzer.name,r)	
				if (r.executor !== null)
					multiMapRulePlanner2Executor.put(r.planner.name+r.executor.name,r)	
				if (r.knowledge !== null)
					multiMapRulePlanner2Knowledge.put(r.planner.name+r.knowledge.name,r)	
			}
			if (r instanceof DSLRuleExecutor)
			{
				if (r.executor2 !== null)
					multiMapRuleExecutor2Executor.put(r.executor.name+r.executor2.name,r)	
				if (r.effector !== null)
					multiMapRuleExecutor2Effector.put(r.executor.name+r.effector.name,r)	
				if (r.knowledge !== null)
					multiMapRuleExecutor2Knowledge.put(r.executor.name+r.knowledge.name,r)	
				if (r.executor2 !== null)
					multiMapRuleExecutor2Planner.put(r.executor.name+r.executor2.name,r)	
			}
			if (r instanceof DSLRuleMO)
				multiMapRuleSensor.put(r.sensor.name+r.measured.name,r)
		}
		
		for (entry:multiMapRuleController.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleController_Controller2, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleMController.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleMController_Mcontroller2, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleMonitor2Monitor.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleMonitor_Monitor2, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleMonitor2Analyzer.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleMonitor_Analyzer, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleMonitor2Knowledge.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleMonitor_Knowledge, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleMonitor2Sensor.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleMonitor_Sensor, DUCPLICATE_RULES)
			}
		}
		
		
		for (entry:multiMapRuleAnalyzer2Analyzer.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleAnalyzer_Analyzer2, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleAnalyzer2Knowledge.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleAnalyzer_Knowledge, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleAnalyzer2Monitor.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleAnalyzer_Monitor, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleAnalyzer2Planner.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleAnalyzer_Planner, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleAnalyzer2Rreference.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleAnalyzer_Rreference, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleAnalyzer2Executor.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleAnalyzer_Rreference, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleAnalyzer2Alternative.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleAnalyzer_Rreference, DUCPLICATE_RULES)
			}
		}
		
		
		for (entry:multiMapRulePlanner2Planner.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRulePlanner_Planner2, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRulePlanner2Analyzer.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRulePlanner_Analyzer, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRulePlanner2Knowledge.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRulePlanner_Knowledge, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRulePlanner2Executor.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRulePlanner_Executor, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleExecutor2Executor.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleExecutor_Executor2, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleExecutor2Effector.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleExecutor_Effector, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleExecutor2Knowledge.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleExecutor_Knowledge, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleExecutor2Planner.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleExecutor_Planner, DUCPLICATE_RULES)
			}
		}
		
		for (entry:multiMapRuleSensor.asMap.entrySet)
		{
			val duplicates = entry.value
			if (duplicates.size > 1){
				for (d:duplicates)
					error("Duplicated rule",d, SasDslPackage.eINSTANCE.DSLRuleMO_Measured, DUCPLICATE_RULES)
			}
		}
	}
}
