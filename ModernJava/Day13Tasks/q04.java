package ModernJava.Day13Tasks;

//Word frequency counter using collectors

import java.util.*;
import java.util.stream.*;

public class q04 {
    public static void main(String[] args) {

        String p = "java is easy and java is powerful and java helps to implement easily";

        Map<String, Long> f = Arrays.stream(p.split(" "))
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                ));

        Optional<Map.Entry<String, Long>> m = f.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("Frequency : " + f);

        m.ifPresent(x -> System.out.println(
                "Most frequent : " + x.getKey()));
    }
}
