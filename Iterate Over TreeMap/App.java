import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(99,"Karren");
        map.put(78,"Lee");
        map.put(3,"Jasper");
        map.put(991212,"Uber");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            map.put(entry.getKey(), "Changed");
        }


        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }





    }
}
