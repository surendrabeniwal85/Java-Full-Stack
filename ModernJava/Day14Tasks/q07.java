package ModernJava.Day14Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// project deadline calculator

public class q07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter project start date (dd/MM/yyyy): ");
            String s = sc.nextLine();

            System.out.print("Enter allocated weeks: ");
            int w = sc.nextInt();

            if (w < 0) {
                System.out.println("Weeks cannot be negative.");
                return;
            }

            try {
                DateTimeFormatter f = DateTimeFormatter
                        .ofPattern("dd/MM/uuuu")
                        .withResolverStyle(ResolverStyle.STRICT);

                LocalDate st = LocalDate.parse(s, f);
                LocalDate dl = st.plusWeeks(w);
                LocalDate now = LocalDate.now();

                System.out.println("\nStart Date: " + st);
                System.out.println("Deadline: " + dl);

                if (dl.isBefore(now)) {
                    System.out.println("Deadline has passed.");
                } else if (dl.isEqual(now)) {
                    System.out.println("Deadline is today!");
                } else {
                    long days = ChronoUnit.DAYS.between(now, dl);
                    System.out.println("Days remaining: " + days);
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Use dd/MM/yyyy.");
            }
        }
    }
}
