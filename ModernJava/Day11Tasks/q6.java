package ModernJava.Day11Tasks;

//Find names starting with "S"

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q6 {
    public static void main(String[] args) {
        
        List<String> obj1 = new ArrayList<>(List.of("Surendra", "Sakshi", "Rahul"));
        Stream<String> name = obj1.stream();
              name.filter(s -> s.startsWith("S"))
              .forEach(System.out::println);
    } 
}
