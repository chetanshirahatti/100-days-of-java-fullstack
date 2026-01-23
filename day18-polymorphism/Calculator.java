
// Polymorphism example: Method Overloading in Java. Same method name with different parameters.

public class Calculator {

    // Add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}
