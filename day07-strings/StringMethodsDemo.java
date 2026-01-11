

public class StringMethodsDemo {

    public static void main(String[] args) {

        String message = "Java Full Stack";
        String message1 = "Is Great to learn";

        // Length of the string
        System.out.println("Length: " + message.length());

        // Concatenate two strings
        System.out.println("Concatenated: " + message.concat(" " + message1));

        // Convert to uppercase
        System.out.println("Uppercase: " + message.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + message.toLowerCase());

        // Check if string contains a word
        System.out.println("Contains 'Java': " + message.contains("Java"));

        // Get part of string
        System.out.println("Substring: " + message.substring(5));

        // Replace word
        System.out.println("Replace: " + message.replace("Java", "Spring"));
    }
}
