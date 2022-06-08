import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String username = "";
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int number = rand.nextInt(20) + 1;
        int tryAttempt = 0;
        String playAgain = "";


        System.out.println("Welcome to Number Guess!!! \n" + " Hello!! What is your name " + username);
        System.out.println("Well, I am thinking of a number between 1 and 20.");
//        String input = Integer.toString(Integer.parseInt(username));



//        int input = in.nextInt();
        while (true) {
            System.out.println( "Take a guess..");
            int guess = in.nextInt();
            tryAttempt++;

            if (number == guess) {
                System.out.println("Good job!!! You guessed my number in " + tryAttempt + " guesses!!" + "\nWould you like to play again? (yes or no)" + playAgain);
                break;
            } else if (number < guess) {
                System.out.println("Your guess is too high.");

            } else if (number > guess) {
                System.out.println("Your guess is too low.");
            }


        }
    }
}
