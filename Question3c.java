import java.util.Scanner;

public class Question3c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for day number
        System.out.print("Enter day number (1-7): ");
        int day = input.nextInt();

        // Switch statement to display day name
        switch (day) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Invalid day number! Please enter 1-7.");
        }
    }
}
