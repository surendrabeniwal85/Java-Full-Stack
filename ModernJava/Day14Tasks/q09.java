package ModernJava.Day14Tasks;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

// Online transaction timestamp

public class q09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter customer name: ");
            String n = sc.nextLine();

            System.out.print("Enter transaction ID: ");
            String id = sc.nextLine();

            Instant now = Instant.now();

            ZonedDateTime india = now.atZone(
                    ZoneId.of("Asia/Kolkata"));

            System.out.println("\nCustomer: " + n);
            System.out.println("Transaction ID: " + id);
            System.out.println("UTC Timestamp: " + now);
            System.out.println("Indian Time: " + india);
        }
    }
}
