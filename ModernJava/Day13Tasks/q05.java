package ModernJava.Day13Tasks;

// Employee Department Report

import java.util.*;
import java.util.stream.*;

class EmployeeA {
    String name;
    String dept;
    double salary;

    EmployeeA(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class q05 {
    public static void main(String[] args) {

        List<EmployeeA> e = Arrays.asList(
                new EmployeeA("Surendra", "IT", 60000),
                new EmployeeA("Pulkit", "IT", 70000),
                new EmployeeA("Ayush", "HR", 50000),
                new EmployeeA("Shruti", "HR", 55000)
        );

        Map<String, Double> t = e.stream()
                .collect(Collectors.groupingBy(
                        x -> x.dept,
                        Collectors.summingDouble(x -> x.salary)
                ));

        Map<String, Optional<EmployeeA>> h = e.stream()
                .collect(Collectors.groupingBy(
                        x -> x.dept,
                        Collectors.maxBy(
                                Comparator.comparingDouble(x -> x.salary)
                        )
                ));

        System.out.println("Total Salary : " + t);
        System.out.println("Highest Paid : " + h);
    }
}

