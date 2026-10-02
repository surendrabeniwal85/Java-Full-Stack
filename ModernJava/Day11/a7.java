package ModernJava.Day11;

import java.util.List;
import java.util.stream.Collectors;

public class a7 {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(
            10, 20, 30, 40, 50, 60, 70);

            List<Integer> result = numbers.stream()
            .skip(2)
            .limit(3)
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
