package DailyTasks.Day07;

// Task: Sort Employees by Salary in Descending Order

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeSalary {

    int id;
    String name;
    double salary;

    EmployeeSalary(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " : " + name + " : " + salary);
    }
}

public class q18 {

    public static void main(String[] args) {

        ArrayList<EmployeeSalary> employees = new ArrayList<>();

        employees.add(new EmployeeSalary(101, "Rahul", 45000));
        employees.add(new EmployeeSalary(102, "Aman", 65000));
        employees.add(new EmployeeSalary(103, "Priya", 55000));
        employees.add(new EmployeeSalary(104, "Neha", 35000));

        Collections.sort(employees, Comparator.comparingDouble((EmployeeSalary employee) -> employee.salary).reversed());

        System.out.println("Employees Sorted by Salary Descending : ");

        for (EmployeeSalary employee : employees) {
            employee.display();
        }
    }
}