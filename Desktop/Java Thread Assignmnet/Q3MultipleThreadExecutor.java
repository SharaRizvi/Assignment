import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    int threadId;
    Task(int threadId){
        this.threadId=threadId;
    }
    @Override
    public void run() {
        System.out.println("Thread started: "+threadId);
        System.out.println("Thread Id:"+threadId+" Thread name: "+Thread.currentThread().getName());
        System.out.println("Thread ended: "+threadId);
    }
}
public class Q3MultipleThreadExecutor {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        ExecutorService executorService= Executors.newCachedThreadPool();//Multiple Thread Executor
        //CachedThreadPool uses threads that are no longer in use. so, we observe thread reusability in the output
        for(int i=1;i<=10;i++){
            executorService.submit(new Task(i));
        }
        System.out.println("Main thread has finished executing");
    }
}
