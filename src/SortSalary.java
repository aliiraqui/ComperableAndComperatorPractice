/* Description:
Create a class Employee with id and salary. Use Comparator to sort employees by salary in ascending order.

Input:
A list of Employee objects:

new Employee(1, 50000)
new Employee(2, 60000)
new Employee(3, 45000)

Output:
A sorted list by salary: [Employee{id=3, salary=45000}, Employee{id=1, salary=50000}, Employee{id=2, salary=60000}]
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private int salary;

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}

public class SortSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, 50000));
        employeeList.add(new Employee(2, 60000));
        employeeList.add(new Employee(3, 45000));

        employeeList.sort(new EmployeeComparator());

        System.out.println(employeeList);
    }
}
