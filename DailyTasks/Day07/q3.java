package DailyTasks.Day07;

// Task: Remove Employee IDs Safely During Iteration

import java.util.ArrayList;
import java.util.Iterator;

public class q3 {
    public static void main(String[] args) {

        ArrayList<Integer> employeeIds = new ArrayList<>();

        employeeIds.add(1001);
        employeeIds.add(1005);
        employeeIds.add(1002);
        employeeIds.add(1008);
        employeeIds.add(1003);
        employeeIds.add(1010);

        Iterator<Integer> iterator = employeeIds.iterator();

        while (iterator.hasNext()) {
            int id = iterator.next();

            if (id < 1005) {
                iterator.remove();
            }
        }

        System.out.println("Employee IDs after removal: ");

        for (int id : employeeIds) {
            System.out.println(id);
        }
    }
}
