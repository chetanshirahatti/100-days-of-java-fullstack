

public class PolymorphismTest {

    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Circle();

        s1.draw();  // Parent version
        s2.draw();  // Child version (runtime decision)
    }
}
// Here Decision is made at Runtime based on Object Type (Method Overriding).