package ModernJava.Day11Tasks;

//Filter numbers greater than 50

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class q3 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(10, 20, 55, 35, 78, 45));
        Stream<Integer> number = obj.stream();

        number.filter(n -> n > 50)
            .forEach(System.out::println);
    }
}
