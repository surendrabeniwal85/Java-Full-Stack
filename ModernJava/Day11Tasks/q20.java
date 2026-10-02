package ModernJava.Day11Tasks;

//Stream Pipeline with peek()

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q20 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(
                List.of(10, 20, 15, 20, 30, 25, 10, 40));

        Stream<Integer> number = obj.stream();

        List<Integer> result = number
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .distinct()
                .peek(n -> System.out.println("After distinct : " + n))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Final List : " + result);
    }
}
