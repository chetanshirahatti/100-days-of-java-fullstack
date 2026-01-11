

public class WhyNotStringDemo {

    public static void main(String[] args) {

        /*
         String is immutable.
         Every time we modify a String,
         Java creates a NEW object.
        */

        String text = "Java";

        for (int i = 1; i <= 5; i++) {
            text = text + i;  // creates new object every time
        }

        System.out.println(text);
    }
}
