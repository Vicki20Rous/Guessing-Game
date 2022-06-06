import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String username = "";
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

//        System.out.println("Welcome to Number Guess!!! \n" + " Hello!! What is your name ");
//        int username = in.nextInt();

        int number = rand.nextInt(20) + 1;


//        int input = in.nextInt();

        while (true) {
            System.out.println("Welcome to Number Guess!!! \n" +"Well, I am thinking of a number between 1 and 20.");
            System.out.println( "Take a guess..");
            int guess = in.nextInt();

            int tryAttempt = 0;

            if (number == guess) {
                System.out.println("Good job!!! You guessed my number in guesses!!");
                break;
            } else if (number < guess) {
                System.out.println("Your guess is too high.");

            } else {
                System.out.println("Your guess is too low.");
            }


        }
    }
}
