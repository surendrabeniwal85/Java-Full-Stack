package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Check Conditions Using anyMatch()

public class q15 {
    public static void main(String[] args) {
        
        List<Integer> obj = new ArrayList<>(List.of(65, 72, 85, 95, 78));
        Stream<Integer> marks = obj.stream();

        boolean result = marks.anyMatch(n -> n > 90);

        System.out.println("Student scored more than 90 : " + result);
    }
}
