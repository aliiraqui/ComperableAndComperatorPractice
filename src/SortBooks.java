import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " (" + author + ")";
    }
}

class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int titleCompare = b1.title.compareTo(b2.title);
        if (titleCompare != 0) {
            return titleCompare;
        }
        return b1.author.compareTo(b2.author);
    }
}

public class SortBooks {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("Moby Dick", "Herman Melville"),
            new Book("The Catcher in the Rye", "J.D. Salinger"),
            new Book("The Great Gatsby", "Ernest Hemingway")
        );
        Collections.sort(books, new TitleAuthorComparator());
        System.out.println(books);
    }
}
