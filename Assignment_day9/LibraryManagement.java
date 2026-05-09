package Assignment_day9;
import java.util.*;

class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public int hashCode() {
        return Objects.hash(title, author);
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equals(b.title) && author.equals(b.author);
    }
    public String toString() {
        return title + " by " + author;
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Map<Book, Boolean> library = new HashMap<>();
        Book b1 = new Book("Java", "James Gosling");
        Book b2 = new Book("Python", "Guido");
        Book b3 = new Book("C++", "Bjarne");
        library.put(b1, true);
        library.put(b2, true);
        library.put(b3, true);
        Book issueBook = b1;
        if (library.get(issueBook)) {
            library.put(issueBook, false);
            System.out.println(issueBook + " issued");
        } else {
            System.out.println(issueBook + " not available");
        }
        library.put(issueBook, true);
        System.out.println(issueBook + " returned");
        for (Map.Entry<Book, Boolean> entry : library.entrySet()) {
            System.out.println(entry.getKey() + " -> " +
                    (entry.getValue() ? "Available" : "Issued"));
        }
    }
}
