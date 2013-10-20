/**
 */
package formModeler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Racine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link formModeler.Racine#getEcrans <em>Ecrans</em>}</li>
 * </ul>
 * </p>
 *
 * @see formModeler.FormModelerPackage#getRacine()
 * @model
 * @generated
 */
public interface Racine extends EObject {
	/**
	 * Returns the value of the '<em><b>Ecrans</b></em>' containment reference list.
	 * The list contents are of type {@link formModeler.Ecran}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecrans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecrans</em>' containment reference list.
	 * @see formModeler.FormModelerPackage#getRacine_Ecrans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ecran> getEcrans();

} // Racine
