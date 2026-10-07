package ModernJava.Day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//java single thread pool example

public class a05 {
    public static void main(String[] args) {

        //Create single thread pool
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        //Submit task 1
        executor.submit(() -> {
            System.out.println(
                "Task 1 executed by : "
                   +Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

            System.out.println("Task 1 completed...");
        });

        //Submit task 2
        executor.submit(() -> {
            System.out.println(
                "Task 2 executed by : "
                   +Thread.currentThread().getName());

            System.out.println("Task 2 completed...");
        });

        //Submit task 3
        executor.submit(() -> {
            System.out.println(
                "Task 3 executed by : "
                   +Thread.currentThread().getName());

            System.out.println("Task 3 completed...");
        });

        executor.shutdown();
    }
}
