import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Q7WaitForTasks {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->{
            try {
                Thread.sleep(1000L);
                System.out.println("Thread 1 Task 1 Running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.submit(()->{
            try {
                Thread.sleep(1000L);
                System.out.println("Thread 1 Task 2 Running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.submit(()->{
            try {
                Thread.sleep(1000L);
                System.out.println("Thread 1 Task 3 Running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
        try {
            executorService.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(executorService.isTerminated()){
            System.out.println("Terminated");
        }else{
            System.out.println("One or more tasks still remaining");
        }
    }
}
