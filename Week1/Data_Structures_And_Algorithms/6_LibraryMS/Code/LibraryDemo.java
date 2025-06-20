import java.util.Arrays;

public class LibraryDemo {
    public static void main(String[] args) {
        Book[] catalog = {
            new Book(1, "The Hobbit",       "J.R.R. Tolkien"),
            new Book(2, "1984",             "George Orwell"),
            new Book(3, "Clean Code",       "Robert C. Martin"),
            new Book(4, "Effective Java",   "Joshua Bloch")
        };

        String target = "Clean Code";

        int idxL = BookSearch.linearSearch(catalog, target);
        System.out.println(idxL >= 0
            ? "Linear: Found " + catalog[idxL]
            : "Linear: '" + target + "' not found");

        Book[] sorted = Arrays.copyOf(catalog, catalog.length);
        BookSearch.sortByTitle(sorted);

        int idxB = BookSearch.binarySearch(sorted, target);
        System.out.println(idxB >= 0
            ? "Binary: Found " + sorted[idxB]
            : "Binary: '" + target + "' not found");
    }
}
