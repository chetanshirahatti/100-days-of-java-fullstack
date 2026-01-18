// Class with constructor to Set/initialize student details

public class Student {

    String name;
    int age;
    int marks;

    /*
     This constructor sets values when object is created
    */
    Student(String n, int a, int m) {
        name = n;
        age = a;
        marks = m;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }


    public static void main(String[] args) {

        /*
         Passing values while creating object
         Constructor receives these values
        */

        Student s1 = new Student("Ravi", 20, 75);
        Student s2 = new Student("Anita", 22, 88);

        s1.display();
        System.out.println("-------------");
        s2.display();
    }
}
