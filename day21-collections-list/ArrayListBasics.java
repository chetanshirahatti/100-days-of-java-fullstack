

import java.util.ArrayList;

public class ArrayListBasics {

    public static void main(String[] args) {

        /*
         ArrayList stores multiple values.
         It grows automatically.
        */

        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anita");
        names.add("Ravi"); // duplicate allowed

        System.out.println(names);
    }
}
