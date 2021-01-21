public class CoinGame {
    Player[] players = new Player[2];
    Coin coin = new Coin();
    CoinGame(String player1Name, String player2Name) {
        players[0] = new Player(player1Name);
        players[1] = new Player(player2Name);

    }

    public void startGame() {
        int randIndex = Math.random() < 0.5 ? 0 : 1;
        String playersPick = players[randIndex].getRandCoinOption();
        int opponentsIndex = randIndex == 0 ? 1 : 0;
        players[opponentsIndex].setCoinOption(playersPick);
        String winningFlip = coin.getCoinOption();
        players[0].didPlayerWin(winningFlip);
        players[1].didPlayerWin(winningFlip);

    }
}
