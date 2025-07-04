public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("PaymentStrategy not set");
        }
        strategy.pay(amount);
    }
}