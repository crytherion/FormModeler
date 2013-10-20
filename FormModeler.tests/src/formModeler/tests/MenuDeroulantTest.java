/**
 */
package formModeler.tests;

import formModeler.FormModelerFactory;
import formModeler.MenuDeroulant;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Menu Deroulant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuDeroulantTest extends WidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MenuDeroulantTest.class);
	}

	/**
	 * Constructs a new Menu Deroulant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuDeroulantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Menu Deroulant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MenuDeroulant getFixture() {
		return (MenuDeroulant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormModelerFactory.eINSTANCE.createMenuDeroulant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MenuDeroulantTest
