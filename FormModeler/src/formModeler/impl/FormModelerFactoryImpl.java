/**
 */
package formModeler.impl;

import formModeler.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormModelerFactoryImpl extends EFactoryImpl implements FormModelerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormModelerFactory init() {
		try {
			FormModelerFactory theFormModelerFactory = (FormModelerFactory)EPackage.Registry.INSTANCE.getEFactory("http://github.com/crytherion/FormModeler"); 
			if (theFormModelerFactory != null) {
				return theFormModelerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FormModelerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormModelerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FormModelerPackage.ECRAN: return createEcran();
			case FormModelerPackage.LABEL: return createLabel();
			case FormModelerPackage.BOUTON: return createBouton();
			case FormModelerPackage.CHAMP_TEXTE: return createChampTexte();
			case FormModelerPackage.MENU_DEROULANT: return createMenuDeroulant();
			case FormModelerPackage.COCHER: return createCocher();
			case FormModelerPackage.LIEN: return createLien();
			case FormModelerPackage.RACINE: return createRacine();
			case FormModelerPackage.PHOTO: return createPhoto();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecran createEcran() {
		EcranImpl ecran = new EcranImpl();
		return ecran;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bouton createBouton() {
		BoutonImpl bouton = new BoutonImpl();
		return bouton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChampTexte createChampTexte() {
		ChampTexteImpl champTexte = new ChampTexteImpl();
		return champTexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuDeroulant createMenuDeroulant() {
		MenuDeroulantImpl menuDeroulant = new MenuDeroulantImpl();
		return menuDeroulant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cocher createCocher() {
		CocherImpl cocher = new CocherImpl();
		return cocher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lien createLien() {
		LienImpl lien = new LienImpl();
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Racine createRacine() {
		RacineImpl racine = new RacineImpl();
		return racine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photo createPhoto() {
		PhotoImpl photo = new PhotoImpl();
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormModelerPackage getFormModelerPackage() {
		return (FormModelerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FormModelerPackage getPackage() {
		return FormModelerPackage.eINSTANCE;
	}

} //FormModelerFactoryImpl
