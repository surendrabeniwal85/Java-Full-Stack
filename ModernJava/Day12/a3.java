package ModernJava.Day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Collectos.joining()

public class a3 {
    public static void main(String[] args) {
        
        List<String> names = 
            Arrays.asList("Surendra", "Ayush", "Naman");

        String result = 
            names.stream()
                 .collect(Collectors.joining(", "));

        System.out.println(result);
    } 
}
