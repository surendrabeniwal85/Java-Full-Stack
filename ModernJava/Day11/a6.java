package ModernJava.Day11;

import java.util.stream.Collectors;
import java.util.*;

public class a6 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 46, 22, 37));
        List<Integer> result = numbers.stream()
            .filter(s -> s > 20)
            .sorted()
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
