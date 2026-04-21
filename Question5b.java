

//This program performs a linear search on a predefined array of 10 integers. The user enters a search key, and the program checks each element one by one until it finds a match. If the key is found, the program displays the index position of the first occurrence. If not found, it displays “Element not found.” It also shows the total number of comparisons made during the search.
//The key concepts applied here were linear search algorithm, array traversal, and comparison counting. This program demonstrates how searching works by sequentially checking each element in an array.


import java.util.Scanner;

public class Question5b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create array of 10 integers
        int[] numbers = {23, 45, 12, 67, 34, 89, 56, 78, 90, 33};

        // Ask for search key
        System.out.print("Enter the number to search: ");
        int key = input.nextInt();

        int comparisons = 0;
        int position = -1; // -1 means not found

        // Linear search
        for (int i = 0; i < numbers.length; i++) {
            comparisons++;
            if (numbers[i] == key) {
                position = i; // store index of first occurrence
                break;        // stop after finding
            }
        }

        // Display results
        if (position != -1) {
            System.out.println("Element found at index position: " + position);
        } else {
            System.out.println("Element not found");
        }
        System.out.println("Total comparisons made: " + comparisons);} }
