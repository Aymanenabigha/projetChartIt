/**
 */
package graphe1.impl;

import graphe1.Colonne;
import graphe1.Couleurs;
import graphe1.Donner;
import graphe1.Graphe;
import graphe1.Graphe1Factory;
import graphe1.Graphe1Package;
import graphe1.Name;
import graphe1.Programme;
import graphe1.TypeGraphe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Graphe1PackageImpl extends EPackageImpl implements Graphe1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grapheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum couleursEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeGrapheEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see graphe1.Graphe1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Graphe1PackageImpl() {
		super(eNS_URI, Graphe1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Graphe1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Graphe1Package init() {
		if (isInited)
			return (Graphe1Package) EPackage.Registry.INSTANCE.getEPackage(Graphe1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredGraphe1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Graphe1PackageImpl theGraphe1Package = registeredGraphe1Package instanceof Graphe1PackageImpl
				? (Graphe1PackageImpl) registeredGraphe1Package
				: new Graphe1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGraphe1Package.createPackageContents();

		// Initialize created meta-data
		theGraphe1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphe1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Graphe1Package.eNS_URI, theGraphe1Package);
		return theGraphe1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Name() {
		return (EAttribute) nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColonne() {
		return colonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColonne_Label() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColonne_Color() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonner() {
		return donnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonner_Link() {
		return (EAttribute) donnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramme() {
		return programmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramme_Graphe() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramme_Colonne() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramme_Donner() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphe() {
		return grapheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphe_Type() {
		return (EAttribute) grapheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphe_BagColor() {
		return (EAttribute) grapheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphe_Colonne() {
		return (EReference) grapheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphe_Data() {
		return (EReference) grapheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCouleurs() {
		return couleursEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeGraphe() {
		return typeGrapheEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphe1Factory getGraphe1Factory() {
		return (Graphe1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__NAME);

		colonneEClass = createEClass(COLONNE);
		createEAttribute(colonneEClass, COLONNE__LABEL);
		createEAttribute(colonneEClass, COLONNE__COLOR);

		donnerEClass = createEClass(DONNER);
		createEAttribute(donnerEClass, DONNER__LINK);

		programmeEClass = createEClass(PROGRAMME);
		createEReference(programmeEClass, PROGRAMME__GRAPHE);
		createEReference(programmeEClass, PROGRAMME__COLONNE);
		createEReference(programmeEClass, PROGRAMME__DONNER);

		grapheEClass = createEClass(GRAPHE);
		createEAttribute(grapheEClass, GRAPHE__TYPE);
		createEAttribute(grapheEClass, GRAPHE__BAG_COLOR);
		createEReference(grapheEClass, GRAPHE__COLONNE);
		createEReference(grapheEClass, GRAPHE__DATA);

		// Create enums
		couleursEEnum = createEEnum(COULEURS);
		typeGrapheEEnum = createEEnum(TYPE_GRAPHE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		colonneEClass.getESuperTypes().add(this.getName_());
		donnerEClass.getESuperTypes().add(this.getName_());
		programmeEClass.getESuperTypes().add(this.getName_());
		grapheEClass.getESuperTypes().add(this.getName_());

		// Initialize classes, features, and operations; add parameters
		initEClass(nameEClass, Name.class, "Name", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getName_Name(), ecorePackage.getEString(), "name", null, 0, 1, Name.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEClass, Colonne.class, "Colonne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonne_Label(), ecorePackage.getEString(), "label", null, 0, 1, Colonne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_Color(), this.getCouleurs(), "color", "red", 0, 1, Colonne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donnerEClass, Donner.class, "Donner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonner_Link(), ecorePackage.getEString(), "link", null, 0, 1, Donner.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeEClass, Programme.class, "Programme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramme_Graphe(), this.getGraphe(), null, "graphe", null, 0, -1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Colonne(), this.getColonne(), null, "colonne", null, 0, -1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Donner(), this.getDonner(), null, "donner", null, 0, -1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grapheEClass, Graphe.class, "Graphe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphe_Type(), this.getTypeGraphe(), "type", "line", 0, 1, Graphe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphe_BagColor(), this.getCouleurs(), "bagColor", null, 0, 1, Graphe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphe_Colonne(), this.getColonne(), null, "colonne", null, 1, -1, Graphe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphe_Data(), this.getDonner(), null, "data", null, 1, 1, Graphe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(couleursEEnum, Couleurs.class, "Couleurs");
		addEEnumLiteral(couleursEEnum, Couleurs.RED);
		addEEnumLiteral(couleursEEnum, Couleurs.BLUE);
		addEEnumLiteral(couleursEEnum, Couleurs.GREEN);
		addEEnumLiteral(couleursEEnum, Couleurs.PINK);

		initEEnum(typeGrapheEEnum, TypeGraphe.class, "TypeGraphe");
		addEEnumLiteral(typeGrapheEEnum, TypeGraphe.LINE);
		addEEnumLiteral(typeGrapheEEnum, TypeGraphe.BAR);
		addEEnumLiteral(typeGrapheEEnum, TypeGraphe.PIE);

		// Create resource
		createResource(eNS_URI);
	}

} //Graphe1PackageImpl
