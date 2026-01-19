// Example which explains the use of 'this' keyword in Java

/*
    public class Student {

    String name;

    Student(String name) {
        name = name; // WRONG
    }
} */



public class Student {

    String name;

    Student(String name) {
        this.name = name; // Correct use of 'this' keyword to refer to the instance variable
    }
}