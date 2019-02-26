import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyThread implements Runnable{
    static int currentTask=0;
    MyThread(){
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ++currentTask;
        System.out.println(Thread.currentThread().getName()+" Task: "+currentTask);
    }
}
public class Q9ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService1= Executors.newCachedThreadPool();
        for (int i = 0; i <= 30; i++) {
            executorService1.submit(new MyThread());
        }
        try {
            executorService1.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(executorService1.isTerminated()){
            executorService1.shutdownNow();
        }
        ExecutorService executorService2= Executors.newFixedThreadPool(4);
        for (int i = 0; i <= 30; i++) {
            executorService2.submit(new MyThread());
        }
        try {
            executorService2.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(executorService2.isTerminated()){
            executorService2.shutdownNow();
        }
    }
}
