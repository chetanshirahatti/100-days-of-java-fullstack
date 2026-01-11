// string pool is a special memory area inside heap where string literals are stored to save memory and improve performance.

public class StringMemoryDemo {

    public static void main(String[] args) {

        /*
         * String Pool is a special memory area inside Heap.
         * Java stores string literals in String Pool to save memory.
         */

        String s1 = "Java";
        String s2 = "Java";

        // Both s1 and s2 point to the same memory in String Pool
        System.out.println(s1 == s2); // true

        // Creating string using new keyword
        String s3 = new String("Java");

        // s3 creates a new object in Heap memory
        System.out.println(s1 == s3); // false

        // But content is same
        System.out.println(s1.equals(s3)); // true
    }
}
