public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolderName;
    private final String cvv;
    private final String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with credit card ending " + cardNumber.substring(cardNumber.length() - 4));
    }
}