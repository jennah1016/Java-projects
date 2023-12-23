public class EquityTester {
    public static void main(String[] args) {
        DividendStockV2 att = new DividendStockV2("T", "AT&T");
        StockV2 bell = new StockV2("B");
        StockV2 compaq = new StockV2("C");
        DividendStockV2 dell = new DividendStockV2("D", 75.00);
        MutualFundV2 babson = new MutualFundV2("BABS", "Babson");
        MutualFundV2 vanguard = new MutualFundV2("VANG", "Vanguard");

        att.purchase(100, 12, 2.97);
        bell.purchase(10, 19.25, 0);
        compaq.purchase(95, 8.88, 12.00);
        dell.purchase(1, 1234.00, 1);
        babson.purchase(27.175, 1000.00);
        vanguard.purchase(19.072, 1000.00);
        att.purchase(50, 14, 3.95);
        vanguard.purchase(20.927, 1000.000);

        att.payDiv(1.35);
        att.payDiv(1.44);
        dell.payDiv(55.55);

        EquityV2[] items = new EquityV2[]{att, bell, compaq, dell, babson, vanguard};
        for (EquityV2 i : items) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("AT&T: $" + att.profitLoss(12));
        System.out.println("bell: $" + bell.profitLoss(19.25));
        System.out.println("compaq: $" + compaq.profitLoss(8.88));
        System.out.println("dell: $" + dell.profitLoss(1234.00));
        System.out.println("babson: $" + babson.profitLoss((1000.00 / 27.175)));
        System.out.println("vanguard: $" + vanguard.profitLoss((1000.00 / 20.927)));
        System.out.println();

        double totalProfitLoss = att.profitLoss(12) + bell.profitLoss(19.25) + compaq.profitLoss(8.88) + dell.profitLoss(1234.00) + babson.profitLoss((1000.00 / 27.175)) + vanguard.profitLoss((1000.00 / 20.927));

        System.out.println();
        System.out.println("Total profit/loss: $" + totalProfitLoss);
    }
}
