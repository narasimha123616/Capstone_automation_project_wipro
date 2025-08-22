package Comparable_comparator;
import java.util.*;

// 1️⃣ Student class implements Comparable
class Student implements Comparable<Student> {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Default sorting by ID
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    // toString override
    public String toString() {
        return id + " - " + name;
    }
}

// 2️⃣ Comparator to sort by name
class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class comparator_comparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Ravi"));
        students.add(new Student(102, "Anu"));
        students.add(new Student(104, "Meena"));
        students.add(new Student(103, "Bala"));

        System.out.println("🔹 Sort by ID (using Comparable):");
        Collections.sort(students); // uses compareTo()
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\n🔹 Sort by Name (using Comparator):");
        Collections.sort(students, new SortByName()); // uses compare()
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
