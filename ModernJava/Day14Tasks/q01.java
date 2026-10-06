package ModernJava.Day14Tasks;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// Employee joining date analysis

public class q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name : ");
        String n = sc.nextLine();

        System.out.print("Enter joining year : ");
        int y = sc.nextInt();

        System.out.print("Enter joining month : ");
        int m = sc.nextInt();

        System.out.print("Enter joining day : ");
        int d = sc.nextInt();

        LocalDate jd = LocalDate.of(y, m, d);
        LocalDate now = LocalDate.now();

        if (jd.isAfter(now)) {
            System.out.println("Joining date cannot be in the future.");
            return;
        }

        Period p = Period.between(jd, now);

        System.out.println("\nEmployee : " + n);
        System.out.println("Joining Date : " + jd);
        System.out.println("Service : " + p.getYears() + " years, "
                + p.getMonths() + " months, " + p.getDays() + " days");

        sc.close();
    }
}
