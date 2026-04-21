import java.util.Scanner;

public class Question2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for a number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is EVEN");
        } else {
            System.out.println(num + " is ODD");
        }

        // Check divisibility by 5
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is NOT divisible by 5");
        }

        // Show remainder when divided by 3
        System.out.println(num + " divided by 3 gives remainder: " + (num % 3));
    }
}
