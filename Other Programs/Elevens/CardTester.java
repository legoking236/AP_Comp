/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card CardUno = new Card("King", "hearts", 13);
		Card CardDos = new Card("Ace", "spades", 1);
		Card CardTres = new Card("2", "clubs", 2);
		
		System.out.println(CardUno.suit());
		System.out.println(CardUno.rank());
		System.out.println(CardUno.pointValue());
		System.out.println(CardUno.toString());
		System.out.println(CardUno.matches(CardDos));
		
		System.out.println(CardDos.suit());
		System.out.println(CardDos.rank());
		System.out.println(CardDos.pointValue());
		System.out.println(CardDos.toString());
		System.out.println(CardDos.matches(CardTres));
		
		System.out.println(CardTres.suit());
		System.out.println(CardTres.rank());
		System.out.println(CardTres.pointValue());
		System.out.println(CardTres.toString());
		System.out.println(CardTres.matches(CardUno));
	}
}
