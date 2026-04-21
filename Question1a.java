import java.util.Scanner;  // Import Scanner class

public class Question1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object

        // Ask for name
        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        // Ask for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Ask for height
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Display the welcome message
        System.out.println("\nWelcome " + name + "! You are " + age + " years old and " + height + " meters tall.");
    }
}
