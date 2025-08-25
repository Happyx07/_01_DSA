public class _09_PalindromeNumber {
  public static boolean isPalindrome(int n) {
    n = Math.abs(n); // Handle negative numbers
    int original = n;
    int reversed = 0;
    while (n != 0) {
      int digit = n % 10;
      reversed = reversed * 10 + digit;
      n /= 10;
    }
    return original == reversed;
  }

  // Test the function
  // Different approaches:
  // 1. Using a while loop to reverse the number and compare with the original.
  // TIME COMPLEXITY: O(d) where d is the number of digits in n, SPACE COMPLEXITY: O(1)
  // 2. Using String manipulation (convert to string, reverse, and compare).
  // TIME COMPLEXITY: O(d) where d is the number of digits in n, SPACE COMPLEXITY: O(d)

  public static void main(String[] args) {
    // test cases
    int number1 = 12321; // Palindrome
    int number2 = -45654; // Palindrome
    int number3 = 12345; // Not a palindrome

    System.out.println(number1 + " is palindrome: " + isPalindrome(number1)); // Output: true
    System.out.println(number2 + " is palindrome: " + isPalindrome(number2)); // Output: true
    System.out.println(number3 + " is palindrome: " + isPalindrome(number3)); // Output: false
  }
}
