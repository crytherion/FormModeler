/**
 */
package formModeler.impl;

import formModeler.FormModelerPackage;
import formModeler.MenuDeroulant;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Deroulant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link formModeler.impl.MenuDeroulantImpl#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuDeroulantImpl extends WidgetImpl implements MenuDeroulant {
	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected EList<String> valeur;
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
	public EList<String> getValeur() {
		if (valeur == null) {
			valeur = new EDataTypeUniqueEList<String>(String.class, this, FormModelerPackage.MENU_DEROULANT__VALEUR);
		}
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormModelerPackage.MENU_DEROULANT__VALEUR:
				return getValeur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormModelerPackage.MENU_DEROULANT__VALEUR:
				getValeur().clear();
				getValeur().addAll((Collection<? extends String>)newValue);
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
			case FormModelerPackage.MENU_DEROULANT__VALEUR:
				getValeur().clear();
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
			case FormModelerPackage.MENU_DEROULANT__VALEUR:
				return valeur != null && !valeur.isEmpty();
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
		result.append(" (valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //MenuDeroulantImpl
