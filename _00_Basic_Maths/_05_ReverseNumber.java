// Program to reverse a number

// DIFFERENT APPROACHES:
// 1. Using a while loop to extract digits and build the reversed number.TIME COMPLEXITY: O(d) where d is the number of digits in n, SPACE COMPLEXITY: O(1)
// 2. Using String manipulation (convert to string, reverse, convert back). TIME COMPLEXITY: O(d) where d is the number of digits in n, SPACE COMPLEXITY: O(d)
// 3. Using recursion to reverse the number. TIME COMPLEXITY: O(d) where d is the number of digits in N , SPACE COMPLEXITY: O(d) due to recursion stack
// 4. Using mathematical operations to reverse the number without loops or strings (not practical but possible). TIME COMPLEXITY: O(d) where d is the number of digits in n, SPACE COMPLEXITY: O(1)
// 5. Using an array to store digits and then construct the reversed number. TIME COMPLEXITY: O(d) where d is the number of digits in n , SPACE COMPLEXITY: O(d)


public class _05_ReverseNumber {
  public static int reverseNumber(int n) {
    int reversed = 0;
    while (n != 0) {
      int digit = n % 10; // Extract the last digit
      reversed = reversed * 10 + digit; // Append it to the reversed number
      n /= 10; // Remove the last digit from n
    }
    return reversed;
  }

  

  public static void main(String[] args) {
    // test cases
    int number1 = 12345;
    int number2 = -6789;
    int number3 = 0;

    System.out.println("Reversed of " + number1 + " is: " + reverseNumber(number1)); // Output: 54321
    System.out.println("Reversed of " + number2 + " is: " + reverseNumber(number2)); // Output: -9876
    System.out.println("Reversed of " + number3 + " is: " + reverseNumber(number3)); // Output: 0
  }
}
