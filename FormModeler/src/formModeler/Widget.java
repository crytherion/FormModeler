/**
 */
package formModeler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link formModeler.Widget#getNom <em>Nom</em>}</li>
 *   <li>{@link formModeler.Widget#getCol <em>Col</em>}</li>
 *   <li>{@link formModeler.Widget#getRow <em>Row</em>}</li>
 *   <li>{@link formModeler.Widget#getColx <em>Colx</em>}</li>
 *   <li>{@link formModeler.Widget#getRowx <em>Rowx</em>}</li>
 * </ul>
 * </p>
 *
 * @see formModeler.FormModelerPackage#getWidget()
 * @model abstract="true"
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see formModeler.FormModelerPackage#getWidget_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link formModeler.Widget#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' attribute.
	 * @see #setCol(int)
	 * @see formModeler.FormModelerPackage#getWidget_Col()
	 * @model
	 * @generated
	 */
	int getCol();

	/**
	 * Sets the value of the '{@link formModeler.Widget#getCol <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' attribute.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(int value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see formModeler.FormModelerPackage#getWidget_Row()
	 * @model
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link formModeler.Widget#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Returns the value of the '<em><b>Colx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colx</em>' attribute.
	 * @see #setColx(int)
	 * @see formModeler.FormModelerPackage#getWidget_Colx()
	 * @model
	 * @generated
	 */
	int getColx();

	/**
	 * Sets the value of the '{@link formModeler.Widget#getColx <em>Colx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colx</em>' attribute.
	 * @see #getColx()
	 * @generated
	 */
	void setColx(int value);

	/**
	 * Returns the value of the '<em><b>Rowx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowx</em>' attribute.
	 * @see #setRowx(int)
	 * @see formModeler.FormModelerPackage#getWidget_Rowx()
	 * @model
	 * @generated
	 */
	int getRowx();

	/**
	 * Sets the value of the '{@link formModeler.Widget#getRowx <em>Rowx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowx</em>' attribute.
	 * @see #getRowx()
	 * @generated
	 */
	void setRowx(int value);

} // Widget
