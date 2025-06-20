public class Order {
    private final int orderId;
    private final String customerName;
    private final double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId      = orderId;
        this.customerName = customerName;
        this.totalPrice   = totalPrice;
    }

    public int getOrderId()          { return orderId; }
    public String getCustomerName()  { return customerName; }
    public double getTotalPrice()    { return totalPrice; }

    @Override
    public String toString() {
        return String.format("Order{id=%d, customer='%s', total=%.2f}",
                              orderId, customerName, totalPrice);
    }
}
