package ModernJava.Day13;

import java.util.Optional;

public class a1 {
    public static void main(String[] args) {
        
        //Optional.of -> Value must return not null
        
        //With wrapper class
        Optional<String> obj1 = Optional.of("Surendra");
        System.out.println(obj1);

        //Without wrapper class
        //ifPresent() -> executes action if value exists
        obj1.ifPresent(System.out::println);

        //Optional.ofNullable - Allows null
        Optional<String> obj2 = Optional.ofNullable(null);
        System.out.println(obj2);

        //Get() - Value retrieval
        Optional<String> obj3 = Optional.of("Ayush");
        System.out.println(obj3);

        //Empty Optional 
        Optional<String> obj4 = Optional.ofNullable(null);
        System.out.println(obj4.isPresent());

        //With value 
        Optional<String> obj5 = Optional.ofNullable("Naman");
        System.out.println(obj5.isPresent());

        //orElse - Provides a Default value
        Optional<String> obj6 = Optional.ofNullable(null);
        System.out.println(obj6.orElse("Hari"));

        //orElse - Provides a Default value
        Optional<Integer> obj7 = Optional.ofNullable(null);
        System.out.println(obj7.orElse(5));
    }
}
