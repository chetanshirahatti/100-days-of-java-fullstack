

public class GenericMethodDemo {

    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {

        printData("Java");
        printData(100);
        printData(3.14);
    }
}
