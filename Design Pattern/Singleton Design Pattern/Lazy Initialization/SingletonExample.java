public class SingletonExample {
    // lazy initialization
    private static SingletonExample INSTANCE = null;

    public int[] arr = new int[]{0,0,9};
    private SingletonExample(){}

    public static SingletonExample getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }
}
