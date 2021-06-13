import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Client {
    private static ByteBuffer buffer;
    private static SocketChannel client;
    private static Client instance;

    public static void stop() throws IOException {
        client.close();
        buffer = null;
    }

    private Client() {
        try {
            client = SocketChannel.open(new InetSocketAddress("localhost", 5454));
            buffer = ByteBuffer.allocate(256);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Client start() {
        if (instance == null) {
            instance = new Client();
        }
        return instance;
    }

    public String sendMessage(String msg) {
        buffer = ByteBuffer.wrap(msg.getBytes());
        String response = null;
        try {

            client.write(buffer);
//
            buffer.clear();
            client.read(buffer);
            response = new String(buffer.array()).trim();
            buffer.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
