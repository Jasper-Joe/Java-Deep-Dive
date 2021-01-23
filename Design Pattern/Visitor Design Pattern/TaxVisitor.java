import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
    DecimalFormat df = new DecimalFormat("#.##");
    public TaxVisitor(){}

    @Override
    public double visit(Liquor liquor) {
        return Double.parseDouble(df.format((liquor.getPrice() * .18) + liquor.getPrice()));
    }

    @Override
    public double visit(Tobacco tobacco) {
        return Double.parseDouble(df.format((tobacco.getPrice() * .32) + tobacco.getPrice()));
    }

    @Override
    public double visit(Necessity necessity) {
        return necessity.getPrice();
    }
}
