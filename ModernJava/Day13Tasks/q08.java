package ModernJava.Day13Tasks;

// Optional Employee Search using Streams

import java.util.*;

class EmployeeB {
    int id;
    String name;

    EmployeeB(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class q08 {

    static Optional<EmployeeB> find(List<EmployeeB> e, int id) {
        return e.stream()
                .filter(x -> x.id == id)
                .findFirst();
    }

    public static void main(String[] args) {

        List<EmployeeB> e = Arrays.asList(
                new EmployeeB(1, "Aman"),
                new EmployeeB(2, "Ravi")
        );

        Optional<EmployeeB> x = find(e, 2);

        x.ifPresentOrElse(
                y -> System.out.println("Found : " + y.name),
                () -> System.out.println("Employee not found")
        );
    }
}
