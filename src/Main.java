import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);

        //input username

        System.out.println("Welcome to Number Guess!!! \n" + " Hello!! What is your name?");
        String username = in.nextLine();
        System.out.println("Well " + username + ", " + "I am thinking of a number between 1 and 20.");

        String playAgain;
        do {
            Random rand = new Random();
            int number = rand.nextInt(20) + 1;
            int tryAttempt = 0;

            while (true) {
                System.out.println("Take a guess..");
                try {
                    int guess = in.nextInt();
                    tryAttempt++;

                    if (number == guess) {
                        System.out.println("Good job!!! You guessed my number in " + tryAttempt + " guesses!!");
                        break;
                    } else if (number < guess) {
                        System.out.println("Your guess is too high.");

                    } else if (number > guess) {
                        System.out.println("Your guess is too low.");
                    }

                } catch (InputMismatchException err) {
                    System.out.println("Invalid Input: Please enter a number!!!");
                    in.next();
                }
            } ///end of while loop

            System.out.println("Would you like to play again (y or n)?");
            playAgain = in.next();

        } while (playAgain.equalsIgnoreCase("y"));
    }

}
