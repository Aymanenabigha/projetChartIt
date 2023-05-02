/**
 */
package graphe1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see graphe1.Graphe1Factory
 * @model kind="package"
 * @generated
 */
public interface Graphe1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphe1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/graphe1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphe1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Graphe1Package eINSTANCE = graphe1.impl.Graphe1PackageImpl.init();

	/**
	 * The meta object id for the '{@link graphe1.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphe1.impl.NameImpl
	 * @see graphe1.impl.Graphe1PackageImpl#getName_()
	 * @generated
	 */
	int NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphe1.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphe1.impl.ColonneImpl
	 * @see graphe1.impl.Graphe1PackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NAME = NAME__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__LABEL = NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__COLOR = NAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = NAME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphe1.impl.DonnerImpl <em>Donner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphe1.impl.DonnerImpl
	 * @see graphe1.impl.Graphe1PackageImpl#getDonner()
	 * @generated
	 */
	int DONNER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNER__NAME = NAME__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNER__LINK = NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Donner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNER_FEATURE_COUNT = NAME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Donner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNER_OPERATION_COUNT = NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphe1.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphe1.impl.ProgrammeImpl
	 * @see graphe1.impl.Graphe1PackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = NAME__NAME;

	/**
	 * The feature id for the '<em><b>Graphe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__GRAPHE = NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__COLONNE = NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Donner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__DONNER = NAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = NAME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphe1.impl.GrapheImpl <em>Graphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphe1.impl.GrapheImpl
	 * @see graphe1.impl.Graphe1PackageImpl#getGraphe()
	 * @generated
	 */
	int GRAPHE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHE__NAME = NAME__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHE__TYPE = NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bag Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHE__BAG_COLOR = NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHE__COLONNE = NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHE__DATA = NAME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Graphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHE_FEATURE_COUNT = NAME_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Graphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHE_OPERATION_COUNT = NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphe1.Couleurs <em>Couleurs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphe1.Couleurs
	 * @see graphe1.impl.Graphe1PackageImpl#getCouleurs()
	 * @generated
	 */
	int COULEURS = 5;

	/**
	 * The meta object id for the '{@link graphe1.TypeGraphe <em>Type Graphe</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphe1.TypeGraphe
	 * @see graphe1.impl.Graphe1PackageImpl#getTypeGraphe()
	 * @generated
	 */
	int TYPE_GRAPHE = 6;

	/**
	 * Returns the meta object for class '{@link graphe1.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see graphe1.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link graphe1.Name#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphe1.Name#getName()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_Name();

	/**
	 * Returns the meta object for class '{@link graphe1.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see graphe1.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the attribute '{@link graphe1.Colonne#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see graphe1.Colonne#getLabel()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Label();

	/**
	 * Returns the meta object for the attribute '{@link graphe1.Colonne#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see graphe1.Colonne#getColor()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Color();

	/**
	 * Returns the meta object for class '{@link graphe1.Donner <em>Donner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donner</em>'.
	 * @see graphe1.Donner
	 * @generated
	 */
	EClass getDonner();

	/**
	 * Returns the meta object for the attribute '{@link graphe1.Donner#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see graphe1.Donner#getLink()
	 * @see #getDonner()
	 * @generated
	 */
	EAttribute getDonner_Link();

	/**
	 * Returns the meta object for class '{@link graphe1.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see graphe1.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the containment reference list '{@link graphe1.Programme#getGraphe <em>Graphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphe</em>'.
	 * @see graphe1.Programme#getGraphe()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Graphe();

	/**
	 * Returns the meta object for the containment reference list '{@link graphe1.Programme#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colonne</em>'.
	 * @see graphe1.Programme#getColonne()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Colonne();

	/**
	 * Returns the meta object for the containment reference list '{@link graphe1.Programme#getDonner <em>Donner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Donner</em>'.
	 * @see graphe1.Programme#getDonner()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Donner();

	/**
	 * Returns the meta object for class '{@link graphe1.Graphe <em>Graphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphe</em>'.
	 * @see graphe1.Graphe
	 * @generated
	 */
	EClass getGraphe();

	/**
	 * Returns the meta object for the attribute '{@link graphe1.Graphe#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see graphe1.Graphe#getType()
	 * @see #getGraphe()
	 * @generated
	 */
	EAttribute getGraphe_Type();

	/**
	 * Returns the meta object for the attribute '{@link graphe1.Graphe#getBagColor <em>Bag Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bag Color</em>'.
	 * @see graphe1.Graphe#getBagColor()
	 * @see #getGraphe()
	 * @generated
	 */
	EAttribute getGraphe_BagColor();

	/**
	 * Returns the meta object for the reference list '{@link graphe1.Graphe#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Colonne</em>'.
	 * @see graphe1.Graphe#getColonne()
	 * @see #getGraphe()
	 * @generated
	 */
	EReference getGraphe_Colonne();

	/**
	 * Returns the meta object for the reference '{@link graphe1.Graphe#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see graphe1.Graphe#getData()
	 * @see #getGraphe()
	 * @generated
	 */
	EReference getGraphe_Data();

	/**
	 * Returns the meta object for enum '{@link graphe1.Couleurs <em>Couleurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Couleurs</em>'.
	 * @see graphe1.Couleurs
	 * @generated
	 */
	EEnum getCouleurs();

	/**
	 * Returns the meta object for enum '{@link graphe1.TypeGraphe <em>Type Graphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Graphe</em>'.
	 * @see graphe1.TypeGraphe
	 * @generated
	 */
	EEnum getTypeGraphe();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Graphe1Factory getGraphe1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link graphe1.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphe1.impl.NameImpl
		 * @see graphe1.impl.Graphe1PackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME__NAME = eINSTANCE.getName_Name();

		/**
		 * The meta object literal for the '{@link graphe1.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphe1.impl.ColonneImpl
		 * @see graphe1.impl.Graphe1PackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__LABEL = eINSTANCE.getColonne_Label();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__COLOR = eINSTANCE.getColonne_Color();

		/**
		 * The meta object literal for the '{@link graphe1.impl.DonnerImpl <em>Donner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphe1.impl.DonnerImpl
		 * @see graphe1.impl.Graphe1PackageImpl#getDonner()
		 * @generated
		 */
		EClass DONNER = eINSTANCE.getDonner();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONNER__LINK = eINSTANCE.getDonner_Link();

		/**
		 * The meta object literal for the '{@link graphe1.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphe1.impl.ProgrammeImpl
		 * @see graphe1.impl.Graphe1PackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Graphe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__GRAPHE = eINSTANCE.getProgramme_Graphe();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__COLONNE = eINSTANCE.getProgramme_Colonne();

		/**
		 * The meta object literal for the '<em><b>Donner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__DONNER = eINSTANCE.getProgramme_Donner();

		/**
		 * The meta object literal for the '{@link graphe1.impl.GrapheImpl <em>Graphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphe1.impl.GrapheImpl
		 * @see graphe1.impl.Graphe1PackageImpl#getGraphe()
		 * @generated
		 */
		EClass GRAPHE = eINSTANCE.getGraphe();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHE__TYPE = eINSTANCE.getGraphe_Type();

		/**
		 * The meta object literal for the '<em><b>Bag Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHE__BAG_COLOR = eINSTANCE.getGraphe_BagColor();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHE__COLONNE = eINSTANCE.getGraphe_Colonne();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHE__DATA = eINSTANCE.getGraphe_Data();

		/**
		 * The meta object literal for the '{@link graphe1.Couleurs <em>Couleurs</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphe1.Couleurs
		 * @see graphe1.impl.Graphe1PackageImpl#getCouleurs()
		 * @generated
		 */
		EEnum COULEURS = eINSTANCE.getCouleurs();

		/**
		 * The meta object literal for the '{@link graphe1.TypeGraphe <em>Type Graphe</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphe1.TypeGraphe
		 * @see graphe1.impl.Graphe1PackageImpl#getTypeGraphe()
		 * @generated
		 */
		EEnum TYPE_GRAPHE = eINSTANCE.getTypeGraphe();

	}

} //Graphe1Package
