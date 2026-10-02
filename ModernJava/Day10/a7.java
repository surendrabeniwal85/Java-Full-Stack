package ModernJava.Day10;

//Function<T, R>

import java.util.function.Function;

public class a7 {
    public static void main(String[] args) {

        Function<Integer, Integer> square = number -> number * number;

        System.out.println(square.apply(5));
        System.out.println(square.apply(10));
    }
}
