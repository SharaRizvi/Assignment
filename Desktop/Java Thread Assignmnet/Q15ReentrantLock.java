import java.util.concurrent.locks.ReentrantLock;

public class Q15ReentrantLock {
    ReentrantLock lock=new ReentrantLock();
    void worker1(){
            lock.lock();
            System.out.println("Worker 1 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 1 done!");
            lock.unlock();
    }
    void worker2(){
            lock.lock();
            System.out.println("Worker 2 started");
            try {
                Thread.sleep(1000L);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 done!");
            lock.unlock();
    }
    void worker3(){
            lock.lock();
            System.out.println("Worker 3 started");

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            notify();
            System.out.println("Worker 3 done!");
            lock.unlock();
    }
    void worker4(){
            lock.lock();
            System.out.println("Worker 4 started");
            notifyAll();
            System.out.println("Worker 4 done!");
            lock.unlock();
    }
    public static void main(String[] args) {
        Q14NotifyAll obj1=new Q14NotifyAll();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.worker2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.worker3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.worker4();
            }
        }).start();
        System.out.println("Main ended");
    }
}
