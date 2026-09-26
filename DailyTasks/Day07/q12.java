package DailyTasks.Day07;

// Task: Ordered Records using LinkedHashMap

import java.util.LinkedHashMap;

public class q12 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> products = new LinkedHashMap<>();

        products.put(101, "Laptop");
        products.put(102, "Mobile");
        products.put(103, "Headphones");
        products.put(104, "Keyboard");

        System.out.println("Products in Insertion Order:");

        for (Integer id : products.keySet()) {
            System.out.println(id + " : " + products.get(id));
        }
    }
}
