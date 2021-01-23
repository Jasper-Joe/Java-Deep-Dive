public class Liquor implements Visitable {
    private double price;
    Liquor(double price) {
        this.price = price;
    }
    double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
