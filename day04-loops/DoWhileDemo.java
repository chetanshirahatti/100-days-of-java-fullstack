public class DoWhileDemo {

    public static void main(String[] args) {

        /*
         Do-while loop is similar to while loop,
         but it runs AT LEAST ONCE
         even if the condition is false.
        */

        int value = 6;

        do {
            System.out.println("Value is: " + value);

            value++;

        } while (value <= 5);
    }
}
