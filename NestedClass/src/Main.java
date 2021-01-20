public class Main {
    public static void main(String args[]) {
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
        printer.printMessage();
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
