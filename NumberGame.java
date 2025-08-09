import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxAttempts = 5;
        boolean playAgain = false;

        do {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between 1 to 100");

            while (attempts < maxAttempts) {
                System.out.println("Enter your guess:");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You guessed the number in" + attempts + "attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if(!guessedCorrectly){
                System.out.println("Sorry! The number was:" + numberToGuess);
            }

            System.out.println("Do you want to play again?(yes/no)");
            playAgain = sc.next().equalsIgnoreCase("Yes");

        }while(playAgain);

        sc.close();
    }
}
