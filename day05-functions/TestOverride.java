/* Method Overriding (Run Time Polymorphism): A child class provides a specific implementation of a method that is already defined in its parent class. */


class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    // Overriding parent method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestOverride {

    public static void main(String[] args) {

        Animal obj = new Dog();  // Parent reference, child object
        obj.sound();             // Calls Dog's method
    }
}

// Decision happens at runtime, based on object type

