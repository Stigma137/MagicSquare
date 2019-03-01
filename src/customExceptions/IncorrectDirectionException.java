package customExceptions;

public class IncorrectDirectionException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Attribute
	private String d;
	/* Constructor method that allows to create an instance IncorrectOrderException.
	* @param A string that indicates an incorrect direction to create a MagicSquare. 
	*/
	public IncorrectDirectionException(String d) {
		this.d = d;
	}
	/* Method that allows to obtain the wrong direction.
	* @return A string that indicates an incorrect direction to create a MagicSquare. 
	*/
	public String getD() {
		return d;
	}
}


