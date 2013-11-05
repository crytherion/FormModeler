/**
 */
package formModeler;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Deroulant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link formModeler.MenuDeroulant#getListeValeurs <em>Liste Valeurs</em>}</li>
 * </ul>
 * </p>
 *
 * @see formModeler.FormModelerPackage#getMenuDeroulant()
 * @model
 * @generated
 */
public interface MenuDeroulant extends Widget {
	/**
	 * Returns the value of the '<em><b>Liste Valeurs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Valeurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Valeurs</em>' attribute list.
	 * @see formModeler.FormModelerPackage#getMenuDeroulant_ListeValeurs()
	 * @model
	 * @generated
	 */
	EList<String> getListeValeurs();

} // MenuDeroulant
