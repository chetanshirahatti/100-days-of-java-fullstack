public class MethodWithReturnType {

    /*
     Some methods return a value after doing work.
     Return type tells what kind of value the method will return.
    */

    // Method that returns an integer value
    static int multiply(int x, int y) {
        return x * y; // sends result back
    }

    public static void main(String[] args) {

        // Store returned value in a variable
        int result = multiply(4, 5);

        System.out.println("Multiplication result is: " + result);
    }
}
