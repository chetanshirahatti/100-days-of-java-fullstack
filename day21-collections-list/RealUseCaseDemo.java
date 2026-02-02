

import java.util.ArrayList;

public class RealUseCaseDemo {

    public static void main(String[] args) {

        /*
         Real project example:
         List of users fetched from database
        */

        ArrayList<String> users = new ArrayList<>();

        users.add("admin");
        users.add("customer");
        users.add("vendor");

        if (users.contains("admin")) {
            System.out.println("Admin user exists");
        }
    }
}
