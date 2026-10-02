package ModernJava.Day10Tasks;

// 18. Generate a Default Username Using Supplier

import java.util.function.Supplier;

public class q18 {
    public static void main(String[] args) {

        Supplier<String> obj = () -> {
            return "User" + (int) (Math.random() * 1000);
        };

        System.out.println("Default Username: " + obj.get());
    }
}