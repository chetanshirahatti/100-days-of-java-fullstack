

// Real world example: Method Overriding in Java. Same method name and parameters in parent and child class.

public class Payment {
    void pay() {
        System.out.println("Generic payment");
    }
}

class UpiPayment extends Payment {
    void pay() {
        System.out.println("Paying via UPI");
    }
}

class CardPayment extends Payment {
    void pay() {
        System.out.println("Paying via Card");
    }
}


