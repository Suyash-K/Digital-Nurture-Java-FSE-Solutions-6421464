public class MobileApp implements Observer {
    private final String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println(appName + " - MobileApp Alert: " + stockSymbol + " price changed to " + price);
    }
}