import java.util.Random;

public class RunnableExample implements Runnable{
    private Object result = null;
    public void run() {
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(5);
        try {
            Thread.sleep(randomNumber * 1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        result = randomNumber;

        synchronized (this) {
            notifyAll();
        }
    }

    /**
     * The wait is the method owned by Object, to use the method, you must
     *  get the lock of the object.
     */
    public synchronized Object get() throws InterruptedException {
        while (result == null) {
            wait();
        }
        return result;
    }
}
