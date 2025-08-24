public class _03_FactorialOfnByRecursion {
  public static int factorial(int n) {
    // Base Case
    if (n == 0 || n == 1) {
      return 1;
    }
    // Recursive Case
    return n * factorial(n -1);
    
  }
  public static void main(String[] args) {
    // test cases
    int n = 5;
    System.out.println("Factorial of " + n + " is: " + factorial(n));
  }
  
}
