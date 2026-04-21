
import java.util.Scanner;

public class Question5a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = new int[8];   // array for 8 students
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int passed = 0;
        int failed = 0;

        // Accept marks from user
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];

            // Track highest and lowest
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest) lowest = marks[i];

            // Count pass/fail
            if (marks[i] >= 50) {
                passed++;
            } else {
                failed++;    }  }

        // Calculate average
        double average = (double) sum / marks.length;

        // Display results
        System.out.println("\nHighest mark = " + highest);
        System.out.println("Lowest mark = " + lowest);
        System.out.println("Sum of marks = " + sum);
        System.out.println("Average marks = " + average);
        System.out.println("Number of students passed = " + passed);
        System.out.println("Number of students failed = " + failed);

        // Display marks in reverse order
        System.out.println("\nMarks in reverse order:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);      }}}
