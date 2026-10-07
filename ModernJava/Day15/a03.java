package ModernJava.Day15;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Fixed thread pool with callable and future

public class a03 {
    public static void main(String[] args) throws Exception{
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<Integer> task1 = () -> {
            Thread.sleep(2000);
            return 10;
        };

        Callable<Integer> task2 = () -> {
            Thread.sleep(1000);
            return 20;
        };

        Callable<Integer> task3 = () -> {
            Thread.sleep(5000);
            return 30;
        };

        Future<Integer> f1 = executor.submit(task1); 
        Future<Integer> f2 = executor.submit(task2);
        Future<Integer> f3 = executor.submit(task3);

        System.out.println("Result 1 : " + f1.get());
        System.out.println("Result 2 : " + f2.get());
        System.out.println("Result 3 : " + f3.get());

        executor.shutdown();
    }
}
