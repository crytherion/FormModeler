/**
 */
package formModeler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see formModeler.FormModelerPackage
 * @generated
 */
public interface FormModelerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormModelerFactory eINSTANCE = formModeler.impl.FormModelerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ecran</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecran</em>'.
	 * @generated
	 */
	Ecran createEcran();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Bouton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouton</em>'.
	 * @generated
	 */
	Bouton createBouton();

	/**
	 * Returns a new object of class '<em>Champ Texte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Champ Texte</em>'.
	 * @generated
	 */
	ChampTexte createChampTexte();

	/**
	 * Returns a new object of class '<em>Menu Deroulant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Deroulant</em>'.
	 * @generated
	 */
	MenuDeroulant createMenuDeroulant();

	/**
	 * Returns a new object of class '<em>Cocher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cocher</em>'.
	 * @generated
	 */
	Cocher createCocher();

	/**
	 * Returns a new object of class '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lien</em>'.
	 * @generated
	 */
	Lien createLien();

	/**
	 * Returns a new object of class '<em>Racine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Racine</em>'.
	 * @generated
	 */
	Racine createRacine();

	/**
	 * Returns a new object of class '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo</em>'.
	 * @generated
	 */
	Photo createPhoto();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FormModelerPackage getFormModelerPackage();

} //FormModelerFactory
