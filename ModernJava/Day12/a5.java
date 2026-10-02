package ModernJava.Day12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//partitioningBy()

public class a5 {

    public static void main(String[] args) {
        
        List<Integer> numbers = 
            Arrays.asList(10, 15, 20, 25, 30);
        
        Map<Boolean, List<Integer>> result = 
            numbers.stream()
                   .collect(Collectors.partitioningBy(
                    n -> n % 2 == 0
                ));

        System.out.println(result);
    }
}
