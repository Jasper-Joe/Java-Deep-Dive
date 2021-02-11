import java.io.*;

public class Main {
    public static void main(String[] args) {
        File input = new File("/Users/jinglunzhou/Desktop/Read File/src/text.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(input));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
