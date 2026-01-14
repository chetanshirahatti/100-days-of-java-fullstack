// Increment and Decrement Operators in Java : Are used to increase or decrease the value of a variable by 1.


public class IncrementOperator {

    int a = 1;
    int b = 1;

    public void incrementDemo() {
        System.out.println("Initial value of a: " + a); // Output: 1

        // Post-increment: value is used first, then incremented
        System.out.println("Post-increment a++: " + (a++)); // Output: 1
        System.out.println("Value of a after post-increment: " + a); // Output: 2

        // Pre-increment: value is incremented first, then used
        System.out.println("Pre-increment ++b: " + (++b)); // Output: 2
        System.out.println("Value of b after pre-increment: " + b); // Output: 2
    }

    public static void main(String[] args) {
        IncrementOperator demo = new IncrementOperator();
        demo.incrementDemo();
    }
    
}



