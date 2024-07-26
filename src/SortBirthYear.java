/* Description:
Create a class Person with name and birthYear. Use a Comparator to sort people first by birth year in descending
order, then by name alphabetically if birth years are the same.

Input:
A list of Person objects:

new Person("Alice", 1985)
new Person("Bob", 1990)
new Person("Charlie", 1985)
Output:
A sorted list by birth year (descending), then by name: [Bob, Alice, Charlie] */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person1 {
    private String Name;
    private int birthYear;

    public Person1(String name, int birthYear) {
        Name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "Name='" + Name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

class Person1Comparator implements Comparator<Person1> {

    @Override
    public int compare(Person1 o1, Person1 o2) {
        if (o1.getBirthYear() == o2.getBirthYear()) {

            return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o2.getBirthYear(), o1.getBirthYear());
    }
}

public class SortBirthYear {
    public static void main(String[] args) {
        List<Person1> person1List = new ArrayList<>();
        person1List.add(new Person1("Alice", 1985));
        person1List.add(new Person1("Bob", 1990));
        person1List.add(new Person1("Charlie", 1985));

        person1List.sort(new Person1Comparator());

        System.out.println(person1List);
    }

}
