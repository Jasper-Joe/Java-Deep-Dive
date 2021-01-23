public class StockObserver implements Observer {

    private double imbPrice;
    private double allpPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;

    private Subject stockGrabber;
    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        stockGrabber.register(this);

    }

    @Override
    public void update(double ibmPrice, double allpPrice, double googPrice) {
        this.imbPrice = ibmPrice;
        this.allpPrice = allpPrice;
        this.googPrice = googPrice;

    }
}
