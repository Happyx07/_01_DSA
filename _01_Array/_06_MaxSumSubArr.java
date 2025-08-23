package _01_Array;
public class _06_MaxSumSubArr {
  // This Java program demonstrates how to find the maximum sum of a contiguous subarray using Kadane's algorithm.
  public static void main(String[] args) {
    int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    int maxSum = findMaxSumSubArray(numbers);
    System.out.println("Maximum sum of contiguous subarray: " + maxSum);
  }

  // Method to find the maximum sum of a contiguous subarray
  public static int findMaxSumSubArray(int[] arr) {
    int maxSoFar = arr[0];
    int maxEndingHere = arr[0];

    for (int i = 1; i < arr.length; i++) {
      maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
      maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
  }
}
