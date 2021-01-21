public class Player {
    private String name = "";
    private String coinOption = "";

    public String[] coinValue = {"Heads", "Tails"};
    Player(String name) {
        this.name = name;
    }

    public void didPlayerWin(String winningFlip) {
        if(coinOption == winningFlip) {
            System.out.println(name + " won with a flip of " + coinOption);
        } else {
            System.out.println(name + " lost with flip of " + coinOption);
        }

    }

    public String getRandCoinOption() {
        int randNum = Math.random() < 0.5 ? 0 : 1;
        coinOption = coinValue[randNum];
        return coinValue[randNum];

    }

    public String getCoinOption() {
        return coinOption;
    }
    public void setCoinOption(String opponentFlip) {
        coinOption = opponentFlip == "Heads" ? "Tails" : "Heads";

    }

}
