package ModernJava.Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class a3 {
    public static void main(String[] args) {
        
        List<String> obj1 = new ArrayList<>(List.of("Surendra", "Naman", "Ayush", "Pulkit", "Sibham", "Nitin"));
        List<String> obj2 = obj1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(obj2);

    }
}
