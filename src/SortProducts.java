/* Custom Object Sorting with Comparator

Description:
Create a class Product with name and price. Use a Comparator to sort a list of Product objects by price in descending order.

Input:
A list of Product objects:

new Product("Laptop", 1000)
new Product("Phone", 500)
new Product("Tablet", 750)

Output:
A sorted list by price in descending order: [Laptop, Tablet, Phone] */

import java.util.*;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Integer.compare(p2.price, p1.price); // Descending order
    }
}

public class SortProducts {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1000),
            new Product("Phone", 500),
            new Product("Tablet", 750)
        );
        Collections.sort(products, new PriceComparator());
        System.out.println(products);
    }
}
