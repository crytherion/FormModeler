/**
 */
package formModeler.impl;

import formModeler.Ecran;
import formModeler.FormModelerPackage;
import formModeler.Racine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Racine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link formModeler.impl.RacineImpl#getEcrans <em>Ecrans</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RacineImpl extends EObjectImpl implements Racine {
	/**
	 * The cached value of the '{@link #getEcrans() <em>Ecrans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcrans()
	 * @generated
	 * @ordered
	 */
	protected EList<Ecran> ecrans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RacineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormModelerPackage.Literals.RACINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ecran> getEcrans() {
		if (ecrans == null) {
			ecrans = new EObjectContainmentEList<Ecran>(Ecran.class, this, FormModelerPackage.RACINE__ECRANS);
		}
		return ecrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormModelerPackage.RACINE__ECRANS:
				return ((InternalEList<?>)getEcrans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormModelerPackage.RACINE__ECRANS:
				return getEcrans();
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
			case FormModelerPackage.RACINE__ECRANS:
				getEcrans().clear();
				getEcrans().addAll((Collection<? extends Ecran>)newValue);
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
			case FormModelerPackage.RACINE__ECRANS:
				getEcrans().clear();
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
			case FormModelerPackage.RACINE__ECRANS:
				return ecrans != null && !ecrans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RacineImpl
