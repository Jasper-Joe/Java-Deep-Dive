import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        Client client;
        Process server;
        /**
         * Must start server first, otherwise get connection refused
         */
        //server = Server.start();
        client = Client.start();
//        String javaHome = System.getProperty("java.home");
//        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
//        String className = Server.class.getCanonicalName();
//        String classpath = System.getProperty("java.class.path");
        String res = client.sendMessage("hello");
        System.out.println(res);
    }
}
