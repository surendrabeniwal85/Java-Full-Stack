package ModernJava.Day13Tasks;

//Student marks analysis using streams

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class q02 {
    public static void main(String[] args) {

        List<Student> s = Arrays.asList(
                new Student("Surendra", 75),
                new Student("Ayush", 55),
                new Student("Pulkit", 85)
        );

        List<Student> a = s.stream()
                .filter(x -> x.marks > 60)
                .collect(Collectors.toList());

        double avg = s.stream()
                .mapToInt(x -> x.marks)
                .average()
                .orElse(0);

        Optional<Student> high = s.stream()
                .max(Comparator.comparingInt(x -> x.marks));

        System.out.println("Above 60 : " + a.stream()
                .map(x -> x.name)
                .collect(Collectors.toList()));

        System.out.println("Average : " + avg);

        high.ifPresent(x -> System.out.println(
                "Highest Scorer : " + x.name + " - " + x.marks));
    }
}


