public class Main {
    public static void main(String[] args) {
        System.out.println(max(3,22,21));
        System.out.println(max("Jasper","Kerry","Wendy"));

    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T res = a;
        if(b.compareTo(res) > 0) {
            res = b;
        }
        if(c.compareTo(res) > 0) {
            res = c;
        }
        return res;
    }
}
