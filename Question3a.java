import java.util.Scanner;

public class Question3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = input.nextInt();

        // Handle invalid marks (below 0 or above 100)
        if (marks < 0 || marks > 100) {
            System.out.println("Error: Invalid marks. Please enter a value between 0 and 100.");
        } else {
            // JKUAT Grading System logic
            if (marks >= 70) {
                System.out.println("Grade: A");
                System.out.println("Remark: Excellent");
            } else if (marks >= 60) {
                System.out.println("Grade: B");
                System.out.println("Remark: Very Good");
            } else if (marks >= 50) {
                System.out.println("Grade: C");
                System.out.println("Remark: Good");
            } else if (marks >= 40) {
                System.out.println("Grade: D");
                System.out.println("Remark: Pass");
            } else {
                System.out.println("Grade: E");
                System.out.println("Remark: Fail");
            }
        }
    }
}