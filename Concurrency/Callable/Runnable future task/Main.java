public class Main {
    public static void main(String[] args) throws InterruptedException {
        RunnableExample[] randomNumberTask = new RunnableExample[5];
        for (int i = 0; i < 5; i++) {
            randomNumberTask[i] = new RunnableExample();
            Thread t = new Thread(randomNumberTask[i]);
            t.start();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumberTask[i].get());
        }
    }
}
