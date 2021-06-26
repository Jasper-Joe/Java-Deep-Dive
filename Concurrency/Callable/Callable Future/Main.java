import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask [] randomNumberTasks = new FutureTask[5];
        for (int i = 0; i < 5; i++) {
            Callable callable = new CallableExample();
            // create the FutureTask with Callable
            randomNumberTasks[i] = new FutureTask(callable);

            Thread t = new Thread(randomNumberTasks[i]);
            t.start();

        }

        for (int i = 0; i < 5; i++) {
            // get() blocks till the result is obtained
            System.out.println(randomNumberTasks[i].get());

        }
    }
}
