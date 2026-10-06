package ModernJava.Day14Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// Student exam schedule

public class q02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter exam date (dd/MM/yyyy): ");
            String s = sc.nextLine();

            try {
                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu")
                        .withResolverStyle(ResolverStyle.STRICT);

                LocalDate ed = LocalDate.parse(s, f);
                LocalDate now = LocalDate.now();

                System.out.println("\nExam Date: " + ed);
                System.out.println("Day: " + ed.getDayOfWeek());
                System.out.println("Leap Year: " + ed.isLeapYear());

                if (ed.isBefore(now)) {
                    System.out.println("The exam has already passed.");
                } else if (ed.isEqual(now)) {
                    System.out.println("The exam is today!");
                } else {
                    long days = ChronoUnit.DAYS.between(now, ed);
                    System.out.println("Days remaining: " + days);
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Use dd/MM/yyyy.");
            }
        }
    }
}

