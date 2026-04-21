import javax.swing.JOptionPane;  // Import JOptionPane class

public class Question1b {
    public static void main(String[] args) {
        // Ask for favorite food
        String food = JOptionPane.showInputDialog("Enter your favorite food:");

        // Ask for favorite color
        String color = JOptionPane.showInputDialog("Enter your favorite color:");

        // Show the result in a dialog box
        JOptionPane.showMessageDialog(null, "Your favorite food is " + food + " and favorite color is " + color);
    }
}
