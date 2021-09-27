public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("java.lang.String");
        Class c2 = int.class;
        Class c3 = void.class;
        Class c4 = Class.forName("Main");
        System.out.println(c1.toString()); // class java.lang.String
        System.out.println(c2.toString()); // int
        System.out.println(c3.toString()); // void
        System.out.println(c4.toString()); // class Main
        // isInstannce
        String s = "this is string";
        Integer num = 100;
        boolean b1 = c1.isInstance(s); // true
        boolean b2 = c1.isInstance(num); // false
        System.out.println(b1);
        System.out.println(b2);
    }
}
