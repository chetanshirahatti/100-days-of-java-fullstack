import java.util.*;
import java.util.stream.*;

public class StreamBasics {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ravi","Anita","Arjun","Suresh");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}
