// Abstract class  - Showing only what is needed, hiding the details


public abstract class Animal {

    /*
     Abstract method
     Only method declaration, no body
    */
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}



class Dog extends Animal {

    // Child must implement abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
