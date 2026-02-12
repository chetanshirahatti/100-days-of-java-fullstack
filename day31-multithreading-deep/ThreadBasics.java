

public class ThreadBasics extends Thread {

    public void run() {
        System.out.println("Thread executed");
    }

    public static void main(String[] args) {

        ThreadBasics t = new ThreadBasics();
        t.start();
    }
}
