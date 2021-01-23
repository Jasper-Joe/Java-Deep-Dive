import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double allpPrice;
    private double googPrice;

    public void setIbmPrice(double newIbmPrice) {
        ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGoogPrice) {
        googPrice = newGoogPrice;
        notifyObserver();
    }

    public void setAllpPrice(double newAllpPrice) {
        allpPrice = newAllpPrice;
        notifyObserver();
    }

    @Override
    public void register(Observer o) {
        observers = new ArrayList<Observer>();

    }

    @Override
    public void unregister(Observer observer) {
        int idx = observers.indexOf(observer);
        observers.remove(idx);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(ibmPrice, allpPrice, googPrice);
        }

    }
}
