package _01_Array;


// This Java program demonstrates how to declare, initialize, and print an array of integers.
// It creates an array of size 5, assigns values to each element, and then prints those values.
// different ways to initialize arrays are also discussed in the comments.


public class _01_initArray {
    public static void main(String[] args) {

        //Declaration only of an array of integers
        // int[] numbers; // This declares an array variable but does not allocate memory
        
        // Declare and initialize an array of integers
        int[] numbers = new int[5]; // Array of size 5

        // Assign values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}