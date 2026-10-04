package ModernJava.Day13Tasks;

// Employee data processing pipeline using streams

import java.util.*;
import java.util.stream.*;

class EmployeeC {
    String name;
    String dept;
    double salary;

    EmployeeC(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class q10 {
    public static void main(String[] args) {

        List<EmployeeC> e = Arrays.asList(
                new EmployeeC("Surendra", "IT", 80000),
                new EmployeeC("Ayush", "IT", 70000),
                new EmployeeC("Pulkit", "HR", 55000),
                new EmployeeC("Sibham", "IT", 40000)
        );

        List<String> n = e.stream()
                .filter(x -> x.dept.equals("IT"))
                .filter(x -> x.salary > 55000)
                .map(x -> x.name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        double avg = e.stream()
                .filter(x -> x.dept.equals("IT"))
                .filter(x -> x.salary > 55000)
                .mapToDouble(x -> x.salary)
                .average()
                .orElse(0);

        Optional<EmployeeC> h = e.stream()
                .filter(x -> x.dept.equals("IT"))
                .filter(x -> x.salary > 55000)
                .max(Comparator.comparingDouble(x -> x.salary));

        System.out.println("Names : " + n);
        System.out.println("Average salary : " + avg);

        h.ifPresent(x -> System.out.println(
                "Highest paid : " + x.name + " - " + x.salary));
    }
}
