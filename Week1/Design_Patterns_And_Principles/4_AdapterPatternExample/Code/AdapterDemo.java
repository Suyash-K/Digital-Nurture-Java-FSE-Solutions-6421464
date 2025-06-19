public class AdapterDemo {
    public static void main(String[] args) {
        PayPalGateway paypalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        PaymentProcessor paypalProcessor = new PayPalAdapter(paypalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        double amount = 49.99;
        System.out.println("--- Using PayPal Adapter ---");
        paypalProcessor.processPayment(amount);

        System.out.println("--- Using Stripe Adapter ---");
        stripeProcessor.processPayment(amount);
    }
}