package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Complete Stream Pipeline

public class q19 {
    public static void main(String[] args) {

        List<String> obj = new ArrayList<>(List.of("Surendra", "Ayush", 
                                        "Pulkit", "Sakshi", "Nitin"));

        Stream<String> name = obj.stream();
                    name.filter(n -> n.startsWith("S"))
                    .map(n -> n.toUpperCase())
                    .distinct()
                    .sorted()
                    .forEach(System.out::println);
    }
}
