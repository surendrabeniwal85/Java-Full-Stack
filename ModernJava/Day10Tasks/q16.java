package ModernJava.Day10Tasks;

// 16. Generate a Random Number Using Supplier

import java.util.function.Supplier;

public class q16 {
    public static void main(String[] args) {

        Supplier<Integer> obj = () -> {
            return (int) (Math.random() * 100) + 1;
        };

        System.out.println("Random Number: " + obj.get());
    }
}
