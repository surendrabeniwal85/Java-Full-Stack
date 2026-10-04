package ModernJava.Day13Tasks;

// Find second highest number using streams

import java.util.*;

public class q09 {
    public static void main(String[] args) {

        List<Integer> n = Arrays.asList(10, 20, 30, 30, 40);

        Optional<Integer> s = n.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        s.ifPresentOrElse(
                x -> System.out.println("Second Highest : " + x),
                () -> System.out.println("Less than two distinct numbers")
        );
    }
}
