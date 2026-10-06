package ModernJava.Day14Tasks;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//employee age calculator

public class q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name : ");
        String n = sc.nextLine();

        System.out.print("Enter birth year : ");
        int y = sc.nextInt();

        System.out.print("Enter birth month : ");
        int m = sc.nextInt();

        System.out.print("Enter birth day : ");
        int d = sc.nextInt();

        try {
            LocalDate dob = LocalDate.of(y, m, d);
            LocalDate now = LocalDate.now();

            if (dob.isAfter(now)) {
                System.out.println("Birth date cannot be in the future.");
                return;
            }

            Period p = Period.between(dob, now);

            System.out.println("\nEmployee : " + n);
            System.out.println("Age : " + p.getYears() + " years, "
                    + p.getMonths() + " months, "
                    + p.getDays() + " days");

        } catch (Exception e) {
            System.out.println("Invalid date.");
        }

        sc.close();
    }
}
