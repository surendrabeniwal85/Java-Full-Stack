package ModernJava.Day11;

//Flattern Nested List

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class a5 {
    public static void main(String[] args) {
        
        List<List<String>> listofList = new ArrayList<>(List.of(
            List.of("Java", "Python"), 
            List.of("Scala", "C++"), 
            List.of("Linux", "Java")
        ));

        List<String> result = listofList.stream()
            .flatMap(List::stream)
            .distinct()
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
