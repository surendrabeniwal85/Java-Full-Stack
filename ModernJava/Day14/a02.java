package ModernJava.Day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Thread //Pool 1

public class a02 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        // ExecutorService - class
        // executor - Reference var

        // Number of Task is 5
        for(int i = 1; i <=5 ; i++){
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is performed by " + Thread.currentThread());
            });
        } 
    }
}
