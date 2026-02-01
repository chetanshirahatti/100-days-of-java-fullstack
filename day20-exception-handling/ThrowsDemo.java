


public class ThrowsDemo {

    static void readFile() throws Exception {
        System.out.println("Reading file...");
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
