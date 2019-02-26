import java.util.concurrent.*;

public class Q6Fututre {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<String> stringFuture=executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Thread 1 -> Task 1";
            }
        });
        executorService.shutdownNow();
        if(stringFuture.isDone()){
            try {
                System.out.println(stringFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        if(stringFuture.isCancelled()){
            System.out.println("Your task has been cancelled");
        }
    }
}
