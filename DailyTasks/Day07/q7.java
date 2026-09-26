package DailyTasks.Day07;

// Task: Preserve Insertion Order using LinkedHashSet

import java.util.LinkedHashSet;

public class q7 {
    public static void main(String[] args) {

        LinkedHashSet<String> categories = new LinkedHashSet<>();

        categories.add("Electronics");
        categories.add("Clothing");
        categories.add("Books");
        categories.add("Groceries");
        categories.add("Electronics");
        categories.add("Books");

        System.out.println("Product Categories:");

        for (String category : categories) {
            System.out.println(category);
        }
    }
}
