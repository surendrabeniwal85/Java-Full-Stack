package ModernJava.Day15;

//Java Cached Thread Pool Example

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class a04 {
    public static void main(String[] args) {
        
        //Create cached thread pool
        ExecutorService executor = Executors.newCachedThreadPool();

        //Submit 10 tasks
        for(int i = 1; i <= 10; i++){

            int taskNumber = i;

            executor.submit(() -> {

                System.out.println(
                    "Task " + taskNumber +
                    " executed by " + 
                    Thread.currentThread().getName());

                try{
                    Thread.sleep(7000);
                } catch(InterruptedException e){
                    Thread.currentThread().getName();
                }
            });
        }

        //Shutdown executor
        executor.shutdown();
    }
}
