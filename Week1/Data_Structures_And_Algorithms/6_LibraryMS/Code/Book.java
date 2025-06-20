public class Book {
    private final int bookId;
    private final String title;
    private final String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title  = title;
        this.author = author;
    }

    public int getBookId()   { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor(){ return author; }

    @Override
    public String toString() {
        return String.format("Book{id=%d, title='%s', author='%s'}",
                             bookId, title, author);
    }
}
