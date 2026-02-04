

import java.util.HashSet;

public class HashSetBasics {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Ravi");
        names.add("Anita");
        names.add("Ravi"); // duplicate ignored

        System.out.println(names);
    }
}
