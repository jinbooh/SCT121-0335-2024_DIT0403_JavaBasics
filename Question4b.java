import java.util.Scanner;

public class Question4b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate random number between 1 and 50
        int secretNumber = (int)(Math.random() * 50) + 1;

        int guess = 0;
        int attempts = 0;

        // While loop for guessing
        while (guess != secretNumber) {
            System.out.print("Guess the number (1-50): ");
            guess = input.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! The secret number was " + secretNumber);
                System.out.println("Total attempts: " + attempts);
            }
        }
    }
}
