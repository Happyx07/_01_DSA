public class _04_CountDigits {
  public static int countDigits(int n) {
    // /*  
    // APPROACH 1: Use logarithms
    // ----------------------------------------------------------------------------------
    if (n == 0) {
      return 1; // Special case for 0 // Handle n=0 separately as log10(0) is undefined
    } 
    return (int) Math.log10(Math.abs(n)) + 1;


    // TIME COMPLEXITY: O(1)
    // SPACE COMPLEXITY: O(1)




    // APPROACH 2: Convert the number to a string and return the length of the string.
    // ----------------------------------------------------------------------------------
    // return String.valueOf(Math.abs(n)).length();

    // TIME COMPLEXITY: O(d) where d is the number of digits in n (due to string conversion)
    // SPACE COMPLEXITY: O(d) for storing the string representation of the number
    



    




    // APPROACH 3: Use a while loop to count digits or Recursion
    // ---------------------------------------------------------------------------------- 
    // if (n == 0) {
    //   return 1; // Special case for 0
    // }
    // int count = 0;
    // n = Math.abs(n); // Handle negative numbers
    // while (n > 0) {
    //   n /= 10;
    //   count++;
    // } 
    // return count;

    // TIME COMPLEXITY: O(d) where d is the number of digits in n
    // SPACE COMPLEXITY: O(1)





    // APPROACH 4: Use an array to store digits and return the size of the array.
    // ----------------------------------------------------------------------------------
    // if (n == 0) {
    //   return 1; // Special case for 0
    // }
    // n = Math.abs(n); // Handle negative numbers
    // int[] digits = new int[10]; // Assuming a maximum of 10 digits  
    // int index = 0;
    // while (n > 0) {
    //   digits[index++] = n % 10;
    //   n /= 10;
    // } 
    // return index; // Number of digits is the index  

    // TIME COMPLEXITY: O(d) where d is the number of digits in n
    // SPACE COMPLEXITY: O(d) for storing the digits in the array



    // APPROACH 5: Use a do-while loop to ensure at least one iteration for n=0.
    // ----------------------------------------------------------------------------------
    // int count = 0;
    // n = Math.abs(n); // Handle negative numbers
    // do {
    //   n /= 10;
    //   count++;
    // } while (n > 0);
    // return count;
    // TIME COMPLEXITY: O(d) where d is the number of digits in n
    // SPACE COMPLEXITY: O(1)
    
    
    
    

    
  }

  // Different approaches to count digits:
  /*
   * 1. Convert the number to a string and return the length of the string.
   *    return String.valueOf(Math.abs(n)).length();
   * 2. Use logarithms: return (int) Math.log10(Math.abs(n)) + 1;
   *    (Handle n=0 separately as log10(0) is undefined)
   * 3. Use recursion to count digits
   *    
   * 4. Use an array to store digits and return the size of the array.
   *    
   * 5. Use a do-while loop to ensure at least one iteration for n=0.
   */
  

  public static void main(String[] args) {
    // test cases
    int[] testNumbers = {0, 5, 123, -4567, 89012};
    for (int num : testNumbers) {
      System.out.println("Number of digits in " + num + " is: " + countDigits(num));
    }
  }
}
