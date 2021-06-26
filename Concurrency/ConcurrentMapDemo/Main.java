import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentMap<Integer, String> m = new ConcurrentHashMap<>();
        m.put(100, "Jasper");
        m.put(101, "Lee");
        m.put(102, "Wei");
        m.putIfAbsent(101, "Hello");
        System.out.println(m.get(101));
        m.remove(101);
        m.putIfAbsent(101, "Hello");
        System.out.println(m.get(101));
        m.replace(101,"Hello", "Joe");
        System.out.println(m.get(101));

    }
}
