
// The StringComparisonDemo class demonstrates the difference between '==' and 'equals()' for string comparison in Java.

public class StringComparisonDemo {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        /*
         == compares memory location
         equals() compares actual text value
        */

        System.out.println(s1 == s2);        // true (same memory)
        System.out.println(s1 == s3);        // false (different memory)

        System.out.println(s1.equals(s3));   // true (same content)
    }
}
