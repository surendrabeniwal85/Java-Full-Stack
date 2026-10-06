package ModernJava.Day14Tasks;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

// Employee age calculator

public class q04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter employee name: ");
            String n = sc.nextLine();

            System.out.print("Enter date of birth (dd/MM/yyyy): ");
            String s = sc.nextLine();

            try {
                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu")
                        .withResolverStyle(ResolverStyle.STRICT);

                LocalDate dob = LocalDate.parse(s, f);
                LocalDate now = LocalDate.now();

                if (dob.isAfter(now)) {
                    System.out.println("Birth date cannot be in future.");
                    return;
                }

                Period p = Period.between(dob, now);

                System.out.println("\nEmployee: " + n);
                System.out.println("Age: " + p.getYears() + " years, "
                        + p.getMonths() + " months, "
                        + p.getDays() + " days");

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Use dd/MM/yyyy.");
            }
        }
    }
}
