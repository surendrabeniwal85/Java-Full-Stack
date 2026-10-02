package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Sort numbers using stream

public class q9 {
    public static void main(String[] args) {
        
        List<Integer> obj = new ArrayList<>(List.of(30, 20, 10, 40, 50));

        Stream<Integer> num = obj.stream();
            num.sorted()
            .forEach(System.out::println);
    }
}
