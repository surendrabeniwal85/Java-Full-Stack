package ModernJava.Day14Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

// Date formatting and parsing

public class q06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter date (dd/MM/yyyy): ");
            String s = sc.nextLine();

            try {
                DateTimeFormatter f1 = DateTimeFormatter
                        .ofPattern("dd/MM/uuuu")
                        .withResolverStyle(ResolverStyle.STRICT);

                LocalDate dt = LocalDate.parse(s, f1);

                DateTimeFormatter f2 =
                        DateTimeFormatter.ofPattern("dd-MM-yyyy");

                DateTimeFormatter f3 =
                        DateTimeFormatter.ofPattern("MMMM dd, yyyy");

                DateTimeFormatter f4 =
                        DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

                System.out.println("\n" + dt.format(f2));
                System.out.println(dt.format(f3));
                System.out.println(dt.format(f4));

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Use dd/MM/yyyy.");
            }
        }
    }
}
