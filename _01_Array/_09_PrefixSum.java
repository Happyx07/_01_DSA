package _01_Array;
public class _09_PrefixSum {
  // Prefix sum is a technique to calculate the cumulative sum of elements in an array.
  // In Simple terms, the prefix sum at index i is the sum of all elements from the start of the array up to index i.
  // This can be useful for quickly calculating the sum of any subarray.
  // This Java program demonstrates how to calculate the prefix sum of an array.
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println("Prefix sums of the given array:");
    int[] prefixSums = calculatePrefixSum(numbers);
    for (int i = 0; i < prefixSums.length; i++) {
      System.out.println("Prefix sum up to index " + i + ": " + prefixSums[i]);
    }

  }
  // Method to calculate the prefix sum of the given array
  public static int[] calculatePrefixSum(int[] arr) {
    int n = arr.length;
    int[] prefixSum = new int[n + 1]; // +1 to handle the sum up to index 0

    // Calculate prefix sums
    for (int i = 0; i < n; i++) {
      prefixSum[i + 1] = prefixSum[i] + arr[i];
    }

    return prefixSum;
  }
}
