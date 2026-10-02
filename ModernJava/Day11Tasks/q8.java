package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Remove duplicate elements

public class q8 {

    public static void main(String[] args) {
        
        List<Integer> obj = new ArrayList<>(List.of(10, 20, 30, 10, 20));
        Stream<Integer> num = obj.stream();
            num.distinct()
            .forEach(System.out::println);
    }
}
