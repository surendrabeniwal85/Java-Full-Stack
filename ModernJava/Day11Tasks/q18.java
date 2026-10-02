package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Flatten nested lists using flatMap()

public class q18 {
    public static void main(String[] args) {
        
        List<List<String>> obj = new ArrayList<>(List.of(
                            List.of("Java", "C++"),
                            List.of("Python", "JavaScript"),
                            List.of("HTML", "CSS")
        ));

        Stream<String> language = obj.stream()
                .flatMap(n -> n.stream());
                language.forEach(System.out::println);
    }
}
