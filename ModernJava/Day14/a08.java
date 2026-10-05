package ModernJava.Day14;

import java.time.LocalDateTime;

public class a08 {
    public static void main(String[] args) {

        //Local Date Time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //LocalDate Time - Customized
        LocalDateTime var1 = LocalDateTime.of(1999, 04, 24, 15, 30, 45);
        System.out.println(var1);
    }
}
