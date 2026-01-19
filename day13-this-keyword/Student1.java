

public class Student1 {

    String name;
    int age;

    Student1(String name, int age) {
        /*
         this.name refers to current object variable
         name refers to constructor parameter
        */
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age  : " + this.age);
    }


     public static void main(String[] args) {

        Student1 s1 = new Student1("Ravi", 20);
        Student1 s2 = new Student1("Anita", 22);

        s1.display();
        System.out.println("----------");
        s2.display();
    }
}
