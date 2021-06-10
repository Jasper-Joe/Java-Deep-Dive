import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String fileName = "10lines.txt";
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            writer.println("Line" + i);
        }

        writer.close();
    }
}
