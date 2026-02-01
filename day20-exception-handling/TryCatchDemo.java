// Exception means - Unwanted problem that happens while the programm is running.

public class TryCatchDemo {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            // Risky code
            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {

            // This runs when exception occurs
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues safely");
    }
}
