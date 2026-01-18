

public class StudentTest {

    public static void main(String[] args) {

        /*
         Creating object of Student class.
         new keyword creates a real object in memory.
        */

        Student s1 = new Student();
        s1.name = "Ravi";
        s1.age = 20;
        s1.marks = 75;

        Student s2 = new Student();
        s2.name = "Anita";
        s2.age = 22;
        s2.marks = 88;

        /*
         Calling method using object
        */
        s1.displayStudentDetails();
        System.out.println("--------------");
        s2.displayStudentDetails();
    }
}
