package ModernJava.Day15Tasks;

import java.time.Year;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Employee salary calculation using callable and future

public class q01 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter employee name: ");
            String n = sc.nextLine();

            System.out.print("Enter monthly salary: ");
            int sal = sc.nextInt();

            System.out.print("Enter year: ");
            int yr = sc.nextInt();

            if (sal < 0 || yr < 1) {
                System.out.println("Invalid salary or year.");
                return;
            }

            int[] leave = new int[12];

            System.out.println("\nEnter leave days for each month:");

            for (int i = 0; i < 12; i++) {
                System.out.print("Month " + (i + 1) + ": ");
                leave[i] = sc.nextInt();

                if (leave[i] < 0) {
                    System.out.println("Leave cannot be negative.");
                    return;
                }
            }

            Callable<Integer> task = () -> {
                int total = 0;

                int[] days = {
                    31, 28, 31, 30, 31, 30,
                    31, 31, 30, 31, 30, 31
                };

                if (Year.isLeap(yr)) {
                    days[1] = 29;
                }

                for (int i = 0; i < 12; i++) {

                    if (leave[i] > days[i]) {
                        throw new IllegalArgumentException(
                                "Leave days cannot exceed days in month " + (i + 1));
                    }

                    Thread.sleep(5000);

                    double perDay = (double) sal / days[i];
                    double cut = perDay * leave[i];
                    int net = (int) Math.round(sal - cut);

                    total += net;

                    System.out.println(
                            "Month " + (i + 1)
                            + " | Days: " + days[i]
                            + " | Salary: Rs." + sal
                            + " | Leave: " + leave[i]
                            + " | Net: Rs." + net);
                }

                return total;
            };

            ExecutorService ex = Executors.newSingleThreadExecutor();

            try {
                Future<Integer> f = ex.submit(task);

                System.out.println("\nProcessing salary...");
                int total = f.get();

                System.out.println("\nEmployee: " + n);
                System.out.println("Annual Salary after leave deduction: Rs. " + total);

            } catch (Exception e) {
                System.out.println("Salary processing failed: "
                        + e.getMessage());
            } finally {
                ex.shutdown();
            }
        }
    }
}
