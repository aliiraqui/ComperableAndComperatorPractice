/* Description:
Create a class Book with title and year. Use Comparable to sort Book objects by title alphabetically.

Input:
A list of Book objects:

new Book("War and Peace", 1869)
new Book("1984", 1949)
new Book("The Catcher in the Rye", 1951)
Output:
A sorted list by title: [1984, The Catcher in the Rye, War and Peace] */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book2 implements Comparable<Book2> {
    private String title;
    private int year;

    public Book2(String title, int year) {
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
        return "Book2{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book2 o) {
        return this.title.compareTo(o.title);
    }
}

public class SortBookTitle {
    public static void main(String[] args) {
        List<Book2> book2List = new ArrayList<>();
        book2List.add(new Book2("War and Peace", 1869));
        book2List.add(new Book2("1984", 1949));
        book2List.add(new Book2("The Catcher in the Rye", 1951));

        Collections.sort(book2List);

        System.out.println(book2List);
    }
}
