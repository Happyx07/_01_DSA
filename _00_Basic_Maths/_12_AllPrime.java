public class _12_AllPrime {
  // Different Approaches to find all primes up to n :
  // 1. Trial Division
  // 2. Sieve of Eratosthenes
  // 3. Segmented Sieve



  // 1. Trial Division
  // This is the simplest method to find all primes up to n.
  // It checks each number for primality by testing divisibility.
  // Time Complexity: O(n * sqrt(n))
  public static void printAllPrimesTrialDivision(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
  private static boolean isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) return false;
    }
    return true;
  }

  // 2. Sieve of Eratosthenes
  // This is a more efficient algorithm to find all primes up to n.
  // It works by iteratively marking the multiples of each prime starting from 2.
  // Time Complexity: O(n log(log(n)))
  public static void printAllPrimesSieve(int n) {
    boolean[] isPrime = new boolean[n + 1];
    for (int i = 2; i <= n; i++) {
      isPrime[i] = true;
    }
    for (int p = 2; p * p <= n; p++) {
      if (isPrime[p]) {
        for (int i = p * p; i <= n; i += p) {
          isPrime[i] = false;
        }
      }
    }
    for (int i = 2; i <= n; i++) {
      if (isPrime[i]) {
        System.out.print(i + " ");
      }
    }
  }

  // 3. Segmented Sieve
  // This is an extension of the Sieve of Eratosthenes that works for a range [low, high].
  // It first finds all primes up to sqrt(high) and then uses them to mark non-primes in the range.
  // Time Complexity: O(n log(log(n))) for the initial sieve + O((high - low + 1) * log(log(sqrt(high)))) for marking
  public static void printAllPrimesSegmented(int low, int high) {
    // Find all primes up to sqrt(high) using the Sieve of Eratosthenes
    int limit = (int) Math.sqrt(high) + 1;
    boolean[] isPrime = new boolean[limit + 1];
    for (int i = 2; i <= limit; i++) {
      isPrime[i] = true;
    }
    for (int p = 2; p * p <= limit; p++) {
      if (isPrime[p]) {
        for (int i = p * p; i <= limit; i += p) {
          isPrime[i] = false;
        }
      }
    }
    // Store all primes up to sqrt(high)
    List<Integer> primes = new ArrayList<>();
    for (int i = 2; i <= limit; i++) {
      if (isPrime[i]) {
        primes.add(i);
      }
    }
    // Create a boolean array for the range [low, high]
    boolean[] isPrimeRange = new boolean[high - low + 1];
    for (int i = 0; i < isPrimeRange.length; i++) {
      isPrimeRange[i] = true;
    }
    // Mark non-primes in the range using the found primes
    for (int p : primes) {
      // Find the minimum number in the [low, high] range that is a multiple of p
      int start = Math.max(p * p, (low + p - 1) / p * p);
      for (int i = start; i <= high; i += p) {
        isPrimeRange[i - low] = false;
      }
    }
    // Print all primes in the range
    for (int i = 0; i < isPrimeRange.length; i++) {
      if (isPrimeRange[i]) {
        System.out.print((i + low) + " ");
      }
    }
  }

}
