public class _02_SumOfnNumbers {
  public static int sum(int n){
    return (n*(n+1))/2;
  }

  public static void main(String[] args) {

    // test cases 
    int n=10;
    System.out.println("Sum of first "+n+" numbers is: "+sum(n));
  }
}
