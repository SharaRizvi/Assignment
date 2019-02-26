import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ThreadTask implements Runnable{
    String taskId;
    ThreadTask(String taskId){
        this.taskId=taskId;
    }
    @Override
    public void run() {
        System.out.println("\nTask started: "+taskId+"\n");
        System.out.println("\n"+taskId+" Thread name: "+Thread.currentThread().getName()+"\n");
        System.out.println("\nTask ended: "+taskId+"\n");
    }
}

public class Q4ShutdownAndShutdownNow{
        public static void main(String[] args) {
            System.out.println("Main thread is running");
            ExecutorService executorService1 = Executors.newSingleThreadExecutor();//single Thread Executor
            System.out.println("Executer Service 1 started with shutdown()");
            int i=1, j=1;
            try {
                for(;i<=10;i++){
                    executorService1.submit(new ThreadTask("ExecutorService: 1 Task:"+i));
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                executorService1.shutdown();
                System.out.println();
            }
            ExecutorService executorService2 = Executors.newSingleThreadExecutor();//single Thread Executor
            System.out.println("Executer Service 2 started with shutdownNow()");
            try {
                for(;j<=10;j++){
                    executorService2.submit(new ThreadTask("ExecutorService: 2 Task:"+j));
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                executorService2.shutdownNow();
                System.out.println();
                }
            System.out.println("Main thread has finished executing. As you can see, Executer Service 2 with shutdownNow() only executed few tasks while Executer Service with shutdown() executed all its task.");
        }
}
