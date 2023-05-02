/**
 */
package graphe1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphe1.Graphe#getType <em>Type</em>}</li>
 *   <li>{@link graphe1.Graphe#getBagColor <em>Bag Color</em>}</li>
 *   <li>{@link graphe1.Graphe#getColonne <em>Colonne</em>}</li>
 *   <li>{@link graphe1.Graphe#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see graphe1.Graphe1Package#getGraphe()
 * @model
 * @generated
 */
public interface Graphe extends Name {
	private Object couleurs;

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"line"</code>.
	 * The literals are from the enumeration {@link graphe1.TypeGraphe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see graphe1.TypeGraphe
	 * @see #setType(TypeGraphe)
	 * @see graphe1.Graphe1Package#getGraphe_Type()
	 * @model default="line"
	 * @generated
	 */
	TypeGraphe getType();

	/**
	 * Sets the value of the '{@link graphe1.Graphe#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see graphe1.TypeGraphe
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeGraphe value);

	/**
	 * Returns the value of the '<em><b>Bag Color</b></em>' attribute.
	 * The literals are from the enumeration {@link graphe1.Couleurs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag Color</em>' attribute.
	 * @see graphe1.Couleurs
	 * @see #setBagColor(Couleurs)
	 * @see graphe1.Graphe1Package#getGraphe_BagColor()
	 * @model
	 * @generated
	 */
	Couleurs getBagColor();

	/**
	 * Sets the value of the '{@link graphe1.Graphe#getBagColor <em>Bag Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bag Color</em>' attribute.
	 * @see graphe1.Couleurs
	 * @see #getBagColor()
	 * @generated
	 */
	void setBagColor(Couleurs value);

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' reference list.
	 * The list contents are of type {@link graphe1.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' reference list.
	 * @see graphe1.Graphe1Package#getGraphe_Colonne()
	 * @model required="true"
	 * @generated
	 */
	EList<Colonne> getColonne();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Donner)
	 * @see graphe1.Graphe1Package#getGraphe_Data()
	 * @model required="true"
	 * @generated
	 */
	Donner getData();

	/**
	 * Sets the value of the '{@link graphe1.Graphe#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Donner value);

} // Graphe
