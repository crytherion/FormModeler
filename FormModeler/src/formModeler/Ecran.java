/**
 */
package formModeler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecran</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link formModeler.Ecran#getNom <em>Nom</em>}</li>
 *   <li>{@link formModeler.Ecran#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link formModeler.Ecran#getTitre <em>Titre</em>}</li>
 * </ul>
 * </p>
 *
 * @see formModeler.FormModelerPackage#getEcran()
 * @model
 * @generated
 */
public interface Ecran extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see formModeler.FormModelerPackage#getEcran_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link formModeler.Ecran#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link formModeler.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see formModeler.FormModelerPackage#getEcran_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see formModeler.FormModelerPackage#getEcran_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link formModeler.Ecran#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

} // Ecran
