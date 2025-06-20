public class SearchUtils {
    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == targetId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] sortedProducts, int targetId) {
        int left = 0, right = sortedProducts.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midId = sortedProducts[mid].getProductId();
            if (midId == targetId) {
                return mid;
            } else if (midId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
