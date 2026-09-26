package DailyTasks.Day07;

// Task: College Management System using List, Set, Map and Queue

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class q19 {
    public static void main(String[] args) {

        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Rahul");
        studentNames.add("Aman");
        studentNames.add("Priya");
        studentNames.add("Neha");

        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Java");

        HashMap<Integer, String> studentRecords = new HashMap<>();

        studentRecords.put(101, "Rahul");
        studentRecords.put(102, "Aman");
        studentRecords.put(103, "Priya");
        studentRecords.put(104, "Neha");

        Queue<String> registrationQueue = new LinkedList<>();

        registrationQueue.offer("Rahul");
        registrationQueue.offer("Aman");
        registrationQueue.offer("Priya");
        registrationQueue.offer("Neha");

        System.out.println("Student Names:");
        System.out.println(studentNames);

        System.out.println("\nUnique Courses:");
        System.out.println(courses);

        System.out.println("\nStudent Records:");
        System.out.println(studentRecords);

        System.out.println("\nRegistration Queue:");
        System.out.println(registrationQueue);
    }
}