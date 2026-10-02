package ModernJava.Day12;

import java.util.Arrays;
import java.util.List;

//Terminal Operations : Count()

public class a7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);

        long Count = list.stream()
        .filter(n -> n > 25)
        .count();
        
        System.out.println("Count : " + Count);
    }
}
