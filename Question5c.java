
//In this program, I created an array of 6 integers entered by the user. The program first displayed the original array. It then performed a right shift by one position, moving the last element to the front. Next, it performed a left rotation by two positions, moving the first two elements to the end. Both the shifted and rotated arrays were displayed.
//The key concepts applied here were array manipulation, indexing, and rotation/shift operations. This program demonstrates how arrays can be rearranged to achieve different data structures and patterns.


import java.util.Scanner;

public class Question5c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[6];

        // Accept 6 integers from user
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Display original array
        System.out.print("\nOriginal array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Shift right by 1 (last element moves to front)
        int[] shifted = new int[arr.length];
        shifted[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            shifted[i] = arr[i - 1];
        }

        System.out.print("\nRight shift by 1: ");
        for (int i = 0; i < shifted.length; i++) {
            System.out.print(shifted[i] + " ");
        }

        // Rotate left by 2 (first two elements move to end)
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + 2) % arr.length];
        }

        System.out.print("\nLeft rotate by 2: ");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}
