/*

LinkedList means:
Data is stored as nodes, and each node knows the next node.

Unlike ArrayList:
Data is NOT stored continuously
Each element is connected like a chain
*/

import java.util.LinkedList;

public class LinkedListBasics {

    public static void main(String[] args) {

        /*
         * LinkedList stores elements as nodes.
         * Each node points to next node.
         */

        LinkedList<String> names = new LinkedList<>();

        names.add("Ravi");
        names.add("Anita");
        names.add("Suresh");

        System.out.println(names);
    }
}
