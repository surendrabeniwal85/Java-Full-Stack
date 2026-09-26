package DailyTasks.Day07;

// Task: Sort Students by ID using Comparable

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    void display() {
        System.out.println(id + " : " + name);
    }
}

public class q15 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul"));
        students.add(new Student(101, "Aman"));
        students.add(new Student(104, "Priya"));
        students.add(new Student(102, "Neha"));

        Collections.sort(students);

        System.out.println("Students Sorted by ID:");

        for (Student student : students) {
            student.display();
        }
    }
}