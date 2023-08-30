package system;


import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
        System.out.println("Book added: " + book.getTitle());
    }

    public Book searchByTitle(String title) {
        return books.get(title);
    }

    public void displayAllBooks() {
        System.out.println("Library Catalog:");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }
}

