package ModernJava.Day11;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;
import java.util.List;

//Stream class example 2

public class a2 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(1, 2, 3, 4, 15, 16));
        Stream<Integer> number = obj.stream();
        number = number.filter(x -> x > 10);  //Filter 1
        number = number.map(x -> x / 2);     //Filter 2

        number.forEach(System.out::println);
    }
}