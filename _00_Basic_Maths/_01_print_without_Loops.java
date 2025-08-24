

public class _01_print_without_Loops {

  public static void printNumbers(int n) {

    // Base case
    if (n > 0) {
      printNumbers(n - 1);
      System.out.print(n+" ");
    }

  }

  // Different Approaches 
  /*
   * 1. Use recursion to print numbers from 1 to n.
   *    Base case: if n is 0, return.
   *    Recursive case: call the function with n-1, then print n.
   * 
   * 2. Use a loop (for or while) to iterate from 1 to n and print each number.
   * 3. Use Java Streams (Java 8 and above) to generate a range of numbers and print them.
   * 4. Use an array to store numbers from 1 to n and then print the array.
   * 5. Use StringBuilder to build a string of numbers from 1 to n and print it.
   * 6. Use a stack to push numbers from 1 to n and then pop and print them.
   * 7. Use a queue to enqueue numbers from 1 to n and then dequeue and print them.
   * 8. Use a mathematical formula to generate numbers from 1 to n and print them.
   * 9. Use a custom iterator to iterate from 1 to n and print each number.
   * 10. Use a functional programming approach with lambdas to print numbers from 1 to n.
   */

  //Driver code
  public static void main(String[] args) {
    printNumbers(10);
  }

  // Output: 1 2 3 4 5 6 7 8 9 10
}