
import java.util.LinkedList;

public class QueueExample {

    public static void main(String[] args) {

        /*
         Queue follows FIFO:
         First In First Out
        */

        LinkedList<String> queue = new LinkedList<>();

        // Add people
        queue.add("Customer1");
        queue.add("Customer2");
        queue.add("Customer3");

        // Process queue
        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.removeFirst());
        }
    }
}
