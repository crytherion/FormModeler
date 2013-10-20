/**
 */
package formModeler.impl;

import formModeler.FormModelerPackage;
import formModeler.MenuDeroulant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Deroulant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link formModeler.impl.MenuDeroulantImpl#getListeValeurs <em>Liste Valeurs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuDeroulantImpl extends WidgetImpl implements MenuDeroulant {
	/**
	 * The cached value of the '{@link #getListeValeurs() <em>Liste Valeurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeValeurs()
	 * @generated
	 * @ordered
	 */
	protected EList listeValeurs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuDeroulantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormModelerPackage.Literals.MENU_DEROULANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getListeValeurs() {
		return listeValeurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListeValeurs(EList newListeValeurs) {
		EList oldListeValeurs = listeValeurs;
		listeValeurs = newListeValeurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormModelerPackage.MENU_DEROULANT__LISTE_VALEURS, oldListeValeurs, listeValeurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormModelerPackage.MENU_DEROULANT__LISTE_VALEURS:
				return getListeValeurs();
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
			case FormModelerPackage.MENU_DEROULANT__LISTE_VALEURS:
				setListeValeurs((EList)newValue);
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
			case FormModelerPackage.MENU_DEROULANT__LISTE_VALEURS:
				setListeValeurs((EList)null);
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
			case FormModelerPackage.MENU_DEROULANT__LISTE_VALEURS:
				return listeValeurs != null;
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
		result.append(" (listeValeurs: ");
		result.append(listeValeurs);
		result.append(')');
		return result.toString();
	}

} //MenuDeroulantImpl
