package ModernJava.Day14;

//customized local date

import java.time.LocalDate;

public class a05 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now.getDayOfMonth();
        now.getDayOfWeek();
        now.getDayOfYear();
        System.out.println(now);

        //For customized date
        LocalDate customDate = LocalDate.of(1989, 04, 24);
        System.out.println(customDate);

        //For current date - process 2
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //For yesterday
        LocalDate Yesterday = today.minusDays(1);
        System.out.println(Yesterday);

        //For last month
        LocalDate LastMonth = today.minusMonths(1);
        System.out.println(LastMonth);

        //For last year
        LocalDate LastYear = today.minusYears(1);
        System.out.println(LastYear);
        
    }
}
