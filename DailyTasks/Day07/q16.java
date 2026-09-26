package DailyTasks.Day07;

// Task: Sort Employees by Salary using Comparable

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    void display() {
        System.out.println(
            id + " : " + name + " : " + salary
        );
    }
}

public class q16 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 45000));
        employees.add(new Employee(102, "Aman", 35000));
        employees.add(new Employee(103, "Priya", 55000));
        employees.add(new Employee(104, "Neha", 40000));

        Collections.sort(employees);

        System.out.println("Employees Sorted by Salary:");

        for (Employee employee : employees) {
            employee.display();
        }
    }
}
