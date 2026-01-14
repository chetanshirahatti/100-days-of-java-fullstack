// UserInput is a simple Java program that demonstrates how to take user input from the console. we have to import Scanner class from java.util package to read input.

import java.util.Scanner;

class UserInput {

    // Methos to take user input and display it:
    // nextInt(),next(),nextLine(),nextDouble(), nextFloat(), nextBoolean() etc.

        Scanner sc = new Scanner(System.in);
        public void inputDemo() {

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.print("Enter your height (in feet): ");
            float height = sc.nextFloat();

            System.out.print("Enter your salary: ");
            double salary = sc.nextDouble();

            System.out.print("Are you employed? (true/false): ");
            boolean isEmployed = sc.nextBoolean();

            System.out.println("\n--- User Details ---");
            System.out.println("Name       : " + name);
            System.out.println("Age        : " + age);
            System.out.println("Height     : " + height);
            System.out.println("Salary     : " + salary);
            System.out.println("Employed   : " + isEmployed);  
    }

    public static void main(String[] args) {
        UserInput demo = new UserInput();
        demo.inputDemo();
    }

}
