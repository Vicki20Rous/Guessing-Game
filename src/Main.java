import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int number = rand.nextInt(20) + 1;
        System.out.println("Random Number is " + number);

        System.out.println("Welcome to Number Guess!!! \n" + "I am thinking of a number between 1 and 20.\n" + "Take a guess..");
        int guess = in.nextInt();

        int tryAttempt = 0;

            if(number == guess) {
                System.out.println("Good job!!! You guessed my number in guesses!!");
            }

            else if(number > guess) {
                System.out.println("Your guess is too high.");

            }
            else if (number < guess){
                System.out.println("Your guess is too low.");
            }



    }
}
