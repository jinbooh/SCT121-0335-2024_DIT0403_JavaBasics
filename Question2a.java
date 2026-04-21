import java.util.Scanner;

public class Question2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for radius
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        // Perform calculations
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        // Display results with 2 decimal places
        System.out.printf("Diameter = %.2f%n", diameter);
        System.out.printf("Circumference = %.2f%n", circumference);
        System.out.printf("Area = %.2f%n", area);
    }
}
