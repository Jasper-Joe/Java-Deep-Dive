public class Test {
    public static void main(String[] args) {
        SingletonExample obj = SingletonExample.getInstance();
        for(int i = 0; i < 5; i++) {
            System.out.println(obj.getArr()[i]);
        }
    }
}
