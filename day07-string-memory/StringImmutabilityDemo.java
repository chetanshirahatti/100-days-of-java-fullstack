// String Immutability Demo: Demonstrates that strings in Java cannot be changed once created.

public class StringImmutabilityDemo {

    public static void main(String[] args) {

        /*
         Immutability means: once a string is created,
         it cannot be changed.
        */

        String text = "Hello";

        // This does NOT change original string
        text.concat(" World");

        System.out.println(text); // Output: Hello

        // We must assign it to a new variable
        text = text.concat(" World");

        System.out.println(text); // Output: Hello World
    }
}
