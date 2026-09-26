package DailyTasks.Day07;

// Task: Student Name Management using ArrayList

import java.util.ArrayList;

public class q1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");
        students.add("Anjali");
        students.add("Karan");
        students.add("Sneha");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        students.add("Vikas");
        students.set(2, "Pooja");
        students.remove("Rahul");

        System.out.println();
        System.out.println("After adding, updating and removing:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}
