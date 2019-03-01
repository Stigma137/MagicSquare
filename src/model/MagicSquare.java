package model;

public class MagicSquare {
	//Atribute
	private int n;
	/* Constructor method that allows to create an instance of MagicSquare
	*/
	public MagicSquare() {
    }
	/* Method that allows to set the order of the magic square.
	 * @param n that indicates the magic square order.
	*/
	public void setOrder(int n) {
		if (n%2==0 || n < 0) {
			this.n = 0;
		}
		else {
			this.n = n;
		}
	}
	/* Method that allows to get the order of the magic square.
	 * @return A number that indicates the magic square order.
	*/
	public int getOrder() {
		return n;
	}
	/* Method that allows to set the order of the magic square.
	 * @return A number that indicates the magic constant.
	*/
	public int getMagicConstant() {
		return (n*(n*n+1))/2;
	}
}	
