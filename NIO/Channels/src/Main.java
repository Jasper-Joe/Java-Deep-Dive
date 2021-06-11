import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("data1.txt");
        ReadableByteChannel src = Channels.newChannel(fi);
        FileOutputStream fo = new FileOutputStream("data2.txt");
        WritableByteChannel dest = Channels.newChannel(fo);
        ByteBuffer buf = ByteBuffer.allocate(6);
        while (src.read(buf) != -1) {
            buf.flip();
//            String s = StandardCharsets.UTF_8.decode(buf).toString();
//            System.out.println(s);
            dest.write(buf);
            buf.clear();
        }
        src.close();
        dest.close();
    }
}
