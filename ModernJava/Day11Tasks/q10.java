package ModernJava.Day11Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Sort names alphabetically

public class q10 {
    public static void main(String[] args) {

        List<String> obj = new ArrayList<>(List.of("Surendra", "Ayush", "Pulkit", "Nitin"));
        Stream<String> studentName = obj.stream();
           studentName.sorted()
           .forEach(System.out::println);
    }
}
