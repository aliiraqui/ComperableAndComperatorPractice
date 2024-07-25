/* Description:
Create a class Student with name and grade. Implement a Comparator to sort students first by grade in descending
order and then by name alphabetically if grades are the same.

Input:
A list of Student objects:

new Student("John", 85)
new Student("Alice", 92)
new Student("Bob", 85)
new Student("Carol", 92)

Output:
A sorted list by grade (descending), then by name: [Alice, Carol, Bob, John] */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getGrade() == o2.getGrade()) {
                return Integer.compare(o2.getGrade(), o1.getGrade());
            }
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class SortMarks {
        public static void main(String[] args) {
            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student("John", 85));
            studentList.add(new Student("Alice", 92));
            studentList.add(new Student("Bob", 85));
            studentList.add(new Student("Carol", 92));

            studentList.sort(new StudentComparator());

            System.out.println(studentList);
        }
    }
}
