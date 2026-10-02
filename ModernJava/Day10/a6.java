package ModernJava.Day10;

//Predictate<T>

import java.util.function.Predicate;

public class a6 {

    public static void main(String[] args) {

        Predicate<Integer> checkEven = number -> number % 2 == 0;
        
        System.out.println(checkEven.test(10));
        System.out.println(checkEven.test(15));
    }
}
