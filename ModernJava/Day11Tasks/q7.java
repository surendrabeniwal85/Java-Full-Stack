package ModernJava.Day11Tasks;

//Filter and transform numbers

import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;
import java.util.List;

public class q7 {
    public static void main(String[] args) {

       
        List<Integer> obj = new ArrayList<>(List.of(6, 22, 30, 41, 5, 60));
        obj.stream()
        .filter(x -> x > 10)
        .map(x -> x * 2)
        .forEach(System.out::println);
    }
}