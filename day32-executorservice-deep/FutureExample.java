import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() -> {
            return 10 + 20;
        });

        System.out.println("Result = " + future.get());

        executor.shutdown();
    }
}
