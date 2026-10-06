package ModernJava.Day14Tasks;

// student exam schedule

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter exam year : ");
        int y = sc.nextInt();

        System.out.print("Enter exam month : ");
        int m = sc.nextInt();

        System.out.print("Enter exam day : ");
        int d = sc.nextInt();

        try {
            LocalDate ed = LocalDate.of(y, m, d);
            LocalDate now = LocalDate.now();

            System.out.println("\nExam Date : " + ed);
            System.out.println("Day : " + ed.getDayOfWeek());
            System.out.println("Leap Year : " + ed.isLeapYear());

            if (ed.isBefore(now)) {
                System.out.println("Exam has already passed.");
            } else {
                long days = ChronoUnit.DAYS.between(now, ed);
                System.out.println("Days remaining : " + days);
            }
        } catch (Exception e) {
            System.out.println("Invalid date.");
        }

        sc.close();
    }
}
