package DailyTasks.Day07;

// Task: Remove Duplicate City Names using HashSet

import java.util.HashSet;
import java.util.Set;

public class q5 {
    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();

        cities.add("Jaipur");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Jaipur");
        cities.add("Agra");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Kolkata");
        cities.add("Mumbai");
        cities.add("Chennai");

        System.out.println("Cities:");
        System.out.println(cities);

        System.out.println("\nTotal Unique Cities: " + cities.size());
    }
}