package testModel;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import application.MagicSquareController;
import customExceptions.IncorrectDirectionException;
import customExceptions.IncorrectInitialColumnRowException;
import customExceptions.IncorrectOrderException;

class testMagicSquareControllrer {	
	//Relationship
	private MagicSquareController mgc;
	
	/* Method that indicates a empty prove scenary in the test.
	*/
	public void setupScenary1() {	
	}
	/* Method that indicates a prove scenary in the test with a MagicSquareCotroller instance.
	 */
	public void setupScenary2() {
		mgc = new MagicSquareController();
	}
	/* Method that tests the MagicSquareController constructor test with a MagicSquareController instance.
	 */
	@Test
	void testmagicController() {
		setupScenary1();
		mgc = new MagicSquareController();
		assertNotNull("Se ha creado una instancia de MagicSquareController", mgc);
	}
	/* Method that tests the custom exception IncorrectOrderException.
	 */
	@Test
	void testShowMagicSquare1() throws IncorrectInitialColumnRowException, IncorrectDirectionException {
		try {
		setupScenary2();
		mgc.showSquare(4, "Row-1", "NO");
		fail("Se esperaba IncorrectOrderException");
		} catch(IncorrectOrderException e) {		
		}
	}
	/* Method that tests the custom exception IncorrectOrderException.
	 */
	@Test
	void testShowMagicSquare2() throws IncorrectInitialColumnRowException, IncorrectDirectionException {
		try {
		setupScenary2();
		mgc.showSquare(-4, "Row-1", "NO");
		fail("Se esperaba IncorrectOrderException");
		} catch(IncorrectOrderException e) {		
		}
	}
	/* Method that tests the custom exception IncorrectInitialColumnRowException.
	 */
	@Test
	void testShowMagicSquare3() throws IncorrectDirectionException, IncorrectOrderException {
		try {
		setupScenary2();
		mgc.showSquare(3, "Row-z", "NO");
		fail("Se esperaba IncorrectInitialColumnRowException");
		} catch(IncorrectInitialColumnRowException e) {		
		}
	}
	/* Method that tests the custom exception IncorrectDirectionException.
	 */
	@Test
	void testShowMagicSquare4() throws  IncorrectOrderException, IncorrectInitialColumnRowException {
		try {
		setupScenary2();
		mgc.showSquare(3, "Column-1", "N23123");
		fail("Se esperaba IncorrectDirectionException");
		} catch(IncorrectDirectionException e) {		
		}
	}
}
