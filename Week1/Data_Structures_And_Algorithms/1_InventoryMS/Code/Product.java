public class Product {
    private final int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public void setProductName(String name) { this.productName = name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int qty) { this.quantity = qty; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', qty=%d, price=%.2f}",
                             productId, productName, quantity, price);
    }
}