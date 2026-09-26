package DailyTasks.Day07;

// Task: Task Management using LinkedList

import java.util.LinkedList;

public class q4 {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.addFirst("Complete Assignment");
        tasks.addLast("Study Java");
        tasks.addFirst("Attend Class");
        tasks.addLast("Practice DSA");
        tasks.addLast("Read Book");

        System.out.println("All Tasks:");
        System.out.println(tasks);

        tasks.removeFirst();
        tasks.removeLast();

        System.out.println("\nRemaining Tasks:");
        System.out.println(tasks);
    }
}
