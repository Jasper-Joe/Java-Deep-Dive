import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Jasper");
        map.put(2, "Lee");
        map.put(1, "123");
        for (Map.Entry ele : map.entrySet()) {
            int key = (int)ele.getKey();
            String value = (String)ele.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
