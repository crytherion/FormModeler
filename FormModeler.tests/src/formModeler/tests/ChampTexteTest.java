/**
 */
package formModeler.tests;

import formModeler.ChampTexte;
import formModeler.FormModelerFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Champ Texte</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChampTexteTest extends WidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChampTexteTest.class);
	}

	/**
	 * Constructs a new Champ Texte test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChampTexteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Champ Texte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChampTexte getFixture() {
		return (ChampTexte)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormModelerFactory.eINSTANCE.createChampTexte());
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

} //ChampTexteTest
