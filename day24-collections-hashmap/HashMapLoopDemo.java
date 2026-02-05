

import java.util.HashMap;

public class HashMapLoopDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");

        for (Integer key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}
