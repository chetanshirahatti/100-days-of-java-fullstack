public class MethodWithParameters {

    /*
     Parameters are values passed to a method.
     They help the method work with different data.
    */

    // Method that accepts two numbers
    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {

        // Passing values to the method
        addNumbers(10, 20);
        addNumbers(5, 7);
    }
}
