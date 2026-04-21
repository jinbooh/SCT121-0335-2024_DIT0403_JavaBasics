import java.util.Scanner;

public class Question3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for gender
        System.out.print("Enter gender (M/F): ");
        char gender = input.next().charAt(0);

        // Ask for monthly salary
        System.out.print("Enter monthly salary: ");
        double salary = input.nextDouble();

        double taxRate = 0.0;
        double taxAmount;
        double netSalary;

        // Nested if-else based on gender and salary
        if (gender == 'M' || gender == 'm') {
            if (salary < 30000) {
                taxRate = 0.10; // 10%
            } else {
                taxRate = 0.15; // 15%
            }
        } else if (gender == 'F' || gender == 'f') {
            if (salary < 25000) {
                taxRate = 0.08; // 8%
            } else {
                taxRate = 0.12; // 12%
            }
        } else {
            System.out.println("Invalid gender entered!");
            return; // stop program
        }

        // Calculate tax and net salary
        taxAmount = salary * taxRate;
        netSalary = salary - taxAmount;

        // Display results
        System.out.println("Gender: " + (gender == 'M' || gender == 'm' ? "Male" : "Female"));
        System.out.println("Salary: " + salary);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Net Salary: " + netSalary); }}
