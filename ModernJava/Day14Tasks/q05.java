package ModernJava.Day14Tasks;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

// Training session duration

public class q05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter start time (HH:mm:ss): ");
            String s1 = sc.nextLine();

            System.out.print("Enter end time (HH:mm:ss): ");
            String s2 = sc.nextLine();

            try {
                LocalTime st = LocalTime.parse(s1);
                LocalTime et = LocalTime.parse(s2);

                if (et.isBefore(st)) {
                    System.out.println("End time cannot be before start time.");
                    return;
                }

                Duration du = Duration.between(st, et);

                long sec = du.getSeconds();
                long hr = sec / 3600;
                long min = (sec % 3600) / 60;
                long s = sec % 60;

                System.out.println("\nDuration: " + hr + " hours, "
                        + min + " minutes, " + s + " seconds");

            } catch (DateTimeParseException e) {
                System.out.println("Invalid time. Use HH:mm:ss.");
            }
        }
    }
}