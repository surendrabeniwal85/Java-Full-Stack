package ModernJava.Day12;

//Collecting into set

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class a2 {
    public static void main(String[] args) {

        List<Integer> numbers = 
             Arrays.asList(10, 20, 30, 30, 40);

        Set<Integer> result = 
             numbers.stream()
                   .collect(Collectors.toSet());

        System.out.println(result);
    }
    
}
