import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLConnectionclass {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.geeksforgeeks.org/java");
            URLConnection urlcon = url.openConnection();
            Map<String, List<String>> header = urlcon.getHeaderFields();
            for (Map.Entry<String, List<String>> mp : header.entrySet()) {
                print(mp.getKey() + " : ");
                print(mp.getValue().toString());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            String i;
            while ((i = br.readLine()) != null) {
                print(i);
            }

        } catch(Exception e) {
            print(e);
        }
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}
