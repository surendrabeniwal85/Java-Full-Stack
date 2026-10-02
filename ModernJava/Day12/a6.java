package ModernJava.Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Terminal Operation: forEach() - Using Reference Method

public class a6 {

    public static void main(String[] args) {
        
        List<String> Names = new ArrayList<>(Arrays.asList("Surendra", "Ayush", "Pulkit"));

        Names.stream()
           .forEach(name -> System.out.println(name));
    }
}
