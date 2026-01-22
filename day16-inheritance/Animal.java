
// This is a Parent class

public class Animal {

    String type = "Animal";

    void eat() {
        System.out.println("Animal eats food");
    }
}

// This is a Child class which inherits the properties and methods of Animal class
class Dog extends Animal {

    void bark(){
        System.out.println("Dog barks");
    }

}


/*
     Rules of inheritance:

     - Child class can access public and protected members
     - private members are NOT inherited
     - Constructors are NOT inherited
     - One class can extend only ONE class
    */




