package _02_Sorting;

public class _02_InsertionSort {
    // Insertion Sort Algorithm in Java
    // Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
    // This Java program demonstrates the Insertion Sort algorithm to sort an array of integers.
    
    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        System.out.println("Original array:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
