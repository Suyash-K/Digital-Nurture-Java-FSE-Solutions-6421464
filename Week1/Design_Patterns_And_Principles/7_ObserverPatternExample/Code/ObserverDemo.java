public class ObserverDemo {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileClient = new MobileApp("AlphaStocks");
        Observer webClient    = new WebApp("BetaFinance");

        market.registerObserver(mobileClient);
        market.registerObserver(webClient);

        market.setStockPrice("AAPL", 150.25);
        market.setStockPrice("GOOGL", 2750.50);

        market.removeObserver(webClient);
        market.setStockPrice("MSFT", 300.00);
    }
}