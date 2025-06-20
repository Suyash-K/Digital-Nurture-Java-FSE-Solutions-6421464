import java.util.Arrays;

public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop",     "Electronics"),
            new Product(205, "Sneakers",   "Footwear"),
            new Product(150, "Watch",      "Accessories"),
            new Product(310, "Backpack",   "Bags")
        };

        int targetId = 150;

        int idx1 = SearchUtils.linearSearch(products, targetId);
        if (idx1 >= 0) {
            System.out.println("Linear: Found " + products[idx1]);
        } else {
            System.out.println("Linear: Product ID " + targetId + " not found");
        }

        Product[] sorted = Arrays.copyOf(products, products.length);
        Arrays.sort(sorted, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));

        int idx2 = SearchUtils.binarySearch(sorted, targetId);
        if (idx2 >= 0) {
            System.out.println("Binary: Found " + sorted[idx2]);
        } else {
            System.out.println("Binary: Product ID " + targetId + " not found");
        }
    }
}
