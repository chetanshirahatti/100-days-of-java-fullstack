

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get value by index
        System.out.println(numbers.get(1)); // 20

        // Update value
        numbers.set(1, 25);

        // Remove value
        numbers.remove(0);

        // Size of list
        System.out.println("Size: " + numbers.size());

        System.out.println(numbers);
    }
}
