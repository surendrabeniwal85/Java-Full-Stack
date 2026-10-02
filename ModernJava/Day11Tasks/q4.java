package ModernJava.Day11Tasks;

//square each number

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class q4 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(2, 4, 5, 10, 8));
        Stream<Integer> number = obj.stream();
        number = number.map(n -> n * n);

        number.forEach(System.out::println);
    }
}
