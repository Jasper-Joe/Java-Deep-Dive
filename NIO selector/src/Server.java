import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;

public class Server {
    private static final String POISON_PILL = "POISON_PILL";
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        System.out.println("in server main");

        ByteBuffer buffer = ByteBuffer.allocate(256);
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        serverSocket.bind(new InetSocketAddress("localhost", 5454));
        serverSocket.configureBlocking(false);
        serverSocket.register(selector, SelectionKey.OP_ACCEPT);
        /**
         * SelectionKey
         * When you register a Channel with a Selector, the register() method returns a SelectionKey objects.
         */
        while (true) {
            /**
             * Once you have register one or more channels with a Selector, you can call one of the select() methods.
             * These methods return the channels that are ready for the events you are interested in(connect, accept, read, write).
             * select() blocks until at least one channel is ready for the events you registered for.
             */
            selector.select();
            /**
             * Once you have called one of the select() methods and its return value has indicated that one or more channels are ready,
             * you can access the ready channels via the "selected key set", by calling the selectors selectedKeys() method.
             */
            Set<SelectionKey> selectedKeys = selector.selectedKeys();
            Iterator<SelectionKey> iter = selectedKeys.iterator();
            while (iter.hasNext()) {
                SelectionKey key = iter.next();
                if (key.isAcceptable()) {
                    register(selector, serverSocket);
                }
                if (key.isReadable()) {
                    answerWithEcho(buffer, key);
                }
                iter.remove();
            }
        }
    }

    public static Process start() throws IOException, InterruptedException {
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String className = Server.class.getCanonicalName();
        ProcessBuilder builder = new ProcessBuilder(javaBin, "-cp", classpath, className);
        System.out.println("Server started");
        return builder.start();
    }

    private static void register(Selector selector, ServerSocketChannel serverSocket) throws IOException {
        SocketChannel client = serverSocket.accept();
        client.configureBlocking(false);
        client.register(selector, SelectionKey.OP_READ);
    }

    private static void answerWithEcho(ByteBuffer buffer, SelectionKey key) throws IOException{
        /**
         * Accessing the channel + selector from the SelectionKey is trivial.
         * Channel channel = selectionKey.channel();
         * Selector selector = selectionKey.selector();
         */
        SocketChannel client = (SocketChannel) key.channel();
        String temp = new String(buffer.array()).trim();
        client.read(buffer);
        if (new String(buffer.array()).trim().equals(POISON_PILL)) {
            client.close();
            System.out.println("Not accepting client messages");
        } else {
            buffer.flip();
//            String res = "haha";
//            client.write(ByteBuffer.wrap(res.getBytes()));
            client.write(buffer);
            buffer.clear();
        }

    }
}
