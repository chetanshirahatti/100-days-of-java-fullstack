


public class TestOverride {

    public static void main(String[] args) {

        /*
         Parent reference holding child object
         This is very important concept
        */
        Animal a = new Dog();

        // Calls child class method at runtime
        a.sound();
    }
}
