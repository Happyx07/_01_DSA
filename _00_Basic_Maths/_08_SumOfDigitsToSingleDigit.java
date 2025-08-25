public class _08_SumOfDigitsToSingleDigit {
  public static int sumOfDigitsToSingleDigit(int n) {
    n = Math.abs(n); // Handle negative numbers
    while (n >= 10) { // Continue until n is a single digit
      int sum = 0;
      while (n != 0) {
        int digit = n % 10; // Extract the last digit
        sum += digit; // Add it to the sum
        n /= 10; // Remove the last digit from n
      }
      n = sum; // Update n to the new sum
    }
    return n; // Return the single-digit result
  }

  // Test the function
  // Different approaches:
  // 1. Using nested while loops to repeatedly sum the digits until a single digit is obtained.
  // TIME COMPLEXITY: O(d^2) in the worst case where d is the number of digits in n, SPACE COMPLEXITY: O(1)
  // 2. Using digital root formula: 1 + (n - 1) % 9 for n > 0, and 0 for n = 0.
  // TIME COMPLEXITY: O(1), SPACE COMPLEXITY: O(1)

  public static void main(String[] args) {
    // test cases
    int number1 = 12345; // 1 + 2 + 3 + 4 + 5 = 15 -> 1 + 5 = 6
    int number2 = -6789; // 6 + 7 + 8 + 9 = 30 -> 3 + 0 = 3
    int number3 = 0; // Sum of digits is 0

    System.out.println("Single digit sum of " + number1 + " is: " + sumOfDigitsToSingleDigit(number1)); // Output: 6
    System.out.println("Single digit sum of " + number2 + " is: " + sumOfDigitsToSingleDigit(number2)); // Output: 3
    System.out.println("Single digit sum of " + number3 + " is: " + sumOfDigitsToSingleDigit(number3)); // Output: 0
  }
}
