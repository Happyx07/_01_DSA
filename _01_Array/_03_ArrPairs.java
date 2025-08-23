package _01_Array;

public class _03_ArrPairs {
  // This Java program demonstrates how to find pairs of elements in an array that sum up to a specific target value.
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    int targetSum = 50;

    System.out.println("Pairs with sum " + targetSum + ":");
    findPairs(numbers, targetSum);
  }

  // Method to find pairs in the array that sum up to the target value
  public static void findPairs(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println("(" + arr[i] + ", " + arr[j] + ")");
        }
      }
    }
  }
}
