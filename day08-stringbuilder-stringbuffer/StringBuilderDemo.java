// String Builder Demo class demonstrates the use of StringBuilder for mutable string operations in Java.

public class StringBuilderDemo {

    public static void main(String[] args) {

        /*
         StringBuilder is mutable.
         It changes the same object instead of creating new ones.
         Faster than String.
        */

        StringBuilder sb = new StringBuilder("Java");

        for (int i = 1; i <= 5; i++) {
            sb.append(i);  // modifies same object
        }

        System.out.println(sb.toString());
    }
}
