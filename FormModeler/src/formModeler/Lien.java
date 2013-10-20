/**
 */
package formModeler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link formModeler.Lien#getCible <em>Cible</em>}</li>
 *   <li>{@link formModeler.Lien#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @see formModeler.FormModelerPackage#getLien()
 * @model
 * @generated
 */
public interface Lien extends Widget {
	/**
	 * Returns the value of the '<em><b>Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible</em>' attribute.
	 * @see #setCible(String)
	 * @see formModeler.FormModelerPackage#getLien_Cible()
	 * @model
	 * @generated
	 */
	String getCible();

	/**
	 * Sets the value of the '{@link formModeler.Lien#getCible <em>Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' attribute.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(String value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(String)
	 * @see formModeler.FormModelerPackage#getLien_Valeur()
	 * @model
	 * @generated
	 */
	String getValeur();

	/**
	 * Sets the value of the '{@link formModeler.Lien#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(String value);

} // Lien
