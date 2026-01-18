// Contructor is a special method used to initialize an object.
// Constructor name is SAME as class name and it does NOT have return type.

public class WhatIsConstructor {

    /*
     Constructor is a special method.
     It is used to initialize (set values for) an object.
     Constructor name is SAME as class name.
     Constructor does NOT have return type.
    */

    WhatIsConstructor() {
        System.out.println("Constructor is called automatically when object is created");
    }

    public static void main(String[] args) {

        // When object is created, constructor runs automatically
        WhatIsConstructor obj = new WhatIsConstructor();
    }
}
