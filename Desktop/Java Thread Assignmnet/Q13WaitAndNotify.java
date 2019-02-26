public class Q13WaitAndNotify {
    void worker1(){
        synchronized (this){
            System.out.println("Worker 1 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 1 done!");
        }
    }
    void worker2(){
        synchronized (this){
            System.out.println("Worker 2 started");
            notify();
            System.out.println("Worker 2 done!");
        }
    }
    public static void main(String[] args) {
        Q13WaitAndNotify obj1=new Q13WaitAndNotify();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.worker1();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.worker2();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main ended");
    }
}
