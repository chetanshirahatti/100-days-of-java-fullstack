
/* Private access modifier example : Use When you want to restrict access to a class, method, or variable to only within the same class.
 Data/method should not be accessible outside the class, sensitive data, internal logic etc. */


 public class PrivateDemo {

    private int secret = 1234;

    private void showSecret() {
        System.out.println("Secret");
    }
}


// Use when
// Data must be protected
// Security is important
// Encapsulation (VERY IMPORTANT).