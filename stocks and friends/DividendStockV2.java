public class DividendStockV2 extends StockV2 {

    //total of all dividends paid to date
    private double accumulatedDivsValue;

    //per share payment planned or made
    private double currentDividend;

    private String divName;

    public DividendStockV2(String sym, double currentDividend) {
        super(sym);
        currentDividend = 0.0;
    }

    public DividendStockV2(String sym, String name) {
        super(sym);
        this.divName = name;
    }

    public void payDiv(double amountPerShare) {
        //increase accumulatedDivs by totalNumShares * amountPerShare
        int numShares = getTotalNumShares();
        accumulatedDivsValue += (amountPerShare * numShares);
    }

    public void purchase(int sharesBought, double pricePerShare) {
        addShares(sharesBought);
        addCost((sharesBought * pricePerShare) + accumulatedDivsValue);
    }

    public int profitLoss(double currentPricePerShare) {
        //same as stock class but adds on accumulatedDivsValue
        int returnDivs = (int) accumulatedDivsValue;
        return super.profitLoss(currentPricePerShare) + returnDivs;
    }

}
