/**
 */
package graphe1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphe1.Colonne#getLabel <em>Label</em>}</li>
 *   <li>{@link graphe1.Colonne#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see graphe1.Graphe1Package#getColonne()
 * @model
 * @generated
 */
public interface Colonne extends Name {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see graphe1.Graphe1Package#getColonne_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link graphe1.Colonne#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"red"</code>.
	 * The literals are from the enumeration {@link graphe1.Couleurs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see graphe1.Couleurs
	 * @see #setColor(Couleurs)
	 * @see graphe1.Graphe1Package#getColonne_Color()
	 * @model default="red"
	 * @generated
	 */
	Couleurs getColor();

	/**
	 * Sets the value of the '{@link graphe1.Colonne#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see graphe1.Couleurs
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Couleurs value);

} // Colonne
