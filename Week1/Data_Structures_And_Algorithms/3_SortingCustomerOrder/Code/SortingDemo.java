import java.util.Arrays;

public class SortingDemo {
    public static void main(String[] args) {
        Order[] orders = {
            new Order( 301, "Alice",   250.75),
            new Order( 302, "Bob",      99.50),
            new Order( 303, "Charlie", 500.00),
            new Order( 304, "Diana",  1200.00)
        };

        Order[] bubbleSorted = Arrays.copyOf(orders, orders.length);
        SortUtils.bubbleSort(bubbleSorted);
        System.out.println("Bubble Sort Result:");
        for (Order o : bubbleSorted) System.out.println("  " + o);

        Order[] quickSorted = Arrays.copyOf(orders, orders.length);
        SortUtils.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nQuick Sort Result:");
        for (Order o : quickSorted) System.out.println("  " + o);
    }
}
