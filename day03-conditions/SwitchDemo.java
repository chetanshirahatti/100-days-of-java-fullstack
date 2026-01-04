public class SwitchDemo {

    public static void main(String[] args) {

        int day = 3;

        /*
         Switch statement is used when we have
         multiple fixed options for a single variable.
         It is cleaner than writing many else-if conditions.
        */

        switch (day) {

            // If day value is 1
            case 1:
                System.out.println("Monday");
                break; // stops execution here

            // If day value is 2
            case 2:
                System.out.println("Tuesday");
                break;

            // If day value is 3
            case 3:
                System.out.println("Wednesday");
                break;

            // If day value does not match any case
            default:
                System.out.println("Invalid day");
        }
    }
}
    /*
         In this example, we use a switch statement to
         print the name of the day based on the value of 'day'.
         Each case corresponds to a specific day number.
        */