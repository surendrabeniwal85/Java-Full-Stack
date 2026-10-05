package ModernJava.Day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Thread //Pool 2

public class a03 {
    public static void main(String[] args) throws Exception {

        //Create thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //Submit Callable task
        Future<Integer> f1 = executor.submit(() -> {

            try{
                System.out.println("Task started...");

                //Simulate a time consuming task
                Thread.sleep(10000);

                System.out.println("Task Completed...");
            } catch (InterruptedException e){

                Thread.currentThread().interrupt();
                System.out.println("Task Interrupted...");
            }

            return 10;
        });

        //Get result from future
        System.out.println("Waiting for result...");
        System.out.println("Result : " + f1.get());

        executor.shutdown();
    }
}
