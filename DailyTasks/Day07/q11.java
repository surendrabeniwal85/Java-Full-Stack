package DailyTasks.Day07;

// Task: Employee Salary Management using HashMap

import java.util.HashMap;
import java.util.Map;

public class q11 {
    public static void main(String[] args) {

        HashMap<Integer, Double> employees = new HashMap<>();

        employees.put(101, 35000.0);
        employees.put(102, 45000.0);
        employees.put(103, 28000.0);
        employees.put(104, 60000.0);
        employees.put(105, 52000.0);

        double totalSalary = 0;

        System.out.println("Employee Salaries:");

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {

            System.out.println(
                "ID: " + entry.getKey() +
                ", Salary: " + entry.getValue()
            );

            totalSalary += entry.getValue();
        }

        System.out.println("\nTotal Salary: " + totalSalary);

        double specifiedAmount = 40000;

        System.out.println("\nEmployees with salary above " + specifiedAmount + ":");

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {

            if (entry.getValue() > specifiedAmount) {
                System.out.println(
                    "ID: " + entry.getKey() +
                    ", Salary: " + entry.getValue()
                );
            }
        }
    }
}
