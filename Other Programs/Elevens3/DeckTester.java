/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    String[] ranks = {"A", "B", "C", "D", "E"};
	    String[] suits = {"Distubred", "SlipKnot", "Avenge Sevenfold", "Korn"};
	    int[] values = {1, 2, 3, 4, 5};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
	}
}
