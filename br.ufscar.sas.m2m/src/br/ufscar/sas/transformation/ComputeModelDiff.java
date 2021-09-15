package br.ufscar.sas.transformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IEqualityHelperFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.EqualityHelper;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Package;

import com.google.common.cache.LoadingCache;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class ComputeModelDiff {

	List<String> lstPackageMove = new ArrayList<String>();
	List<String> lstPackageDelete = new ArrayList<String>();
	List<String> lstPackageAdd = new ArrayList<String>();

	Multimap<String, Dependency> multimapDependencyMove = ArrayListMultimap.create();
	Multimap<String, Dependency> multimapDependencyDelete = ArrayListMultimap.create();
	Multimap<String, Dependency> multimapDependencyAdd= ArrayListMultimap.create();
	List<String> result = null;

	public void checkDifferences(IFile current, IFile planned) {

		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();

		resourceSet1.getResource(URI.createURI(current.getFullPath().toString()), true);
		resourceSet2.getResource(URI.createURI(planned.getFullPath().toString()), true);

		IEqualityHelperFactory helperFactory = new DefaultEqualityHelperFactory() {
			@Override
			public org.eclipse.emf.compare.utils.IEqualityHelper createEqualityHelper() {

				final LoadingCache<EObject, URI> cache = EqualityHelper.createDefaultCache(getCacheBuilder());
				return new EqualityHelper(cache) {
					@Override
					public boolean matchingValues(Object object1, Object object2) {

						if (object1 instanceof Package && object2 instanceof Package) {
							Package package1 = (Package) object1;
							Package package2 = (Package) object2;
							if (package1.getName().equals(package2.getName()))
								return true;
							else 
								return false;
						}
						return super.matchingValues(object1, object2);
					}
				};
			}
		};

		// Configure EMF Compare
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(helperFactory);
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);

		// Compare the two models
		IComparisonScope scope = new DefaultComparisonScope(resourceSet1, resourceSet2, null);
		Comparison comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build().compare(scope);

		EList<Diff> differences = comparison.getDifferences();

		for (Diff difference : differences)
		{
			if (difference instanceof ReferenceChange)
			{
				ReferenceChange referenceChange = (ReferenceChange) difference;

				if (referenceChange.getReference() instanceof EReference) 
				{
					EReference reference = referenceChange.getReference();
					if (!reference.getName().equals("client") && !reference.getName().equals("supplier")) {

						if (referenceChange.getValue() instanceof Package)
						{	
							Package package1 = (Package) referenceChange.getValue() ;
							if (referenceChange.getKind().toString().equals("DELETE")) {

								if (referenceChange.getMatch().getLeft() instanceof Package && referenceChange.getMatch().getRight() instanceof Package )
								{
									Package package2 = (Package) referenceChange.getMatch().getLeft();
									if (!lstPackageMove.contains(package2.getName()))
										lstPackageMove.add(package2.getName());
								}

								System.out.println("[DELETE] - The package: "+package1.getName() + " does not exist!.");
								lstPackageDelete.add(package1.getName());

							}
							else {

								if (referenceChange.getKind().toString().equals("ADD")) {

									System.out.println("[ADD] - The package: "+package1.getName() + " does not exist!.");
									lstPackageAdd.add(package1.getName());

								}
								else {

									if (referenceChange.getKind().toString().equals("MOVE")) {

										if (referenceChange.getMatch().getLeft() instanceof Package && referenceChange.getMatch().getRight() instanceof Package )
										{
											Package package2 = (Package) referenceChange.getMatch().getLeft();
											if (!lstPackageMove.contains(package2.getName()))
												lstPackageMove.add(package2.getName());
										}
										System.out.println("[MOVE] - The package: "+package1.getName() + " exist!.");
										lstPackageMove.add(package1.getName());
									}
								}
							}
						}

						if (referenceChange.getValue() instanceof Dependency)
						{
							Dependency dependency = (Dependency) referenceChange.getValue() ;
							if (referenceChange.getKind().toString().equals("DELETE")) {
								multimapDependencyDelete.put(dependency.getClients().get(0).getName(), dependency);
								System.out.println("[DELETE] - The relation: "+dependency.getClients().get(0).getName()  + " -> "+dependency.getSuppliers().get(0).getName() + " does not exist!.");
							}
							else {

								if (referenceChange.getKind().toString().equals("ADD")) 
								{
									System.out.println("[ADD] - The relation: "+dependency.getClients().get(0).getName()  + " -> "+dependency.getSuppliers().get(0).getName() + " does not exist!.");

									multimapDependencyAdd.put(dependency.getClients().get(0).getName(), dependency);
								}
								else {

									if (referenceChange.getKind().toString().equals("MOVE")) 
									{
										System.out.println("[MOVE] - The relation: "+dependency.getClients().get(0).getName()  + " -> "+dependency.getSuppliers().get(0).getName() + " does not exist!.");
										multimapDependencyMove.put(dependency.getClients().get(0).getName(), dependency);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void compute(IFile current, IFile planned, String plannedArchitecture, String pathDifference)  {

		this.checkDifferences(current, planned);
		Path path = Paths.get(plannedArchitecture);
		if(Files.exists(path,new LinkOption[]{ LinkOption.NOFOLLOW_LINKS}))
		{
			try (Stream<String> lines = Files.lines(Paths.get(path.toUri()))) {
				result = lines.collect(Collectors.toList());
			}
			catch (Exception e) {
				e.printStackTrace();
			}

			this.changedAbstractions(result);
			this.changedDependencies(result);
				
			String newString = "";
			for (String line: result)
				newString = newString + line +"\n";

			try {
				Files.write(Paths.get(pathDifference + "differences.txt"), newString.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING );
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	private void changedAbstractions(List<String> architecture) {

		for (int i=0; i < architecture.size();i++) 
		{
			for (int j=0; j < lstPackageDelete.size(); j++) {

				if (architecture.get(i).contains(lstPackageDelete.get(j))) 
					architecture.set(i,architecture.get(i).substring(0,architecture.get(i).length()-1) + " #silver {" );
			}
		}
	}

	private void changedDependencies(List<String> architecture) {
		
		for (String key: multimapDependencyAdd.keys())
			multimapDependencyDelete.removeAll(key);
		
		for (String key: multimapDependencyDelete.keySet()) {
			
			String from = "";
			String to = "";

			for (Dependency dependency : multimapDependencyDelete.get(key)) {
				for (String line : architecture) {
					if (line.contains(key)) {
						Matcher matcher = Pattern.compile(" \\d+ ").matcher(line); 
						while (matcher.find()) 
							from = matcher.group();
						break;
					}
				}
				
				for (String line : architecture) {
					if (line.contains(dependency.getSuppliers().get(0).getName())) {
						Matcher matcher = Pattern.compile(" \\d+ ").matcher(line); 
						while (matcher.find()) 
							to = matcher.group();
						break;
					}
				}
				
				for (int i=0; i<architecture.size(); i++) {
					
					String find = "";
					String pattern = from + "\\..{11}" + to;
					pattern = pattern.trim();
					Matcher matcher =Pattern.compile(pattern).matcher(architecture.get(i)); 
					while (matcher.find()) 
					{
						find = matcher.group();
						find = find.replaceAll("707070", "FF0000");
						find = find + " " + architecture.get(i).substring(architecture.get(i).indexOf(":"), architecture.get(i).length());
						find = find.replaceAll("must-use", "<color:#FF0000>must-use");
						find = find.replaceAll("must-not-use", "<color:#FF0000>must-use");
						architecture.set(i,find);
					}
				}
			}
		}
	}
	
	public void checkDependencies() {

		//Remove from move all component names that must be preserved
		List<Dependency> lstDependencies = new ArrayList<Dependency>(multimapDependencyDelete.values());
		for (Dependency dependency : lstDependencies)
		{
			lstPackageMove.remove(dependency.getClients().get(0).getName());
			lstPackageMove.remove(dependency.getSuppliers().get(0).getName());
		}
	}
	
}

