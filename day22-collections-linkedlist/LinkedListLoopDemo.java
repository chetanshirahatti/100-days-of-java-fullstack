

import java.util.LinkedList;

public class LinkedListLoopDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Using for-each loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
