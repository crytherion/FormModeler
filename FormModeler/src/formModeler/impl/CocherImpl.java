/**
 */
package formModeler.impl;

import formModeler.Cocher;
import formModeler.FormModelerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cocher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link formModeler.impl.CocherImpl#isEtatParDefaut <em>Etat Par Defaut</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CocherImpl extends WidgetImpl implements Cocher {
	/**
	 * The default value of the '{@link #isEtatParDefaut() <em>Etat Par Defaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatParDefaut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ETAT_PAR_DEFAUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEtatParDefaut() <em>Etat Par Defaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatParDefaut()
	 * @generated
	 * @ordered
	 */
	protected boolean etatParDefaut = ETAT_PAR_DEFAUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CocherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormModelerPackage.Literals.COCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEtatParDefaut() {
		return etatParDefaut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatParDefaut(boolean newEtatParDefaut) {
		boolean oldEtatParDefaut = etatParDefaut;
		etatParDefaut = newEtatParDefaut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormModelerPackage.COCHER__ETAT_PAR_DEFAUT, oldEtatParDefaut, etatParDefaut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormModelerPackage.COCHER__ETAT_PAR_DEFAUT:
				return isEtatParDefaut();
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
			case FormModelerPackage.COCHER__ETAT_PAR_DEFAUT:
				setEtatParDefaut((Boolean)newValue);
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
			case FormModelerPackage.COCHER__ETAT_PAR_DEFAUT:
				setEtatParDefaut(ETAT_PAR_DEFAUT_EDEFAULT);
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
			case FormModelerPackage.COCHER__ETAT_PAR_DEFAUT:
				return etatParDefaut != ETAT_PAR_DEFAUT_EDEFAULT;
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
		result.append(" (etatParDefaut: ");
		result.append(etatParDefaut);
		result.append(')');
		return result.toString();
	}

} //CocherImpl
