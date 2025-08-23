package _01_Array;

public class _02_ArrMethods {
  // This Java program demonstrates various methods to manipulate arrays, including finding the maximum and minimum values, calculating the sum and average, and searching for an element.
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};

    // Find the maximum value in the array
    int max = findMax(numbers);
    System.out.println("Maximum value: " + max);

    // Find the minimum value in the array
    int min = findMin(numbers);
    System.out.println("Minimum value: " + min);

    // Calculate the sum of all elements in the array
    int sum = calculateSum(numbers);
    System.out.println("Sum of elements: " + sum);

    // Calculate the average of the elements in the array
    double average = calculateAverage(numbers);
    System.out.println("Average of elements: " + average);

    // Search for an element in the array
    int searchElement = 30;
    boolean found = searchElement(numbers, searchElement);
    System.out.println("Element " + searchElement + " found: " + found);
  }

  
  // Method to find the maximum value in an array
  public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  // Method to find the minimum value in an array
  public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  // Method to calculate the sum of all elements in an array
  public static int calculateSum(int[] arr) {
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }
    return sum;
  }

  // Method to calculate the average of elements in an array
  public static double calculateAverage(int[] arr) {
    return (double) calculateSum(arr) / arr.length;
  }

  // Method to search for an element in an array
  public static boolean searchElement(int[] arr, int element) {
    for (int num : arr) {
      if (num == element) {
        return true;
      }
    }
    return false;
  }
}