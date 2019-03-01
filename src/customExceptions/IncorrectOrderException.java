package customExceptions;

public class IncorrectOrderException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Attribute
	private int n;
	/* Constructor method that allows to create an instance IncorrectOrderException.
	* @param A number that indicates a even or negative number not allowed to create a MagicSquare. 
	*/
	public IncorrectOrderException(int n) {
		this.n = n;
	}
	/* Method that allows to obtain the number not allowed in a Magic Square Building.
	* @return A number that indicates a even or negative number not allowed to create MagicSquare. 
	*/
	public int getN() {
		return n;
	}
}
