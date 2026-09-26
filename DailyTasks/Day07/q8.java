package DailyTasks.Day07;

// Task: Sorted Scores using TreeSet

import java.util.TreeSet;

public class q8 {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(92);
        scores.add(75);
        scores.add(92);
        scores.add(68);
        scores.add(95);
        scores.add(80);

        System.out.println("Scores in Sorted Order:");
        System.out.println(scores);

        System.out.println("First Score: " + scores.first());
        System.out.println("Last Score: " + scores.last());
    }
}