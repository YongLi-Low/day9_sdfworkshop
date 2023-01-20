package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Integer guessNumber = rand.nextInt(100);

        Integer myGuess = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100.");

        while (myGuess != guessNumber) {
            myGuess = input.nextInt();

            if (myGuess < guessNumber) {
                System.out.println("Guess a higher number");
            }
            else if (myGuess > guessNumber) {
                System.out.println("Guess a lower number");
            }
            else {
                System.out.println("You guessed correctly!");
                input.close();
                System.exit(0);
            }
        }
    }
}
