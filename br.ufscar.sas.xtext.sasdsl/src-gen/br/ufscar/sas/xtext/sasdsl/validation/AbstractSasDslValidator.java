/*
 * generated by Xtext 2.21.0
 */
package br.ufscar.sas.xtext.sasdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSasDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage.eINSTANCE);
		return result;
	}
}
