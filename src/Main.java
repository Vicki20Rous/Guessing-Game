import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello! What is you name?");
        Scanner input = new Scanner(System.in);
        input.nextInt();
        System.out.println("Well, " + input + "I am thinking of a number between 1 and 20.");
//        Scanner input = new Scanner(System.in);
        input.nextInt();



        Random rand = new Random();
        int number = rand.nextInt(20);
        int tryAttempt = 6;

    }
}
