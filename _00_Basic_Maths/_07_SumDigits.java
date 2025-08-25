public class _07_SumDigits {
  public static int sumOfDigits(int n) {
    int sum = 0;
    n = Math.abs(n); // Handle negative numbers
    while (n != 0) {
      int digit = n % 10; // Extract the last digit
      sum += digit; // Add it to the sum
      n /= 10; // Remove the last digit from n
    }
    return sum;
    
  }

  // Test the function
  // different approaches:
  // 1. Using a while loop to extract digits and sum them. TIME COMPLEX
  // COMPLEXITY: O(d) where d is the number of digits in n, SPACE COMPLEXITY: O(1)
  // 2. Using String manipulation (convert to string, iterate over characters, convert back
  // to int and sum). TIME COMPLEXITY: O(d) where d is the number of digits in n, SPACE
  // COMPLEXITY: O(d)
  // 3. Using recursion to sum the digits. TIME COMPLEXITY: O(d) where d is the number of
  // digits in n , SPACE COMPLEXITY: O(d) due to recursion stack  
  // 4. Using an array to store digits and then sum them. TIME COMPLEXITY: O(d) where d
  // is the number of digits in n , SPACE COMPLEXITY: O(d)
  

  public static void main(String[] args) {
    // test cases
    int number1 = 12345; // 1 + 2 + 3 + 4 + 5 = 15
    int number2 = -6789; // 6 + 7 + 8 + 9 = 30
    int number3 = 0; // Sum of digits is 0

    System.out.println("Sum of digits of " + number1 + " is: " + sumOfDigits(number1)); // Output: 15
    System.out.println("Sum of digits of " + number2 + " is: " + sumOfDigits(number2)); // Output: 30
    System.out.println("Sum of digits of " + number3 + " is: " + sumOfDigits(number3)); // Output: 0
  }
}
