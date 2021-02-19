public class SingletonExample {
    private int[] arr = new int[]{1,2,3,4,5};

    // eager initialization
    private static final SingletonExample INSTANCE = new SingletonExample();

    private SingletonExample(){}

    public static SingletonExample getInstance() {
        return INSTANCE;
    }

    public int[] getArr() {
        return arr;
    }
}
