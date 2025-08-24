public class _02_SumOfnNumbers {
  public static int sum(int n){
    return (n*(n+1))/2;
  }

  // DIFFERENT APPROACHES TO SOLVE THE PROBLEM
  /*
  * APPROACH 1: Use the formula n(n+1)/2 to calculate the sum of first n natural numbers.
  * ----------------------------------------------------------------------------------
  * TIME COMPLEXITY: O(1)
  * SPACE COMPLEXITY: O(1)
  
  * APPROACH 2: Use a loop to iterate from 1 to n and keep adding the numbers to a sum variable.
  * ----------------------------------------------------------------------------------
  * int sum = 0;
  * for (int i = 1; i <= n; i++) {
  *   sum += i;
  * }
  * return sum; 

  * TIME COMPLEXITY: O(n)
  * SPACE COMPLEXITY: O(1)

  * APPROACH 3: Use recursion to calculate the sum of first n natural numbers.
  * ----------------------------------------------------------------------------------  
  * if (n == 1) {
  *   return 1; // Base case  
  * }
  * return n + sum(n - 1); // Recursive case
  * TIME COMPLEXITY: O(n)
  * SPACE COMPLEXITY: O(n) // Due to recursion stack
  * ----------------------------------------------------------------------------------

  * APPROACH 4: Use the arithmetic series formula to calculate the sum of first n natural numbers.
  * ----------------------------------------------------------------------------------  
  * return (n / 2) * (1 + n); // Using arithmetic series formula
  * TIME COMPLEXITY: O(1) 
  * SPACE COMPLEXITY: O(1)


  */



  public static void main(String[] args) {

    // test cases 
    int n=10;
    System.out.println("Sum of first "+n+" numbers is: "+sum(n));
  }
}
