/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card perry = new Card("perry", "perry", 1);
		Card lior = new Card("perry", "perry", 1);
		Card lawrence = new Card("perry", "perry", 2);
		System.out.println(lior.matches(lawrence));
		System.out.println(lior.matches(perry));
		System.out.println(perry);
		System.out.println(lior);
		System.out.println(lawrence);
	}
}
