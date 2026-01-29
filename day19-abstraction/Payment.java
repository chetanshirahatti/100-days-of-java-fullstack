
/*   What is an Interface?
100% abstraction (by default)
Only method declarations
No method body (before Java 8)
Class implements interface */

public interface Payment {

    void pay();  // abstract method
}



class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}