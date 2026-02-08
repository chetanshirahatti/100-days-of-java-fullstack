

public class GenericClassTest {

    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.set("Hello Generics");

        System.out.println(box.get());
    }
}
