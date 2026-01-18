// class Student represents a blueprint for creating student objects with properties like name, age, and marks, along with a method to display these details.we can create multiple student objects using this class, each having its own set of values for the properties defined in the class. We create objects in StudentTest.java file.

public class Student {

    /*
     * These are variables of the class.
     * They describe the properties of a student.
     */

    String name;
    int age;
    int marks;

    /*
     * This is a method of the class.
     * It describes what a student can do.
     */
    void displayStudentDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }
}
