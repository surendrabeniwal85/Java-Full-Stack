package ModernJava.Day10Tasks;

// 17. Generate a Welcome Message Using Supplier

import java.util.function.Supplier;

public class q17 {
    public static void main(String[] args) {

        Supplier<String> obj = () -> {
            return "Welcome to Java Functional Programming!";
        };

        System.out.println(obj.get());
    }
}
