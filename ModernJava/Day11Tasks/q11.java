package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Skip and Limit Elements

public class q11 {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        ));
        Stream<Integer> num = obj.stream();
             num.skip(5)
                .limit(6)
                .forEach(System.out::println);
    }
}
