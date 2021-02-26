package br.ufscar.sas.transformation;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.modisco.omg.kdm.structure.Component;
import org.eclipse.modisco.omg.kdm.structure.Subsystem;

import br.ufscar.sas.utils.Activator;

public class AddAggregated {

	KDMEntity abstractionFrom;
	String abstractionTo; 
	Set<KDMRelationship> relationship;
	
	public AddAggregated(KDMEntity abstractionFrom, String abstractionTo, Set<KDMRelationship> relationship) {
		
		this.abstractionFrom = abstractionFrom;
		this.abstractionTo = abstractionTo;
		this.relationship = relationship;
	}
	
	
	public Resource aggregated(IFile kdm) throws ExecutionException
	{
		// Refer to an existing transformation via URI
		URI transformationURI = URI.createURI("platform:/plugin/br.ufscar.sas.utils/transforms/addAggregated.qvto");

		// create executor for the given transformation
		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		// define the transformation input
		// Remark: we take the objects from a resource, however
		// a list of arbitrary in-memory EObjects may be passed
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource kdmInResource = resourceSet.getResource(URI.createURI(kdm.getFullPath().toString()), true);	
		EList<EObject> inObjects = kdmInResource.getContents();
		// create the input extent with its initial contents
		ModelExtent input = new BasicModelExtent(inObjects);		
		// create an empty extent to catch the output
		ModelExtent output = new BasicModelExtent();

		Log log =  new WriterLog(new OutputStreamWriter(System.out)); 
		// setup the execution environment details -> 
		// configuration properties, logger, monitor object etc.
		ExecutionContextImpl context = new ExecutionContextImpl();
		
		context.setConfigProperty("abstractionFrom", this.abstractionFrom.getName());
		
		if (abstractionFrom instanceof Component)
			context.setConfigProperty("abstractionType", "component");
		else
			if (abstractionFrom instanceof Subsystem)
				context.setConfigProperty("abstractionType", "subsystem");
	
		context.setConfigProperty("abstractionTo", this.abstractionTo);
		context.setConfigProperty("relationship", this.relationship);
		
		//StringBufferLog log = new StringBufferLog();
		context.setLog(log);
		
		// run the transformation assigned to the executor with the given 
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		ExecutionDiagnostic result = executor.execute(context, input, output);
		
		// check the result for success
	
		if(result.getSeverity() == Diagnostic.OK) 
		{
			// the output objects got captured in the output extent
			List<EObject> outObjects = output.getContents();
			// let's persist them using a resource 
			kdmInResource.getContents().addAll(outObjects);
			try 
			{
				kdmInResource.save(Collections.emptyMap());

			} catch (IOException e) { e.printStackTrace();}
		} 
		else 
		{
			// turn the result diagnostic into status and send it to error log			
			IStatus status = BasicDiagnostic.toIStatus(result);
			Activator.getDefault().getLog().log(status);
		}
		return kdmInResource;
	}
}
