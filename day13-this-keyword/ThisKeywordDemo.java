

public class ThisKeywordDemo {

    void show() {
        System.out.println("Show method");
    }

    void display() {
        // Calling current class method
        this.show();
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.display();
    }
}
