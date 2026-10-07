package ModernJava.Day14Tasks;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

// Subscription expiry checker

public class q10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter customer name: ");
            String n = sc.nextLine();

            System.out.print("Enter start date (dd/MM/yyyy): ");
            String s = sc.nextLine();

            System.out.print("Enter duration in months: ");
            int mon = sc.nextInt();

            if (mon < 0) {
                System.out.println("Duration cannot be negative.");
                return;
            }

            try {
                DateTimeFormatter f = DateTimeFormatter
                        .ofPattern("dd/MM/uuuu")
                        .withResolverStyle(ResolverStyle.STRICT);

                LocalDate st = LocalDate.parse(s, f);
                Period p = Period.ofMonths(mon);
                LocalDate ex = st.plus(p);
                LocalDate now = LocalDate.now();

                System.out.println("\nCustomer: " + n);
                System.out.println("Start Date: " + st);
                System.out.println("Expiry Date: " + ex);

                if (now.isBefore(ex)) {
                    System.out.println("Subscription is active.");
                } else if (now.isEqual(ex)) {
                    System.out.println("Subscription is expiring today.");
                } else {
                    System.out.println("Subscription is expired.");
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Use dd/MM/yyyy.");
            }
        }
    }
}