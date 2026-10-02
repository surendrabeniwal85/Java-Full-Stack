package ModernJava.Day10Tasks;

// 19. Generate the Current Date Using Supplier

import java.time.LocalDate;
import java.util.function.Supplier;

public class q19 {
    public static void main(String[] args) {

        Supplier<LocalDate> obj = () -> {
            return LocalDate.now();
        };

        System.out.println("Current Date: " + obj.get());
    }
}
