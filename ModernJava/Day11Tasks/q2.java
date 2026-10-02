package ModernJava.Day11Tasks;

//Filter even numbers

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class q2 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(2, 3, 4, 6, 5, 10));

        Stream<Integer> number = obj.stream();

        number.filter(x -> x % 2 == 0)
             .forEach(System.out::println);
    }
}
