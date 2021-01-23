import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    String[] scrabbleLetters = {"a", "b","d","e"};
    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<>();
        for(int i = 0; i <= howManyTiles; i++) {
            tilesToSend.add(instance.letterList.remove(0));
        }
        return tilesToSend;
    }

    // use synchronized to make sure thread safe
    public static Singleton getInstance() throws InterruptedException {
        if (instance == null) {
            if(firstThread) {
                firstThread = false;
                Thread.currentThread();
                Thread.sleep(1000);
            }
            synchronized (Singleton.class) {
                instance = new Singleton();
            }

        }
        return instance;
    }
    public LinkedList<String> getLetterList() {
        return instance.letterList;
    }
}
