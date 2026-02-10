

import java.util.Optional;

public class OptionalMethodsDemo {

    public static void main(String[] args) {

        Optional<String> value = Optional.ofNullable(null);

        String result = value.orElse("Default Value");

        System.out.println(result);
    }
}
