import java.util.Scanner;

public class CoinFlippingGame {
    public static void main(String[] args) {
        CoinGame coinGame = new CoinGame("Jasper", "Wendy");
        String usersAnswer;
        do {
            coinGame.startGame();
            System.out.println("Play again?");
            Scanner prompt = new Scanner(System.in);
            usersAnswer = prompt.nextLine();

        } while(usersAnswer.equals("Yes"));
    }
}
