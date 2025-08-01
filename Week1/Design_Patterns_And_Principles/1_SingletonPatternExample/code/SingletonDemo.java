public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Single instance confirmed.");
        } else {
            System.out.println("Different instances detected!");
        }

        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");
    }
}