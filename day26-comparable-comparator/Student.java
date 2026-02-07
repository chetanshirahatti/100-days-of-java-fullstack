

public class Student implements Comparable<Student> {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural sorting by id
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}
