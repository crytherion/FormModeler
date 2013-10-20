/**
 */
package formModeler.impl;

import formModeler.Bouton;
import formModeler.FormModelerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bouton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link formModeler.impl.BoutonImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link formModeler.impl.BoutonImpl#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoutonImpl extends WidgetImpl implements Bouton {
	/**
	 * The default value of the '{@link #getCible() <em>Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCible()
	 * @generated
	 * @ordered
	 */
	protected static final String CIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCible() <em>Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCible()
	 * @generated
	 * @ordered
	 */
	protected String cible = CIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final String VALEUR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected String valeur = VALEUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoutonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormModelerPackage.Literals.BOUTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCible() {
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCible(String newCible) {
		String oldCible = cible;
		cible = newCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormModelerPackage.BOUTON__CIBLE, oldCible, cible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur(String newValeur) {
		String oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormModelerPackage.BOUTON__VALEUR, oldValeur, valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormModelerPackage.BOUTON__CIBLE:
				return getCible();
			case FormModelerPackage.BOUTON__VALEUR:
				return getValeur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormModelerPackage.BOUTON__CIBLE:
				setCible((String)newValue);
				return;
			case FormModelerPackage.BOUTON__VALEUR:
				setValeur((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FormModelerPackage.BOUTON__CIBLE:
				setCible(CIBLE_EDEFAULT);
				return;
			case FormModelerPackage.BOUTON__VALEUR:
				setValeur(VALEUR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FormModelerPackage.BOUTON__CIBLE:
				return CIBLE_EDEFAULT == null ? cible != null : !CIBLE_EDEFAULT.equals(cible);
			case FormModelerPackage.BOUTON__VALEUR:
				return VALEUR_EDEFAULT == null ? valeur != null : !VALEUR_EDEFAULT.equals(valeur);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cible: ");
		result.append(cible);
		result.append(", valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //BoutonImpl
