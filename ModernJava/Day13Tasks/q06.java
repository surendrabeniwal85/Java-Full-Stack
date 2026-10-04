package ModernJava.Day13Tasks;

// Stream creation using different sources

import java.util.*;
import java.util.stream.*;

public class q06 {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(10, 20, 30);
        l.stream().forEach(x -> System.out.println(x));

        int[] a = {1, 2, 3};
        Arrays.stream(a)
                .filter(x -> x > 1)
                .forEach(x -> System.out.println(x));

        Stream.of(4, 5, 6)
                .forEach(x -> System.out.println(x));

        Stream.generate(() -> "Java")
                .limit(3)
                .forEach(x -> System.out.println(x));

        Stream.iterate(1, x -> x + 1)
                .limit(3)
                .forEach(x -> System.out.println(x));
    }
}