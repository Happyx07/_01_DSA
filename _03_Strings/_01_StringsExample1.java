package _03_Strings;
public class _01_StringsExample1 {
  public static void main(String[] args) {
    String str1 = "Hello, World!";
    String str2 = new String("Hello, World!");
    String str3 = "Hello, " + "World!";
    String str4 = str1;

    // Reference equality (==) vs Value equality (.equals())
    System.out.println("Reference Equality:");
    System.out.println("str1 == str2: " + (str1 == str2)); // false, different objects
    System.out.println("str1 == str3: " + (str1 == str3)); // true, same interned string
    System.out.println("str1 == str4: " + (str1 == str4)); // true, same reference

    System.out.println("\nValue Equality:");
    System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, same content
    System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, same content
    System.out.println("str1.equals(str4): " + str1.equals(str4)); // true, same content

    // Common String methods
    System.out.println("\nCommon String Methods:");
    String s = " Hello, World! 123 ";
    System.out.println("Original: '" + s + "'");
  }
   
}
