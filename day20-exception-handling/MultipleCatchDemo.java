

public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {
            int[] arr = new int[3];
            arr[5] = 10; // Error

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is wrong");

        } catch (Exception e) {
            System.out.println("Some error occurred");
        }
    }
}
