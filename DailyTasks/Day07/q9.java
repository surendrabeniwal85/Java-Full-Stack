package DailyTasks.Day07;

// Task: Student Record Management using HashMap

import java.util.HashMap;

public class q9 {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Aman");
        students.put(103, "Priya");
        students.put(104, "Neha");

        System.out.println("Student Records:");
        System.out.println(students);

        System.out.println("\nStudent with ID 102: " + students.get(102));

        students.put(103, "Pooja");

        students.remove(101);

        System.out.println("\nUpdated Student Records:");
        System.out.println(students);
    }
}
