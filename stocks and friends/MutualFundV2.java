public class MutualFundV2 extends EquityV2 {
    private double totalFractionalShares;

    public MutualFundV2(String sym, String n) {
        super(sym, n);
    }

    public void purchase(double sharesBought, double totalPurchasePrice) {
        //if newFractionalShares +  current totalFractionalShares >= 1.0
        //increase addShares = sharesBought + 1
        //else ( < 1.0)
        //addShares = sharesBought + totalPurchasePrice
        //update totalFractionShares

        int newFractionalShares;
        newFractionalShares = (int) (Math.floor(sharesBought));

        if (newFractionalShares + totalFractionalShares >= 1.0) {
            addShares((int) sharesBought + 1);
            addCost(totalPurchasePrice);
            totalFractionalShares += newFractionalShares - 1;
        } else {
            addShares((int) sharesBought);
            addCost(totalPurchasePrice);
            totalFractionalShares += newFractionalShares;
        }
    }

    public int profitLoss(double currentPricePerShare) {
        int allShares = (int) totalFractionalShares;
        int currentPrice = (int) currentPricePerShare;
        return (allShares * currentPrice) - getTotalCost();
    }

    public String toString() {
        double numShares;
        numShares = totalFractionalShares + getTotalNumShares();
        return "Mutual Fund " + getSymbol() + ": " + numShares;
    }

}
