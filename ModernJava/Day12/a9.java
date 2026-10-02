package ModernJava.Day12;

import java.util.Arrays;
import java.util.List;

//Terminal Operations : min()

public class a9 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(30, 40, 50, 55,60);

        int max = list.stream()
        .filter(n -> n > 30)
        .max(Integer::compareTo)
        .orElse(0);
        
        System.out.println(max);
    }
}
