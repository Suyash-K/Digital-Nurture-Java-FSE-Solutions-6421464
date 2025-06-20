import java.util.Arrays;
import java.util.Comparator;

public class BookSearch {
    public static int linearSearch(Book[] books, String targetTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(targetTitle)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Book[] sortedBooks, String targetTitle) {
        int left = 0, right = sortedBooks.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = sortedBooks[mid].getTitle()
                        .compareToIgnoreCase(targetTitle);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void sortByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }
}
