package ModernJava.Day15Tasks;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Student marks analysis using multiple callable tasks

public class q02 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter marks for Group 1");
            System.out.print("Surendra: ");
            int a1 = sc.nextInt();

            System.out.print("Ayush: ");
            int a2 = sc.nextInt();

            System.out.print("Pulkit: ");
            int a3 = sc.nextInt();

            System.out.println("\nEnter marks for Group 2");
            System.out.print("Mohit: ");
            int b1 = sc.nextInt();

            System.out.print("Nitin: ");
            int b2 = sc.nextInt();

            System.out.print("Laukesh: ");
            int b3 = sc.nextInt();

            System.out.println("\nEnter marks for Group 3");
            System.out.print("Sudesh: ");
            int c1 = sc.nextInt();

            System.out.print("Rachna: ");
            int c2 = sc.nextInt();

            System.out.print("Preeti: ");
            int c3 = sc.nextInt();

            if (!valid(a1, a2, a3, b1, b2, b3, c1, c2, c3)) {
                System.out.println("Marks must be between 0 and 100.");
                return;
            }

            ExecutorService ex = Executors.newFixedThreadPool(3);

            try {
                Callable<Double> t1 = () -> {
                    Thread.sleep(2000);
                    return (a1 + a2 + a3) / 3.0;
                };

                Callable<Double> t2 = () -> {
                    Thread.sleep(2000);
                    return (b1 + b2 + b3) / 3.0;
                };

                Callable<Double> t3 = () -> {
                    Thread.sleep(2000);
                    return (c1 + c2 + c3) / 3.0;
                };

                System.out.println("\nCalculating group averages...");

                Future<Double> f1 = ex.submit(t1);
                Future<Double> f2 = ex.submit(t2);
                Future<Double> f3 = ex.submit(t3);

                System.out.println("\nGroup 1 Average: "
                        + f1.get());

                System.out.println("Group 2 Average: "
                        + f2.get());

                System.out.println("Group 3 Average: "
                        + f3.get());

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Task was interrupted.");

            } catch (Exception e) {
                System.out.println("Error while calculating marks.");

            } finally {
                ex.shutdown();
            }
        }
    }

    static boolean valid(int... m) {
        for (int x : m) {
            if (x < 0 || x > 100) {
                return false;
            }
        }

        return true;
    }
}
