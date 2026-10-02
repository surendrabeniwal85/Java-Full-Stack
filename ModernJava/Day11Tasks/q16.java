package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Check conditions Using allMatch()

public class q16 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(45, 60, 72, 55, 80));
        Stream<Integer> marks = obj.stream();
        
        boolean result = marks.allMatch(n -> n >= 40);

        System.out.println("All students scored at least 40 : " + result);
    }
}
