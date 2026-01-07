// Method Without parameters & With return value, No input, but gives output 

public class MethodReturnOnly {

    static int getFixedNumber(){
        return 100;
    }

    public static void main(String[] args) {
        // Calling the method and storing the returned value
        int value = getFixedNumber();
        System.out.println("Returned value: " + value);
    }
    
}
