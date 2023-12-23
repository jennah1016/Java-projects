public class EquityV2 {
    private String symbol;
    private String name;
    private int totalNumShares;
    private double totalCost;

    public EquityV2() {

    }

    public EquityV2(String sym) {
        this.symbol = sym;
        totalCost = 0.0;
    }

    public EquityV2(String sym, String n) {
        this.symbol = sym;
        this.name = n;
        totalCost = 0.0;
    }

    public String getSymbol() {
        return symbol;
    }

    public void addShares(int numNewShares) {
        totalNumShares += numNewShares;
    }

    public void addCost(double newCost) {
        totalCost += newCost;
    }

    public void purchase(int sharesBought, double pricePerShare) {
        totalCost += sharesBought * pricePerShare;
        addCost(sharesBought * pricePerShare);
        addShares(sharesBought);
    }

    public int profitLoss(double pricePerShare) {
        return (int) ((pricePerShare * totalNumShares) - totalCost);
    }


    public int getTotalNumShares() {
        return totalNumShares;
    }

    public int getTotalCost() {
        return (int) totalCost;
    }

    public String toString() {
        return "Stock " + symbol + ": " + name;
    }
}
