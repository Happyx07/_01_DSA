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
