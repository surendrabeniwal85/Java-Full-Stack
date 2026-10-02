package ModernJava.Day12;

import java.util.Arrays;
import java.util.List;

//Terminal Operation : allMatch()

public class a13 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10, 20, 35, 40);

        boolean result = 
              numbers.stream()
                     .allMatch(n -> n > 5);
        
        System.out.println(result);
    }
}
