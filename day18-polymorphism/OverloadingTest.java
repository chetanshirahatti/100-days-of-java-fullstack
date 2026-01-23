

public class OverloadingTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(2.5, 3.5));
    }
}


// Here Decision is made at Compile Time based on Method Signature (Name + Parameters). (Method Overloading).