

import java.util.ArrayList;

public class GenericListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anita");

        // No casting required
        String name = names.get(0);

        System.out.println(name);
    }
}
