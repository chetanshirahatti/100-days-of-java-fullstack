

import java.util.ArrayList;

public class WildcardDemo {

    static void printList(ArrayList<?> list) {

        for(Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ravi");

        printList(names);
    }
}
