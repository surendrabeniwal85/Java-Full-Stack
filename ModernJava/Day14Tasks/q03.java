package ModernJava.Day14Tasks;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

//meeting time zone converter

public class q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter meeting year : ");
        int y = sc.nextInt();

        System.out.print("Enter meeting month : ");
        int m = sc.nextInt();

        System.out.print("Enter meeting day : ");
        int d = sc.nextInt();

        System.out.print("Enter hour : ");
        int h = sc.nextInt();

        System.out.print("Enter minute : ");
        int min = sc.nextInt();

        try {
            LocalDateTime dt = LocalDateTime.of(y, m, d, h, min);

            ZonedDateTime india = dt.atZone(
                    ZoneId.of("Asia/Kolkata"));

            ZonedDateTime usa = india.withZoneSameInstant(
                    ZoneId.of("America/New_York"));

            ZonedDateTime uk = india.withZoneSameInstant(
                    ZoneId.of("Europe/London"));

            System.out.println("\nIndia : " + india);
            System.out.println("New York : " + usa);
            System.out.println("London : " + uk);

        } catch (Exception e) {
            System.out.println("Invalid date or time.");
        }

        sc.close();
    }
}
