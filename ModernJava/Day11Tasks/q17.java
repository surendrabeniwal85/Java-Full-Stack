package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Check conditions using noneMatch() 

public class q17 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        Stream<Integer> number = obj.stream();
        
        boolean result = number.allMatch(n -> n < 0);

        System.out.println("No number is negative : " + result);
    }
}
