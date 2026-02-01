


public class FinallyDemo {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");

        } catch (Exception e) {
            System.out.println("Exception handled");

        } finally {
            // Always executes
            System.out.println("Finally block executed");
        }
    }
}
