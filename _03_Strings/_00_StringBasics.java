package _03_Strings;

public class _00_StringBasics {
  //Strings in java 

  // 
  /*
   Quick Summary of Strings in Java
   - String is an immutable sequence of char (UTF-16 code units). that means that once created, the content cannot be changed.
       -------------------------------------------------------------------
   - String literals are interned in the string pool; new String(...) creates a new object.
   ex. String s1 = "hello"; uses string pool(every occurrence refers to the same object)
       String s2 = new String("hello"); creates a new object every time 
       --------------------------------------------------------------------
   - Being immutable makes String thread-safe; use StringBuilder / StringBuffer for mutable sequences.
   - Thread-safe means no unexpected behavior when accessed from multiple threads.
       --------------------------------------------------------------------
   - Strings can be compared using == (reference equality) or .equals() (value equality).
   - Common uses: storage of text, parsing, formatting, and regex operations.
   - Many convenience methods for querying, slicing, transforming, and matching text.

   Frequently used important methods (examples):

   // length(): number of char code units
   // Example: int len = s.length();
   //
   // charAt(int index): char at position (0-based)
   // Example: char c = s.charAt(0);
   //
   // substring(beginIndex) / substring(beginIndex, endIndex)
   // Example: String sub = s.substring(1, 4);
   //
   // equals(Object) / equalsIgnoreCase(String)
   // Example: boolean same = s.equals("hello");
   // Example: boolean sameIgnoreCase = s.equalsIgnoreCase("Hello");
   //
   // compareTo(String) / compareToIgnoreCase(String)
   // Example: int cmp = s.compareTo("abc");
   //
   // concat(String) and '+' operator
   // Example: String t = s.concat(" world");
   // Example: String t2 = s + " world";
   //
   // contains(CharSequence)
   // Example: boolean has = s.contains("sub");
   //
   // startsWith(String) / endsWith(String)
   // Example: boolean starts = s.startsWith("pre");
   //
   // indexOf(int ch) / indexOf(String str, fromIndex) / lastIndexOf(...)
   // Example: int i = s.indexOf('a');
   // Example: int j = s.indexOf("foo", 5);
   //
   // replace(char oldChar, char newChar)
   // Example: String r = s.replace('a', 'b');
   //
   // replaceAll(String regex, String replacement)  (regex-based)
   // Example: String r2 = s.replaceAll("\\d+", "NUM");
   //
   // replaceFirst(String regex, String replacement)
   // Example: String r3 = s.replaceFirst("a", "A");
   //
   // split(String regex) / split(String regex, int limit)
   // Example: String[] parts = s.split(",\\s*");
   //
   // toLowerCase() / toUpperCase()
   // Example: String lower = s.toLowerCase();
   //
   // trim()  (removes ASCII whitespace) and strip()/stripLeading()/stripTrailing() (Unicode aware, Java 11+)
   // Example: String t = s.trim();
   //
   // isEmpty() / isBlank() (Java 11+)
   // Example: boolean empty = s.isEmpty();
   // Example: boolean blank = s.isBlank();
   //
   // valueOf(...) static factory for primitives/objects
   // Example: String fromInt = String.valueOf(123);
   //
   // format(String format, Object... args) (like printf)
   // Example: String msg = String.format("Hi %s, %d", name, n);
   //
   // join(CharSequence delimiter, CharSequence... elements)
   // Example: String csv = String.join(", ", "a", "b", "c");
   //
   // intern(): add to / return canonical representation from string pool
   // Example: String canonical = s.intern();
   //
   // toCharArray(): char[]
   // Example: char[] arr = s.toCharArray();
   //
   // getBytes(Charset) / getBytes(): platform bytes
   // Example: byte[] utf8 = s.getBytes(java.nio.charset.StandardCharsets.UTF_8);
   //
   // codePointAt(int index) / codePoints() for Unicode code points
   // Example: int cp = s.codePointAt(0);
   // Example: s.codePoints().forEach(System.out::println);
   //
   // regionMatches(...) for region comparison (optionally case-insensitive)
   // Example: boolean match = s.regionMatches(0, "prefix", 0, 3);
   //
   // matches(String regex) to test full-string regex match
   // Example: boolean ok = s.matches("\\d{4}-\\d{2}-\\d{2}");
   //
   // lines() (Java 11+): returns Stream<String> of lines
   // Example: s.lines().forEach(System.out::println);
   //
   // repeat(int count) (Java 11+): repeat string n times
   // Example: String stars = "*".repeat(10);
   //
   // subSequence(int start, int end) returns CharSequence (same as substring)
   // Example: CharSequence seq = s.subSequence(1, 4);

   // Notes / tips:
   // - For heavy concatenation in loops, prefer StringBuilder (or StringBuffer if synchronized).
   // - Beware of index-related exceptions: StringIndexOutOfBoundsException.
   // - Many methods create new String instances because of immutability.
   */
  public static void main(String[] args) {
    String s = " Hello, World! 123 ";
    System.out.println("Original: '" + s + "'");
    System.out.println("Length: " + s.length());
    System.out.println("Char at 1: " + s.charAt(1));
    System.out.println("Substring (1,5): '" + s.substring(1, 5) + "'");
    System.out.println("Equals ' Hello, World! 123 ': " + s.equals(" Hello, World! 123 "));
    System.out.println("EqualsIgnoreCase ' hello, world! 123 ': " + s.equalsIgnoreCase(" hello, world! 123 "));
    System.out.println("CompareTo ' Hello, World! 123 ': " + s.compareTo(" Hello, World! 123 "));
    System.out.println("Concat '!!!': '" + s.concat("!!!") + "'");// creates a new String object
    System.out.println("IsEmpty: " + s.isEmpty());// checks if the string is empty
    System.out.println("IsBlank: " + s.isBlank());// checks if the string is blank
    System.out.println("Contains 'World': " + s.contains("World"));
    System.out.println("StartsWith ' He': " + s.startsWith(" He"));
    System.out.println("EndsWith '123 ': " + s.endsWith("123 "));
    System.out.println("IndexOf 'o': " + s.indexOf('o'));
    System.out.println("LastIndexOf 'o': " + s.lastIndexOf('o'));
    System.out.println("Replace 'l' with 'x': '" + s.replace('l', 'x') + "'");
    System.out.println("ReplaceAll digits with '#': '" + s.replaceAll("\\d", "#") + "'");// replaces all digits with '#'
    System.out.println("ReplaceFirst 'l' with 'X': '" + s.replaceFirst("l", "X") + "'");
    String[] parts = s.split(",\\s*");// splits the string by ', ' (comma and optional space)
    System.out.println("Split by ', ': " + java.util.Arrays.toString(parts));
    System.out.println("ToLowerCase: '" + s.toLowerCase() + "'");
    System.out.println("ToUpperCase: '" + s.toUpperCase() + "'");
    System.out.println("Trim: '" + s.trim() + "'");// removes leading/trailing whitespace
    System.out.println("ValueOf 456: '" + String.valueOf(456) + "'");
    System.out.println(String.format("Format: Hi %s, %d!", "Alice", 30));// formats the string with placeholders

  }

}
