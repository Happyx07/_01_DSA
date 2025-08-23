

public class _01_print_without_Loops {

  public static void printNumbers(int n) {

    // Base case
    if (n > 0) {
      printNumbers(n - 1);
      System.out.print(n+" ");
    }

  }
  //Driver code
  public static void main(String[] args) {
    printNumbers(10);
  }

  // Output: 1 2 3 4 5 6 7 8 9 10
}