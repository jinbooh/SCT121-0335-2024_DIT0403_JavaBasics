import java.util.Scanner;

public class Question2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for two integers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Perform relational and logical checks
        System.out.println(num1 + " is greater than " + num2 + ": " + (num1 > num2));
        System.out.println(num1 + " is less than " + num2 + ": " + (num1 < num2));
        System.out.println(num1 + " is equal to " + num2 + ": " + (num1 == num2));
        System.out.println("Both numbers are even: " + (num1 % 2 == 0 && num2 % 2 == 0));
        System.out.println("At least one number is positive: " + (num1 > 0 || num2 > 0));
    }
}
