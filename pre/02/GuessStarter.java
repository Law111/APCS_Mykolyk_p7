import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mynum = scan.nextInt();
        System.out.println("Your guess: " + mynum);

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("Actual number: " + number);

        System.out.println("Off by: " + Math.abs(number-mynum));


    }

}
