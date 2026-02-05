

import java.util.HashMap;

public class HashMapBasics {

    public static void main(String[] args) {

        HashMap<Integer, String> users = new HashMap<>();

        users.put(101, "Ravi");
        users.put(102, "Anita");
        users.put(103, "Suresh");

        System.out.println(users);
    }
}
