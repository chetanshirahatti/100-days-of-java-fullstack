public class IfElseDemo {

    public static void main(String[] args) {

        int marks = 72;

        /*
         Conditions are used to make decisions in a program.
         Based on a condition being true or false,
         Java decides which block of code should run.
        */

        // If the marks are 90 or more, student gets Grade A
        if (marks >= 90) {
            System.out.println("Grade A");
        }

        // If the first condition is false, Java checks this condition
        else if (marks >= 75) {
            System.out.println("Grade B");
        }

        // If both above conditions are false, this block will execute
        else if (marks >= 60) {
            System.out.println("Grade C");
        }

        // If none of the above conditions are true
        else {
            System.out.println("Fail");
        }
    }
}
    /*
         In this example, we check the value of 'marks' and print
         the corresponding grade based on the defined conditions.
        */