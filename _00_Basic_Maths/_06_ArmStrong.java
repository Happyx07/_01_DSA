public class _06_ArmStrong {
  
  public static boolean isArmstrong(int n) {
      int originalNumber = n;
      int sum = 0;
      int digits = String.valueOf(Math.abs(n)).length(); // Count digits using string conversion

      while (n != 0) {
          int digit = n % 10; // Extract the last digit
          sum += Math.pow(digit, digits); // Raise it to the power of number of digits and add to sum
          n /= 10; // Remove the last digit from n
      }
      return sum == originalNumber; // Check if the sum equals the original number
  }

  public static void main(String[] args) {
      // test cases
      int number1 = 153; // 1^3 + 5^3 + 3^3 = 153
      int number2 = 9474; // 9^4 + 4^4 + 7^4 + 4^4 = 9474
      int number3 = 123; // Not an Armstrong number

      System.out.println(number1 + " is Armstrong: " + isArmstrong(number1)); // Output: true
      System.out.println(number2 + " is Armstrong: " + isArmstrong(number2)); // Output: true
      System.out.println(number3 + " is Armstrong: " + isArmstrong(number3)); // Output: false
  }
}
