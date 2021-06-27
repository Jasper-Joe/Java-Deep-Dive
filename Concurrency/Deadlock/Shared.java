public class Shared {
    synchronized void test1(Shared s2) {
        System.out.println("test1-begin");
        Util.sleep(1000);
        s2.test2();
        System.out.println("test1-end");
    }

    synchronized void test2() {
        System.out.println("test2-begin");
        Util.sleep(1000);
        System.out.println("test2-end");
    }
}
