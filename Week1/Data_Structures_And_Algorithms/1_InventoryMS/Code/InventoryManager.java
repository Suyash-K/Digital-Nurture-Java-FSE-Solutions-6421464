import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private final Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product p) {
        products.put(p.getProductId(), p);
        System.out.println("Added: " + p);
    }

    public void updateProduct(int id, String name, int qty, double price) {
        Product p = products.get(id);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(qty);
            p.setPrice(price);
            System.out.println("Updated: " + p);
        } else {
            System.out.println("Product ID " + id + " not found.");
        }
    }

    public void deleteProduct(int id) {
        Product removed = products.remove(id);
        System.out.println(removed != null
            ? "Deleted: " + removed
            : "Product ID " + id + " not found.");
    }

    public Product getProduct(int id) {
        return products.get(id);
    }
}