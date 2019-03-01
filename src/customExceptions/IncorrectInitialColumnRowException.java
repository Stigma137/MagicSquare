package customExceptions;

public class IncorrectInitialColumnRowException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Attribute
	private String iCR;
	/* Constructor method that allows to create an instance IncorrectOrderException.
	* @param A string that indicates an incorrect initial column/row to create a MagicSquare. 
	*/
	public IncorrectInitialColumnRowException(String iCR) {
		this.iCR = iCR;
	}
	/* Method that allows to obtain the wrong initial column/row.
	* @return A string that indicates an incorrect initial column/row to create a MagicSquare. 
	*/
	public String getIRC() {
		return iCR;
	}
}
