import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String username = "";
        System.out.println( "Welcome to Number Guess!!! \n" + "I am thinking of a number between 1 and 20.");

        Scanner input = new Scanner(System.in);
        input.nextInt();
        Random rand = new Random();
        int number = rand.nextInt(20);
        int tryAttempt = 6;
        int guess;

        for(guess = 0; guess < tryAttempt; guess++) {
            System.out.println("Take a guess..");
            guess = input.nextInt();

            if(number > guess && guess != tryAttempt - 1) {
                System.out.println("Your guess ia too high.");
            }
            else if (number < guess && guess != tryAttempt - 1) {
                System.out.println("Your guess is too low");
            }
            else
        }

    }
}
