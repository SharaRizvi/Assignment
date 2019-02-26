import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q5isShutDownAndIsTerminated {
    public static void main(String[] args) {
        ExecutorService executorService1= Executors.newSingleThreadExecutor();
        try{
            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1 -> Task 1");
                }
            });
            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1 -> Task 2");
                }
            });
            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1 -> Task 3");
                }
            });
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            executorService1.shutdown();
        }
        ExecutorService executorService2= Executors.newSingleThreadExecutor();
        try{
            executorService2.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 2 -> Task 1");
                }
            });
            executorService2.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 2 -> Task 2");
                }
            });
            executorService2.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 2 -> Task 3");
                }
            });
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            executorService2.shutdownNow();
        }

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ExecutorService 1 with Shutdown:");
        System.out.println("\tisShutdown(): "+executorService1.isShutdown());
        System.out.println("\tisTerminated(): "+executorService1.isTerminated());
        System.out.println("\n\nExecutorService 2 with ShutdownNow:");
        System.out.println("\tisShutdown(): "+executorService2.isShutdown());
        System.out.println("\tisTerminated(): "+executorService2.isTerminated());
    }
}
