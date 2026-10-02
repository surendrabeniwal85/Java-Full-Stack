package ModernJava.Day12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//groupingBy()

class Student
{
    String name;
    String department;

    Student(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String toString(){
        return name;
    }
}

public class a4 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Surendra", "AI"),
            new Student("Ayush", "CSE"),
            new Student("Neha", "AI"),
            new Student("Priya", "CSE")
        );

        Map<String, List<Student>> result = 
            students.stream()
                    .collect(Collectors.groupingBy(s -> s.department));

        System.out.println(result);
    }  
}
