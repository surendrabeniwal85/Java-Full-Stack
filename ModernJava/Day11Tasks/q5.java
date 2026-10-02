package ModernJava.Day11Tasks;

//Convert names to UpperCase

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class q5 {
    public static void main(String[] args) {
        
        List<String> obj = new ArrayList<>(List.of("Surendra", "Naman", 
                                    "Ayush", "Pulkit", "Sibham", "Nitin"));
        Stream<String> name = obj.stream();

        name.map(n -> n.toUpperCase())
            .forEach(System.out::println);
    }
}
