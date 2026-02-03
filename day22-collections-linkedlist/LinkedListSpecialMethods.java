
import java.util.LinkedList;

public class LinkedListSpecialMethods {

    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        // Add elements
        queue.addFirst("First");
        queue.addLast("Last");

        // Normal add
        queue.add("Middle");

        System.out.println(queue);

        // Remove elements
        queue.removeFirst();
        queue.removeLast();

        System.out.println(queue);
    }
}
