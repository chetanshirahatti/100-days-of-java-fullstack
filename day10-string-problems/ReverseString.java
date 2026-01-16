


public class ReverseString {

    public static void main(String[] args) {

        String text = "Java";

        /*
         We start printing characters
         from the last index to the first index
        */

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
// ReverseString is a simple Java program that demonstrates how to reverse a string by iterating through its characters in reverse order.