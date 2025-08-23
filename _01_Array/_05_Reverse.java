package _01_Array;
public class _05_Reverse {
  // This Java program demonstrates how to reverse an array.
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println("Original array:");
    printArray(numbers);

    reverseArray(numbers);

    System.out.println("Reversed array:");
    printArray(numbers);
  }

  // Method to reverse the given array
  public static void reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      // Swap elements at start and end
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      // Move towards the middle
      start++;
      end--;
    }
  }

  // Method to print the elements of the array
  public static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
