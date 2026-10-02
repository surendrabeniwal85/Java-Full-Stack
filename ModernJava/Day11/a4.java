package ModernJava.Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class a4 {
    public static void main(String[] args) {
        
        List<String> obj1 = new ArrayList<>(List.of("Surendra", "Rajesh", "Rahul"));
        List<String> obj2 = obj1.stream()
              .filter(s -> s.startsWith("R"))
              .map(String::toUpperCase)
              .collect(Collectors.toList());

        System.out.println(obj2);

    } 
}
