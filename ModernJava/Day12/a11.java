package ModernJava.Day12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Terminal Operation : findAny()

public class a11 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 15, 16, 17, 19, 21);

        Optional<Integer> result = numbers.stream()
           .filter(n -> n > 15)
           .findAny();

        System.out.println(result.orElse(-1));
    }
}
