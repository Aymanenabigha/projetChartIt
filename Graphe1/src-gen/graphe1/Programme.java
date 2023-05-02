/**
 */
package graphe1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphe1.Programme#getGraphe <em>Graphe</em>}</li>
 *   <li>{@link graphe1.Programme#getColonne <em>Colonne</em>}</li>
 *   <li>{@link graphe1.Programme#getDonner <em>Donner</em>}</li>
 * </ul>
 *
 * @see graphe1.Graphe1Package#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends Name {
	/**
	 * Returns the value of the '<em><b>Graphe</b></em>' containment reference list.
	 * The list contents are of type {@link graphe1.Graphe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphe</em>' containment reference list.
	 * @see graphe1.Graphe1Package#getProgramme_Graphe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Graphe> getGraphe();

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' containment reference list.
	 * The list contents are of type {@link graphe1.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' containment reference list.
	 * @see graphe1.Graphe1Package#getProgramme_Colonne()
	 * @model containment="true"
	 * @generated
	 */
	EList<Colonne> getColonne();

	/**
	 * Returns the value of the '<em><b>Donner</b></em>' containment reference list.
	 * The list contents are of type {@link graphe1.Donner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donner</em>' containment reference list.
	 * @see graphe1.Graphe1Package#getProgramme_Donner()
	 * @model containment="true"
	 * @generated
	 */
	EList<Donner> getDonner();

} // Programme
