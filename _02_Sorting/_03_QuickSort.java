package _02_Sorting;

public class _03_QuickSort {
    // Quick Sort Algorithm in Java
    // Quick Sort is an efficient sorting algorithm that uses a divide-and-conquer approach to sort elements. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
    // This Java program demonstrates the Quick Sort algorithm to sort an array of integers.

    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array:");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    // Method to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Method to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
