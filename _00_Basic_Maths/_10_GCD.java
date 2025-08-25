import java.math.BigInteger;

public class _10_GCD {
  // Function to return gcd of a and b
  public static int gcd(int a, int b) {
    if (b == 0) {
      return Math.abs(a); // GCD should be non-negative
    }
    return gcd(b, a % b); // Recursive call // Euclid's algorithm
  }

  public static int gcdUsingBuiltIn(int a, int b) {
    return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
  }

  public static int gcdUsingLoop(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    int gcd = 1;
    for (int i = 1; i <= Math.min(a, b); i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }

  public static int gcdUsingSubtraction(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    if (a == 0) return b;
    if (b == 0) return a;
    if (a == b) return a;
    if (a > b) return gcdUsingSubtraction(a - b, b);
    return gcdUsingSubtraction(a, b - a);
  }

  // Different approaches to find GCD
  /*[Approach - 1] Using Loop - O(min(a, b)) Time and O(1) Space
    [Approach - 2] Euclidean Algorithm using Subtraction - O(min(a,b)) Time and O(min(a,b)) Space
    [Approach - 3] Modified Euclidean Algorithm using Subtraction by Checking Divisibility - O(min(a, b)) Time and O(min(a, b)) Space
    [Approach - 4] Optimized Euclidean Algorithm by Checking Remainder with Time Complexity O(log(min(a, b))) and Space Complexity O(1)
    [Approach - 5] Using Built-in Function - O(log(min(a, b))) Time and O(1) Space */

  public static void main(String[] args) {
    // test cases
    int num1 = 56, num2 = 98;
    int num3 = 101, num4 = 10;
    int num5 = -48, num6 = 18;

    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2)); // Output: 14
    System.out.println("GCD of " + num3 + " and " + num4 + " is: " + gcd(num3, num4)); // Output: 1
    System.out.println("GCD of " + num5 + " and " + num6 + " is: " + gcd(num5, num6)); // Output: 6
  }
  
}
