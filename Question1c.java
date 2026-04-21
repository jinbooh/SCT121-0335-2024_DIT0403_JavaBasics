import javax.swing.JOptionPane;

public class Question1c {
    public static void main(String[] args) {
        // Ask for two numbers as Strings
        String num1Str = JOptionPane.showInputDialog("Enter first number:");
        String num2Str = JOptionPane.showInputDialog("Enter second number:");

        // Convert Strings to integers using Wrapper class
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Perform arithmetic operations
        int sum = num1 + num2;   //addition
        int diff = num1 - num2;  //subtarction
        int prod = num1 * num2;  //multiplication
        int quot = num1 / num2;  //division

        // Display results in a dialog box
        String result = "First number: " + num1 +
                        "\nSecond number: " + num2 +
                        "\nSum: " + sum +
                        "\nDifference: " + diff +
                        "\nProduct: " + prod +
                        "\nQuotient: " + quot;

        JOptionPane.showMessageDialog(null, result);
    }
}
