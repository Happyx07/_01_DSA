package _01_Array;
public class _07_MaxSumSubArrBrute {
  // This Java program demonstrates how to find the maximum sum of a contiguous subarray using a brute force approach.
  public static void main(String[] args) {
    int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    int maxSum = findMaxSumSubArray(numbers);
    System.out.println("Maximum sum of contiguous subarray: " + maxSum);
  }

  // Method to find the maximum sum of a contiguous subarray using brute force
  public static int findMaxSumSubArray(int[] arr) {
    int maxSum = Integer.MIN_VALUE;// Initialize to the smallest possible integer
    // Iterate through all possible subarrays

    for (int i = 0; i < arr.length; i++) {
      int currentSum = 0;
      for (int j = i; j < arr.length; j++) {
        currentSum += arr[j];
        maxSum = Math.max(maxSum, currentSum);
      }
    }

    return maxSum;
  }
}
