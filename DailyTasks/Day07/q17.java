package DailyTasks.Day07;

// Task: Sort Students by Name using Comparator

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class StudentName {

    int id;
    String name;

    StudentName(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " : " + name);
    }
}

public class q17 {
    public static void main(String[] args) {

        ArrayList<StudentName> students = new ArrayList<>();

        students.add(new StudentName(103, "Rahul"));
        students.add(new StudentName(101, "Aman"));
        students.add(new StudentName(104, "Priya"));
        students.add(new StudentName(102, "Neha"));

        Collections.sort(students, Comparator.comparing(student -> student.name));

        System.out.println("Students Sorted by Name:");

        for (StudentName student : students) {
            student.display();
        }
    }
}