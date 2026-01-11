public class ArrayBasicsDemo {

    public static void main(String[] args) {

        /*
         Array is used to store multiple values
         of the SAME data type in one variable.
        */

        // Without array (not good)
        int mark1 = 60;
        int mark2 = 70;
        int mark3 = 80;

        // With array (best way)
        int[] marks = {60, 70, 80};

        System.out.println("First mark: " + marks[0]);
        System.out.println("Second mark: " + marks[1]);
        System.out.println("Third mark: " + marks[2]);
    }
}
