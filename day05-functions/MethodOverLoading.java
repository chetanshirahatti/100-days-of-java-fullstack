
/* Method Overloading (Compile Time Polymorphism): Same method name, but different input (parameters)
The method does the same type of work, but with different data.*/



public class MethodOverLoading {

    // Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two decimal numbers
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three integers: " + add(5, 10, 15));
        System.out.println("Sum of two decimals: " + add(5.5, 10.3));
    }
    
}

// Java decides which method to call at compile time, based on parameters.