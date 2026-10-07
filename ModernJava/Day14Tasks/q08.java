package ModernJava.Day14Tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.DateTimeException;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

// Last friday of the month

public class q08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter year: ");
            int y = sc.nextInt();

            System.out.print("Enter month: ");
            int m = sc.nextInt();

            try {
                YearMonth ym = YearMonth.of(y, m);

                LocalDate last = ym.atEndOfMonth();

                LocalDate fri = last.with(
                        TemporalAdjusters.previousOrSame(
                                DayOfWeek.FRIDAY));

                System.out.println("Last Friday: " + fri);

            } catch (DateTimeException e) {
                System.out.println("Invalid year or month.");
            }
        }
    }
}