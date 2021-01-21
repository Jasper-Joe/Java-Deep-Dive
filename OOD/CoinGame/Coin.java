public class Coin {
    private String coinOption = "";
    public String[] coinValue = {"Heads", "Tails"};
    Coin() {

    }

    public String getCoinOption() {
        int randNum = Math.random() < 0.5 ? 0 : 1;
        coinOption = coinValue[randNum];
        return coinOption;
    }
}
