/* Description:
Create a class Book with title and year. Use a Comparator to sort a list of Book objects by year in descending
order.

Input:
A list of Book objects:

new Book("Book A", 2010)
new Book("Book B", 2020)
new Book("Book C", 2015)

Output:
A sorted list by year (descending): [Book B, Book C, Book A] */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book1 {
    private String title;
    private int year;

    public Book1(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

class Book1comparator implements Comparator<Book1> {

    @Override
    public int compare(Book1 o1, Book1 o2) {
        return Integer.compare(o2.getYear(), o1.getYear());
    }
}

public class SortYear {
    public static void main(String[] args) {
        List<Book1> book1List = new ArrayList<>();
        book1List.add(new Book1("Book A", 2010));
        book1List.add(new Book1("Book B", 2020));
        book1List.add(new Book1("Book C", 2015));


        System.out.println(book1List);
    }


}
