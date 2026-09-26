package DailyTasks.Day07;

// Task: Unique Student IDs using HashSet

import java.util.HashSet;

public class q6 {
    public static void main(String[] args) {

        HashSet<Integer> studentIds = new HashSet<>();

        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(101);
        studentIds.add(104);
        studentIds.add(102);

        System.out.println("Student IDs:");
        System.out.println(studentIds);

        int searchId = 103;

        if (studentIds.contains(searchId)) {
            System.out.println(searchId + " exists in the set.");
        } else {
            System.out.println(searchId + " does not exist in the set.");
        }
    }
}