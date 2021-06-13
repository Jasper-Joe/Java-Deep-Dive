import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        Client client;
        Process server;
        /**
         * Must start server first, otherwise get connection refused
         */
        server = Server.start();
        client = Client.start();

        String res = client.sendMessage("hello");
        System.out.println(res);
    }
}
