package ModernJava.Day14Tasks;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

// Training session duration

public class q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start hour : ");
        int sh = sc.nextInt();

        System.out.print("Enter start minute : ");
        int sm = sc.nextInt();

        System.out.print("Enter end hour : ");
        int eh = sc.nextInt();

        System.out.print("Enter end minute : ");
        int em = sc.nextInt();

        try {
            LocalTime st = LocalTime.of(sh, sm);
            LocalTime et = LocalTime.of(eh, em);

            if (et.isBefore(st)) {
                System.out.println("End time cannot be before start time.");
                return;
            }

            Duration d = Duration.between(st, et);

            long min = d.toMinutes();
            long hr = min / 60;
            long rem = min % 60;

            System.out.println("Training Duration : " + hr
                    + " hours " + rem + " minutes");

        } catch (Exception e) {
            System.out.println("Invalid time.");
        }

        sc.close();
    }
}