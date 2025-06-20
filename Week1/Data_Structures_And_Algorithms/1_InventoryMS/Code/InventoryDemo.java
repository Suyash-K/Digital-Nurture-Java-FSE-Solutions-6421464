public class InventoryDemo {
    public static void main(String[] args) {
        InventoryManager mgr = new InventoryManager();

        mgr.addProduct(new Product(101, "Widget",   50, 2.99));
        mgr.addProduct(new Product(102, "Gadget",   20, 5.49));

        mgr.updateProduct(101, "Widget Pro", 45, 3.49);

        System.out.println("Lookup: " + mgr.getProduct(102));

        mgr.deleteProduct(102);
    }
}