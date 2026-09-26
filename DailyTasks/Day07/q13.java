package DailyTasks.Day07;

// Task: Customer Service Queue

import java.util.LinkedList;
import java.util.Queue;

public class q13 {
    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.offer("Rahul");
        customers.offer("Aman");
        customers.offer("Priya");
        customers.offer("Neha");
        customers.offer("Rohit");

        System.out.println("Customer Queue:");
        System.out.println(customers);

        System.out.println("\nFront Customer: " + customers.peek());

        System.out.println("Served Customer: " + customers.poll());
        System.out.println("Served Customer: " + customers.poll());

        System.out.println("\nRemaining Customers:");
        System.out.println(customers);
    }
}