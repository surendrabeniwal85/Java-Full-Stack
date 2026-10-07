package ModernJava.Day15Tasks;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Future with runnable and predefined result

public class q03 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter employee name: ");
            String n = sc.nextLine();

            System.out.print("Enter employee ID: ");
            int id = sc.nextInt();

            if (id < 0) {
                System.out.println("Employee ID cannot be negative.");
                return;
            }

            ExecutorService ex = Executors.newSingleThreadExecutor();

            try {
                Runnable task = () -> {
                    try {
                        System.out.println("\nProcessing employee: " + n);

                        Thread.sleep(3000);

                        System.out.println(
                                "Employee record processing completed.");

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Processing interrupted.");
                    }
                };

                Future<String> f = ex.submit(
                        task,
                        "Employee Processed Successfully");

                System.out.println("Employee ID: " + id);
                System.out.println("Waiting for task to complete...");

                String result = f.get();

                System.out.println("Result: " + result);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Main task was interrupted.");

            } catch (Exception e) {
                System.out.println("Error while processing employee.");

            } finally {
                ex.shutdown();
            }
        }
    }
}
