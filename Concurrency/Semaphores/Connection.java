import java.util.concurrent.Semaphore;

public class Connection {
    private static Connection instance = new Connection();

    private Semaphore sem = new Semaphore(10);

    private int connections = 0;
    private Connection() {

    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            sem.acquire();
        } catch(InterruptedException e1) {
            e1.printStackTrace();
        }

        synchronized (this) {
            connections++;
            System.out.println(connections);
        }
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connections--;
        }

        sem.release();

    }
}
