package ModernJava.Day12;

import java.util.ArrayList;
import java.util.List;

public class a15 {

    public static void main(String[] args) {
        
        //Parallel Stream
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        list.parallelStream()
            .filter(n -> n > 3)
            .map(n -> n * 2)
            .forEachOrdered(System.out::println);
    }
}
