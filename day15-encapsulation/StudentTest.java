
public class StudentTest {

    public static void main(String[] args) {

        Student s = new Student();

        // Setting values using setters
        s.setName("Ravi");
        s.setAge(20);
        s.setMarks(85);

        // Getting values using getters
        System.out.println("Name  : " + s.getName());
        System.out.println("Age   : " + s.getAge());
        System.out.println("Marks : " + s.getMarks());
    }
}
