public class Main {
    public static void main(String[] args) {
        String[] words = {"funk", "chunk", "furry", "baconator"};

        for(String word: words) {
            if(word.startsWith("fu")) {
                System.out.println(word + " starts with fu");
            }
            if(word.endsWith("unk")) {
                System.out.println(word + " ends with unk");
            }
        }
    }
}
