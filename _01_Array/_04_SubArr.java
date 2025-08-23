package _01_Array;
public class _04_SubArr {
  
  // This Java program demonstrates how to find all subarrays of a given array.
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4};

    System.out.println("Subarrays of the given array:");
    findSubarrays(numbers);
  }

  // Method to find and print all subarrays of the given array
  public static void findSubarrays(int[] arr) {
    int n = arr.length;
    for (int start = 0; start < n; start++) {
      for (int end = start; end < n; end++) {
        System.out.print("[");
        for (int k = start; k <= end; k++) {
          System.out.print(arr[k]);
          if (k < end) {
            System.out.print(", ");
          }
        }
        System.out.println("]");
      }
    }
  }
}
