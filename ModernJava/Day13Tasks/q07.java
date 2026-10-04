package ModernJava.Day13Tasks;

// Sequential vs Parallel stream processing

import java.util.*;
import java.util.stream.*;

public class q07 {
    public static void main(String[] args) {

        List<Integer> l = IntStream.rangeClosed(1, 1000000)
                .boxed()
                .collect(Collectors.toList());

        long s1 = System.nanoTime();

        long a = l.stream()
                .mapToLong(x -> x)
                .sum();

        long e1 = System.nanoTime();

        long s2 = System.nanoTime();

        long b = l.parallelStream()
                .mapToLong(x -> x)
                .sum();

        long e2 = System.nanoTime();

        System.out.println("Sequential Sum : " + a);
        System.out.println("Parallel Sum : " + b);

        System.out.println("Sequential Time : " + (e1 - s1));
        System.out.println("Parallel Time : " + (e2 - s2));
    }
}
