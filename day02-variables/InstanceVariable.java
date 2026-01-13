

 /* Variables are used to store data in memory.
         Each variable has a specific data type that
         determines what kind of data it can hold.
        */


public class InstanceVariable {

    int x; // instance variable - will get default value 0 if not initialized and belongs to the object

    public static void main(String[] args) {

        InstanceVariable obj = new InstanceVariable();
        obj.x = 10;
        System.out.println(obj.x);

    
    }
    
}


class LocalVariable {

    public static void main(String[] args) {

        /*
         Local variables are declared within a method,
         constructor, or block and are only accessible
         within that scope. They do not get default values
         and must be initialized before use.
        */

        int y = 20; // local variable
        System.out.println(y);
    }
    
}


class staticVariable {

    static int z; // static variable - will get default value 0 if not initialized and belongs to the class. These are also used for memory management.and shared among all instances of the class. And accessed using the class name. Use static keyword to declare a static variable for all objects of the class defined.

    public static void main(String[] args) {

        z = 30;
        System.out.println(z);
    }
    
}
