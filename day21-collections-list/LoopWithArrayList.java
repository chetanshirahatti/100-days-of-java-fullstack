

import java.util.ArrayList;

public class LoopWithArrayList {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");

        // Using for loop
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
    }
}
