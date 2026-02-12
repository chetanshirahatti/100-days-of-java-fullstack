public class RunnableExample {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Lambda thread");

        new Thread(task).start();
    }
}
