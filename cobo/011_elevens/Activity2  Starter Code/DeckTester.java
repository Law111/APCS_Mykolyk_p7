/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"ace", "king", "queen", "jack"};
		String [] suits = {"spade", "heart"};
		int[] pointValues = {1, 2, 3, 4};
		Deck a = new Deck(ranks, suits, pointValues);
		System.out.println("toString: " + a.toString());
		System.out.println("isEmpty: " + a.isEmpty());
		System.out.println("size: " + a.size());
		System.out.println("deal: " + a.deal());
		System.out.println("toString: " + a.toString());
		System.out.println("isEmpty: " + a.isEmpty());
		System.out.println("size: " + a.size());
		System.out.println("deal: " + a.deal());
		System.out.println("deal: " + a.deal());
		System.out.println("deal: " + a.deal());
		System.out.println("deal: " + a.deal());
		System.out.println("deal: " + a.deal());
		System.out.println("deal: " + a.deal());
		System.out.println("toString: " + a.toString());
		System.out.println("isEmpty: " + a.isEmpty());
		System.out.println("size: " + a.size());
	}
}
