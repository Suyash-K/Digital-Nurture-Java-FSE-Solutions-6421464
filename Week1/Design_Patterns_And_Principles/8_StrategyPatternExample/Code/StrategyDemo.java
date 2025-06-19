public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234567812345678", "John Doe", "123", "12/25"));
        context.executePayment(250.00);

        context.setPaymentStrategy(new PayPalPayment("user@example.com", "securepassword"));
        context.executePayment(75.50);
    }
}