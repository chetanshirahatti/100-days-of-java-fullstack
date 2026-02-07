
import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3,"Ravi"));
        list.add(new Student(1,"Anita"));
        list.add(new Student(2,"Suresh"));

        Collections.sort(list);
        Collections.sort(list, new NameComparator());

        for(Student s : list){
            System.out.println(s.id + " " + s.name);
        }
    }
}
