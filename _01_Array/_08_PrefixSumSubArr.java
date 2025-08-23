package _01_Array;
public class _08_PrefixSumSubArr {
  // This Java program demonstrates how to find the sum of all subarrays using prefix sums.
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4};

    System.out.println("Sum of all subarrays:");
    findSubarraySums(numbers);
  }

  // Method to find and print the sum of all subarrays
  public static void findSubarraySums(int[] arr) {
    int n = arr.length;
    int[] prefixSum = new int[n + 1];

    // Calculate prefix sums
    //
    for (int i = 0; i < n; i++) {
      prefixSum[i + 1] = prefixSum[i] + arr[i];
    }

    // Calculate and print the sum of each subarray
    for (int start = 0; start < n; start++) {
      for (int end = start + 1; end <= n; end++) {
        int sum = prefixSum[end] - prefixSum[start];
        System.out.println("Subarray from index " + start + " to " + (end - 1) + " has sum: " + sum);
      }
    }
  }
}
