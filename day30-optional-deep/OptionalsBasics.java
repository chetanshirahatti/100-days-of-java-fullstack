
import java.util.Optional;

public class OptionalsBasics {

    public static void main(String[] args) {

        Optional<String> name = Optional.ofNullable("Ravi");

        name.ifPresent(n -> System.out.println(n));
    }
}
