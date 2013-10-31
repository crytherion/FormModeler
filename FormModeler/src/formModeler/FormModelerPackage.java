/**
 */
package formModeler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see formModeler.FormModelerFactory
 * @model kind="package"
 * @generated
 */
public interface FormModelerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "formModeler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/crytherion/FormModeler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "formModeler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormModelerPackage eINSTANCE = formModeler.impl.FormModelerPackageImpl.init();

	/**
	 * The meta object id for the '{@link formModeler.impl.EcranImpl <em>Ecran</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.EcranImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getEcran()
	 * @generated
	 */
	int ECRAN = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECRAN__NOM = 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECRAN__WIDGETS = 1;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECRAN__TITRE = 2;

	/**
	 * The number of structural features of the '<em>Ecran</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECRAN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link formModeler.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.WidgetImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NOM = 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__COL = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ROW = 2;

	/**
	 * The feature id for the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__COLX = 3;

	/**
	 * The feature id for the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ROWX = 4;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link formModeler.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.LabelImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NOM = WIDGET__NOM;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COL = WIDGET__COL;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLX = WIDGET__COLX;

	/**
	 * The feature id for the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ROWX = WIDGET__ROWX;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VALEUR = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link formModeler.impl.BoutonImpl <em>Bouton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.BoutonImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getBouton()
	 * @generated
	 */
	int BOUTON = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__NOM = WIDGET__NOM;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__COL = WIDGET__COL;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__COLX = WIDGET__COLX;

	/**
	 * The feature id for the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__ROWX = WIDGET__ROWX;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__VALEUR = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__CIBLE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bouton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link formModeler.impl.ChampTexteImpl <em>Champ Texte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.ChampTexteImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getChampTexte()
	 * @generated
	 */
	int CHAMP_TEXTE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_TEXTE__NOM = WIDGET__NOM;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_TEXTE__COL = WIDGET__COL;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_TEXTE__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_TEXTE__COLX = WIDGET__COLX;

	/**
	 * The feature id for the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_TEXTE__ROWX = WIDGET__ROWX;

	/**
	 * The number of structural features of the '<em>Champ Texte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_TEXTE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link formModeler.impl.MenuDeroulantImpl <em>Menu Deroulant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.MenuDeroulantImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getMenuDeroulant()
	 * @generated
	 */
	int MENU_DEROULANT = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEROULANT__NOM = WIDGET__NOM;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEROULANT__COL = WIDGET__COL;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEROULANT__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEROULANT__COLX = WIDGET__COLX;

	/**
	 * The feature id for the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEROULANT__ROWX = WIDGET__ROWX;

	/**
	 * The feature id for the '<em><b>Liste Valeurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEROULANT__LISTE_VALEURS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu Deroulant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_DEROULANT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link formModeler.impl.CocherImpl <em>Cocher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.CocherImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getCocher()
	 * @generated
	 */
	int COCHER = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHER__NOM = WIDGET__NOM;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHER__COL = WIDGET__COL;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHER__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHER__COLX = WIDGET__COLX;

	/**
	 * The feature id for the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHER__ROWX = WIDGET__ROWX;

	/**
	 * The feature id for the '<em><b>Etat Par Defaut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHER__ETAT_PAR_DEFAUT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cocher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link formModeler.impl.LienImpl <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.LienImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getLien()
	 * @generated
	 */
	int LIEN = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__NOM = WIDGET__NOM;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__COL = WIDGET__COL;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__COLX = WIDGET__COLX;

	/**
	 * The feature id for the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__ROWX = WIDGET__ROWX;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__VALEUR = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__CIBLE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link formModeler.impl.RacineImpl <em>Racine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.RacineImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getRacine()
	 * @generated
	 */
	int RACINE = 8;

	/**
	 * The feature id for the '<em><b>Ecrans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE__ECRANS = 0;

	/**
	 * The number of structural features of the '<em>Racine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link formModeler.impl.PhotoImpl <em>Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formModeler.impl.PhotoImpl
	 * @see formModeler.impl.FormModelerPackageImpl#getPhoto()
	 * @generated
	 */
	int PHOTO = 9;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__NOM = WIDGET__NOM;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__COL = WIDGET__COL;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__COLX = WIDGET__COLX;

	/**
	 * The feature id for the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__ROWX = WIDGET__ROWX;

	/**
	 * The feature id for the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__CHEMIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link formModeler.Ecran <em>Ecran</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecran</em>'.
	 * @see formModeler.Ecran
	 * @generated
	 */
	EClass getEcran();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Ecran#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see formModeler.Ecran#getNom()
	 * @see #getEcran()
	 * @generated
	 */
	EAttribute getEcran_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link formModeler.Ecran#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see formModeler.Ecran#getWidgets()
	 * @see #getEcran()
	 * @generated
	 */
	EReference getEcran_Widgets();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Ecran#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see formModeler.Ecran#getTitre()
	 * @see #getEcran()
	 * @generated
	 */
	EAttribute getEcran_Titre();

	/**
	 * Returns the meta object for class '{@link formModeler.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see formModeler.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Label#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see formModeler.Label#getValeur()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Valeur();

	/**
	 * Returns the meta object for class '{@link formModeler.Bouton <em>Bouton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouton</em>'.
	 * @see formModeler.Bouton
	 * @generated
	 */
	EClass getBouton();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Bouton#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see formModeler.Bouton#getValeur()
	 * @see #getBouton()
	 * @generated
	 */
	EAttribute getBouton_Valeur();

	/**
	 * Returns the meta object for the reference '{@link formModeler.Bouton#getCible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cible</em>'.
	 * @see formModeler.Bouton#getCible()
	 * @see #getBouton()
	 * @generated
	 */
	EReference getBouton_Cible();

	/**
	 * Returns the meta object for class '{@link formModeler.ChampTexte <em>Champ Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Champ Texte</em>'.
	 * @see formModeler.ChampTexte
	 * @generated
	 */
	EClass getChampTexte();

	/**
	 * Returns the meta object for class '{@link formModeler.MenuDeroulant <em>Menu Deroulant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Deroulant</em>'.
	 * @see formModeler.MenuDeroulant
	 * @generated
	 */
	EClass getMenuDeroulant();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.MenuDeroulant#getListeValeurs <em>Liste Valeurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Liste Valeurs</em>'.
	 * @see formModeler.MenuDeroulant#getListeValeurs()
	 * @see #getMenuDeroulant()
	 * @generated
	 */
	EAttribute getMenuDeroulant_ListeValeurs();

	/**
	 * Returns the meta object for class '{@link formModeler.Cocher <em>Cocher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cocher</em>'.
	 * @see formModeler.Cocher
	 * @generated
	 */
	EClass getCocher();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Cocher#isEtatParDefaut <em>Etat Par Defaut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etat Par Defaut</em>'.
	 * @see formModeler.Cocher#isEtatParDefaut()
	 * @see #getCocher()
	 * @generated
	 */
	EAttribute getCocher_EtatParDefaut();

	/**
	 * Returns the meta object for class '{@link formModeler.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see formModeler.Lien
	 * @generated
	 */
	EClass getLien();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Lien#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see formModeler.Lien#getValeur()
	 * @see #getLien()
	 * @generated
	 */
	EAttribute getLien_Valeur();

	/**
	 * Returns the meta object for the reference '{@link formModeler.Lien#getCible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cible</em>'.
	 * @see formModeler.Lien#getCible()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Cible();

	/**
	 * Returns the meta object for class '{@link formModeler.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see formModeler.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Widget#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see formModeler.Widget#getNom()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Nom();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Widget#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col</em>'.
	 * @see formModeler.Widget#getCol()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Col();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Widget#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see formModeler.Widget#getRow()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Row();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Widget#getColx <em>Colx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colx</em>'.
	 * @see formModeler.Widget#getColx()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Colx();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Widget#getRowx <em>Rowx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowx</em>'.
	 * @see formModeler.Widget#getRowx()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Rowx();

	/**
	 * Returns the meta object for class '{@link formModeler.Racine <em>Racine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Racine</em>'.
	 * @see formModeler.Racine
	 * @generated
	 */
	EClass getRacine();

	/**
	 * Returns the meta object for the containment reference list '{@link formModeler.Racine#getEcrans <em>Ecrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecrans</em>'.
	 * @see formModeler.Racine#getEcrans()
	 * @see #getRacine()
	 * @generated
	 */
	EReference getRacine_Ecrans();

	/**
	 * Returns the meta object for class '{@link formModeler.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo</em>'.
	 * @see formModeler.Photo
	 * @generated
	 */
	EClass getPhoto();

	/**
	 * Returns the meta object for the attribute '{@link formModeler.Photo#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see formModeler.Photo#getChemin()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Chemin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormModelerFactory getFormModelerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link formModeler.impl.EcranImpl <em>Ecran</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.EcranImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getEcran()
		 * @generated
		 */
		EClass ECRAN = eINSTANCE.getEcran();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECRAN__NOM = eINSTANCE.getEcran_Nom();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECRAN__WIDGETS = eINSTANCE.getEcran_Widgets();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECRAN__TITRE = eINSTANCE.getEcran_Titre();

		/**
		 * The meta object literal for the '{@link formModeler.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.LabelImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__VALEUR = eINSTANCE.getLabel_Valeur();

		/**
		 * The meta object literal for the '{@link formModeler.impl.BoutonImpl <em>Bouton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.BoutonImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getBouton()
		 * @generated
		 */
		EClass BOUTON = eINSTANCE.getBouton();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUTON__VALEUR = eINSTANCE.getBouton_Valeur();

		/**
		 * The meta object literal for the '<em><b>Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUTON__CIBLE = eINSTANCE.getBouton_Cible();

		/**
		 * The meta object literal for the '{@link formModeler.impl.ChampTexteImpl <em>Champ Texte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.ChampTexteImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getChampTexte()
		 * @generated
		 */
		EClass CHAMP_TEXTE = eINSTANCE.getChampTexte();

		/**
		 * The meta object literal for the '{@link formModeler.impl.MenuDeroulantImpl <em>Menu Deroulant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.MenuDeroulantImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getMenuDeroulant()
		 * @generated
		 */
		EClass MENU_DEROULANT = eINSTANCE.getMenuDeroulant();

		/**
		 * The meta object literal for the '<em><b>Liste Valeurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_DEROULANT__LISTE_VALEURS = eINSTANCE.getMenuDeroulant_ListeValeurs();

		/**
		 * The meta object literal for the '{@link formModeler.impl.CocherImpl <em>Cocher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.CocherImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getCocher()
		 * @generated
		 */
		EClass COCHER = eINSTANCE.getCocher();

		/**
		 * The meta object literal for the '<em><b>Etat Par Defaut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COCHER__ETAT_PAR_DEFAUT = eINSTANCE.getCocher_EtatParDefaut();

		/**
		 * The meta object literal for the '{@link formModeler.impl.LienImpl <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.LienImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getLien()
		 * @generated
		 */
		EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEN__VALEUR = eINSTANCE.getLien_Valeur();

		/**
		 * The meta object literal for the '<em><b>Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__CIBLE = eINSTANCE.getLien_Cible();

		/**
		 * The meta object literal for the '{@link formModeler.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.WidgetImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NOM = eINSTANCE.getWidget_Nom();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__COL = eINSTANCE.getWidget_Col();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ROW = eINSTANCE.getWidget_Row();

		/**
		 * The meta object literal for the '<em><b>Colx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__COLX = eINSTANCE.getWidget_Colx();

		/**
		 * The meta object literal for the '<em><b>Rowx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ROWX = eINSTANCE.getWidget_Rowx();

		/**
		 * The meta object literal for the '{@link formModeler.impl.RacineImpl <em>Racine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.RacineImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getRacine()
		 * @generated
		 */
		EClass RACINE = eINSTANCE.getRacine();

		/**
		 * The meta object literal for the '<em><b>Ecrans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACINE__ECRANS = eINSTANCE.getRacine_Ecrans();

		/**
		 * The meta object literal for the '{@link formModeler.impl.PhotoImpl <em>Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formModeler.impl.PhotoImpl
		 * @see formModeler.impl.FormModelerPackageImpl#getPhoto()
		 * @generated
		 */
		EClass PHOTO = eINSTANCE.getPhoto();

		/**
		 * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__CHEMIN = eINSTANCE.getPhoto_Chemin();

	}

} //FormModelerPackage
