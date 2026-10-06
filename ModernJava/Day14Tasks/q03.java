package ModernJava.Day14Tasks;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

// Meeting time zone converter

public class q03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter meeting date and time (dd/MM/yyyy HH:mm): ");
            String s = sc.nextLine();

            try {
                DateTimeFormatter f = DateTimeFormatter
                        .ofPattern("dd/MM/uuuu HH:mm")
                        .withResolverStyle(ResolverStyle.STRICT);

                LocalDateTime dt = LocalDateTime.parse(s, f);

                ZonedDateTime india = dt.atZone(
                        ZoneId.of("Asia/Kolkata"));

                ZonedDateTime ny = india.withZoneSameInstant(
                        ZoneId.of("America/New_York"));

                ZonedDateTime london = india.withZoneSameInstant(
                        ZoneId.of("Europe/London"));

                System.out.println("\nIndia: " + india);
                System.out.println("New York: " + ny);
                System.out.println("London: " + london);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date/time. Use dd/MM/yyyy HH:mm.");
            }
        }
    }
}
