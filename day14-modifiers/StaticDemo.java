

/* These control behavior, not access 

Use When: You want to define class-level or method-level behavior that is not related to access control.
 Examples include defining constants, utility methods, or behaviors that apply to the class as a whole rather than individual instances.
 -- common data for all objects and utility methods etc.
*/

/* static -- common to all objects */

// public class StaticDemo {

//     static int count = 0;

//     static void show() {
//         System.out.println("Static method");
//     }
// }




/* final -- cannot be changed 
Use When: You want to create constants or prevent method overriding and inheritance.
 Examples include defining constant values that should not change, or ensuring that certain methods or classes remain unchanged for security or design reasons.
 -- constants and preventing inheritance etc.

*/

// class FinalDemo {

//     final int MAX = 100;
// }


/* abstract -- cannot be instantiated or Incomplete method or class */

// abstract class Animal {

//     abstract void sound();
// }


/* Use When: You want to define a common interface for a group of related classes without providing a complete implementation.
 Examples include defining base classes for frameworks or libraries where specific implementations will be provided by subclasses.
 -- common interface for related classes etc.
*/


/* synchronized -- thread safety */

// synchronized void print() {
//     System.out.println("Thread safe");
// }


/* Use When: You want to ensure that a method can be accessed by only one thread at a time to prevent data inconsistency and ensure thread safety.
 Examples include methods that modify shared resources or perform critical operations in multi-threaded environments.
 -- multi-threading and shared resources etc.
*/
