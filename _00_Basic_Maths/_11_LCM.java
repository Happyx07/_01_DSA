import java.util.*;

public class _11_LCM {
   

   // Following are the different Approaches for finding LCM of two numbers:
   // 1. Using the GCD (Least Common Multiple (LCM) can be calculated using the formula: LCM(a, b) = (a * b) / GCD(a, b))
   // Time Complexity: O(log(min(a, b)))
      public static int lcm(int a, int b) {
       return (a * b) / gcd(a, b);
      }
      private static int gcd(int a, int b) {
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
      }
      


   // 2. Using the Subtraction-based approach
   // Time Complexity: O(max(a, b));
      public static int lcmSubtraction(int a, int b) {
          int max = Math.max(a, b);
          while (true) {
              if (max % a == 0 && max % b == 0) {
                  return max;
              }
              max++;
          }
      }

   // 3. Using the Prime Factorization approach
    // Time Complexity: O(n log log n) for finding primes and O(k) for factorization, where k is the number of distinct prime factors
   public static int lcmPrimeFactorization(int a, int b) {
       Map<Integer, Integer> primeFactorsA = primeFactorization(a);
       Map<Integer, Integer> primeFactorsB = primeFactorization(b);
       Set<Integer> allPrimes = new HashSet<>(primeFactorsA.keySet());
       allPrimes.addAll(primeFactorsB.keySet());
       int lcm = 1;
       for (int prime : allPrimes) {
           int maxPower = Math.max(primeFactorsA.getOrDefault(prime, 0), primeFactorsB.getOrDefault(prime, 0));
           lcm *= Math.pow(prime, maxPower);
       }
       return lcm;
   }

   private static Map<Integer, Integer> primeFactorization(int n) {
       Map<Integer, Integer> factors = new HashMap<>();
       for (int i = 2; i <= Math.sqrt(n); i++) {
           while (n % i == 0) {
               factors.put(i, factors.getOrDefault(i, 0) + 1);
               n /= i;
           }
       }
       if (n > 1) {
           factors.put(n, factors.getOrDefault(n, 0) + 1);
       }
       return factors;
   }




   // Driver code
      public static void main(String[] args) {
          int a = 12;
          int b = 18;
          System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
          System.out.println("LCM of " + a + " and " + b + " using subtraction is " + lcmSubtraction(a, b));
          System.out.println("LCM of " + a + " and " + b + " using prime factorization is " + lcmPrimeFactorization(a, b));
      }


      // Comparision of the approaches:
      // 1. Using GCD: Efficient for large numbers, O(log(min(a, b))) time complexity.
      // 2. Using Subtraction: Simple but inefficient for large numbers, O(max(a, b)) time complexity.
      // 3. Using Prime Factorization: More complex, O(n log log n) for finding primes and O(k) for factorization, where k is the number of distinct prime factors.

}
