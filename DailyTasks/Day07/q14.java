package DailyTasks.Day07;

// Task: Priority Processing using PriorityQueue

import java.util.PriorityQueue;

public class q14 {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorities = new PriorityQueue<>();

        priorities.offer(5);
        priorities.offer(2);
        priorities.offer(8);
        priorities.offer(1);
        priorities.offer(4);

        System.out.println("Highest Priority to be Processed First: "
                + priorities.peek());

        System.out.println("\nProcessing Tasks:");

        while (!priorities.isEmpty()) {
            System.out.println("Processing priority: " + priorities.poll());
        }
    }
}
