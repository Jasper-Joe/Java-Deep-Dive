import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        FactorialTask task = new FactorialTask(10);
        Future<Integer> future = executor.submit(task);
        System.out.println(future.get().intValue());
        executor.shutdown();

    }
}
