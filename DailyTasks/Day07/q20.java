package DailyTasks.Day07;

// Task: Student Sorting using Comparable and Comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentMultiple implements Comparable<StudentMultiple> {

    int id;
    String name;
    double marks;

    StudentMultiple(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentMultiple other) {
        return this.id - other.id;
    }

    void display() {
        System.out.println(
            id + " : " + name + " : " + marks
        );
    }
}

public class q20 {
    public static void main(String[] args) {

        ArrayList<StudentMultiple> students = new ArrayList<>();

        students.add(new StudentMultiple(103, "Rahul", 82));
        students.add(new StudentMultiple(101, "Aman", 91));
        students.add(new StudentMultiple(104, "Priya", 75));
        students.add(new StudentMultiple(102, "Neha", 88));

        // Sorting by ID using Comparable
        Collections.sort(students);

        System.out.println("Sorted by ID:");

        for (StudentMultiple student : students) {
            student.display();
        }

        // Sorting by Name using Comparator
        Collections.sort(
            students,
            Comparator.comparing(student -> student.name)
        );

        System.out.println("\nSorted by Name:");

        for (StudentMultiple student : students) {
            student.display();
        }

        // Sorting by Marks using Comparator
        Collections.sort(
            students,
            Comparator.comparingDouble(
                student -> student.marks
            )
        );

        System.out.println("\nSorted by Marks:");

        for (StudentMultiple student : students) {
            student.display();
        }
    }
}