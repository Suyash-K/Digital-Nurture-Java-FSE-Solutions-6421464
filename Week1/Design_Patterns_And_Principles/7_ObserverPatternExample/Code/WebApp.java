public class WebApp implements Observer {
    private final String siteName;

    public WebApp(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println(siteName + " - WebApp Notification: " + stockSymbol + " is now " + price);
    }
}