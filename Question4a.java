public class Question4a {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        // For loop to add even numbers between 1 and 100
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
            count++;
        }

        // Calculate average
        double average = (double) sum / count;

        // Display results
        System.out.println("Sum of even numbers between 1 and 100 = " + sum);
        System.out.println("Count of even numbers = " + count);
        System.out.println("Average of even numbers = " + average);
    }
}
