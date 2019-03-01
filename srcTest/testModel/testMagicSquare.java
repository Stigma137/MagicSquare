package testModel;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import model.MagicSquare;

class testMagicSquare {
	//Relationship
	private MagicSquare mg;
	
	/* Method that indicates a empty prove scenary in the test.
	*/
	public void setupScenary1() {
	}
	/* Method that indicates a prove scenary in the test with a MagicSquare instance.
	 */
	public void setupScenary2() {	
		mg = new MagicSquare();
	}
	/* Method that tests the MagicSquare constructor test with a MagicSquare instance.
	 */
	@Test
	void testmagicSquare() {
		setupScenary1();
		mg = new MagicSquare();
		assertNotNull("El objeto mg de tipo MagicSquare se ha creado", mg);
	}
	/* Method that tests the MagicSquare setOrder method test with a even number.
	 */
	@Test
	void testSetOrder1() {
		setupScenary2();
		mg.setOrder(2);
		assertTrue("El número no se ha añadido porque es impar o menor que 0", mg.getOrder() == 0);
	}
	/* Method that tests the MagicSquare setOrder method test with a negative number.
	 */
	@Test
	void testSetOrder2() {
		setupScenary2();
		mg.setOrder(-2);
		assertTrue("El número no se ha añadido porque es impar o menor que 0", mg.getOrder() == 0);
	}
}
