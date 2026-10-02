package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Find maximum and minimum

public class q13 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(25, 10, 75, 40, 90, 15));

        Stream<Integer> num1 = obj.stream();
        int max = num1.max(Integer::compare).get();

        Stream<Integer> num2 = obj.stream();
        int min = num2.min(Integer::compare).get();

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
