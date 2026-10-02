package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//count matching elements

public class q12 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(10, 15, 22, 30, 41, 50, 63));
        Stream<Integer> number = obj.stream();
            long count = number.filter(n -> n % 5 == 0)
            .count();

            System.out.println("Count = " + count);
    }
}
