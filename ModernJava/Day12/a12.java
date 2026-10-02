package ModernJava.Day12;

import java.util.Arrays;
import java.util.List;

//Terminal Operation : anyMatch()

public class a12 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10, 20, 35, 40);

        boolean result = 
              numbers.stream()
                     .anyMatch(n -> n > 20);
        
        System.out.println(result);
    }
}
