public class WhileLoopDemo {

    public static void main(String[] args) {

        /*
         While loop is used when we do NOT know
         how many times the loop will run.
         It runs as long as the condition is true.
        */

        int number = 1;

        // Loop will run until number becomes greater than 5
        while (number <= 5) {

            System.out.println("Number: " + number);

            // Increase the value to avoid infinite loop
            number++;
        }
    }
}
