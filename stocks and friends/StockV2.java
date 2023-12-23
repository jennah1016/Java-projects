public class StockV2 extends EquityV2 {
    int numNewShares;

    public StockV2() {
        super();
    }

    public StockV2(String sym) {
        super(sym);
    }

    public void purchase(int sharesBought, double pricePerShare, double fee) {
        numNewShares = sharesBought;
        addShares(sharesBought);
        addCost((pricePerShare * sharesBought) + fee);
    }

    public String toString() {
        double numShares;
        numShares = getTotalNumShares();
        return "Stock " + getSymbol() + ": " + numNewShares;
    }

}
