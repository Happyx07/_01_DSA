package _03_Strings.VeryBasic;

public class _01_ReverseString {
  public static void main(String[] args){

    String s = "Harshit";
    System.out.println("Original String is :"+ s);
    System.out.println("Reversing a String by converting to Array");
    s.toCharArray();
    char[] rev = new char[s.length()];
    for(int  i= s.length()-1;i>=0;i--){
        rev[s.length()-i-1]= s.charAt(i);

    }
    System.out.println(rev);
  }
}
// Different Approaches to Reverse Strings in Java are as follows:
// 1. Using StringBuilder (or StringBuffer) reverse() method
// StringBuilder s = new StringBuilder("Harshit");
// s.reverse();
// System.out.println(s.toString());
//---------------------------------------------------------------------------
// 2. Using for loop
// String rev = "";
// for (int i = s.length() - 1; i >= 0; i--) {
//     rev += s.charAt(i);
// }
// System.out.println(rev);
// DRY RUN FOR ITERATIVE APPROACH :
//---------------------------------------------------------------------------
// 3. Using recursion
// public static String reverse(String s) {
//     if (s.length() == 0) {
//         return s;
//     }
//     return reverse(s.substring(1)) + s.charAt(0);
// }
// DRY RUN FOR RECURSIVE APPROACH :
// reverse("Harshit")
//   => reverse("arshit") + "H"
//   => reverse("rshit") + "a"
//   => reverse("shit") + "r"
//   => reverse("hit") + "s"
//   => reverse("it") + "h"
//   => reverse("t") + "i"
//   => reverse("") + "t"
//   => "" + "t"
//   => "t"
//   => "ti"
//   => "tir"
//   => "tirh"
//   => "tirhs"
//   => "tirhsa"
//   => "tirhsah"
