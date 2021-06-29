import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        try {
            is = new FileInputStream("abc.txt");
            p((char)is.read());
            p((char)is.read());
            p((char)is.read());

            is.mark(0);
            is.skip(1);

            p((char)is.read());
            p((char)is.read());
            p((char)is.read());

            boolean check = is.markSupported();
            if (check) {
                is.reset();
                p(is.read());
                p(is.read());
            } else {
                p("not supported");
            }
        } catch (Exception excpt) {
            excpt.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    private static void p(Object obj) {
        System.out.println(obj);
    }
}
