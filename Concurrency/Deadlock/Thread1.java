public class Thread1 extends Thread{
    private Shared s1;
    private Shared s2;
    public Thread1(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        /**
         * Thread t1 calls test1 by taking the object lock of s1
         */
        s1.test1(s2);
    }
}
