package ModernJava.Day11Tasks;

//Create a stream from the list

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        
        List<Integer> obj = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Stream<Integer> number = obj.stream();

        number.forEach(System.out::println);
    }
}
