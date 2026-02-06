

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorBasics {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anita");
        names.add("Suresh");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
