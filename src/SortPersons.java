/* Description:
Create a class Person with name and age. Implement Comparable to sort a list of Person objects by age.

Input:
A list of Person objects:

new Person("Alice", 30)
new Person("Bob", 25)
new Person("Charlie", 35)

Output:
A sorted list by age: [Bob, Alice, Charlie] */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public int compare(Person o1, Person o2) {
//        return Integer.compare(o1.age, o2.age);
//    }
}

public class SortPersons {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );
        Collections.sort(people);
        System.out.println(people);
    }
}
