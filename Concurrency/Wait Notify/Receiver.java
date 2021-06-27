import java.util.concurrent.ThreadLocalRandom;

public class Receiver  implements Runnable{
    private Data load;
    Receiver(Data load) {
        this.load = load;
    }
    public void run() {
        String receivedMessage = "";
        while (!receivedMessage.equals("End")) {
            receivedMessage = load.receive();
            System.out.println(receivedMessage);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }


    }
}
