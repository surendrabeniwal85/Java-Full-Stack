package ModernJava.Day11;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;
import java.util.List;

//Stream class example 1

public class a1 {
    public static void main(String[] args) {

        // List<Integer> obj = new ArrayList<>();
        // obj.add(1);
        // obj.add(2);
        // System.out.println((obj));

        //Method 1
        List<Integer> obj = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Stream<Integer> number = obj.stream();
        number = number.filter(x -> x > 4);  //Filter 1
        number = number.map(x -> x * 5);     //Filter 2

        number.forEach(System.out::println);

        //Method 2
        obj.stream()
        .filter(x -> x > 4)
        .map(x -> x * 5)
        .forEach(System.out::println);

        //Method 3
        Stream<Integer> number1 = obj.stream()
            .filter(x -> x > 4)
            .map(x -> x * 10);
            number1.forEach(System.out::println);
                

    }
}
