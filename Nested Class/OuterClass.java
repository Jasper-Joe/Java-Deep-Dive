public class OuterClass {
    private static String msg = "Journey is awesome";
    public static class NestedStaticClass {
        public void printMessage() {
            System.out.println("Message from nested static class:" + msg);
        }
    }

    public class InnerClass {
        public void display() {
            System.out.println("Message from non-static nested class" + msg);
        }
    }
}
