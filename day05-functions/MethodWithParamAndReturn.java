// Method WITH parameters & WITH return value (MOST IMPORTANT) Take input, process it, return result

public class MethodWithParamAndReturn {

     static int calculateTotal(int price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        int total = calculateTotal(50, 3);
        System.out.println("Total bill: " + total);
    }
    
}
