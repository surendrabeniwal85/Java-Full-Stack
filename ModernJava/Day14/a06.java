package ModernJava.Day14;

import java.time.LocalDate;

//check date with conditions

public class a06 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate yesterday = today.minusDays(1);

        if(today.isAfter(yesterday)){
            System.out.println("Sahi baat hai");
        }
    }
}
