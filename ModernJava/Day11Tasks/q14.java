package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Calculate sum using reduce()

public class q14 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        Stream<Integer> num = obj.stream();

        int sum = num.reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum);
    }
}
