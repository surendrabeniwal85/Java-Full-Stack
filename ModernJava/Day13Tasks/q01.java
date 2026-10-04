package ModernJava.Day13Tasks;

//Employee salary filter

import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class q01 {
    public static void main(String[] args) {

        List<Employee> e = Arrays.asList(
            new Employee(1, "Rahul", 45000),
            new Employee(2, "Ayush", 65000),
            new Employee(3, "Naman", 75000),
            new Employee(4, "Sibham", 52000),
            new Employee(5, "Pulkit", 48000),
            new Employee(6, "Nitin", 90000)
        );

        List<String> result = e.stream()
                .filter(x -> x.salary > 50000)
                .sorted(Comparator.comparingDouble(x -> x.salary))
                .map(x -> x.name)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
