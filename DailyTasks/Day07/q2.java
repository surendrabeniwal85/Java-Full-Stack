package DailyTasks.Day07;

// Task: Marks Management using ArrayList

import java.util.ArrayList;

public class q2 {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(72);
        marks.add(91);
        marks.add(68);
        marks.add(95);
        marks.add(78);

        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        System.out.println("Marks:");

        for (int mark : marks) {
            System.out.println(mark);

            total += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = (double) total / marks.size();

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}