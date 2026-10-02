import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null) {
            book.setAuthor(this);

            if (!books.contains(book)) {
                books.add(book);
            }
        }
    }

    public void addBook(String title, double price) {
        Book book = new Book(title, this, price);
        books.add(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
