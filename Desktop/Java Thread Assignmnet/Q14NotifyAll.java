public class Q14NotifyAll {
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
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 done!");
        }
    }
    void worker3(){
        synchronized (this){
            System.out.println("Worker 3 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 3 done!");
        }
    }
    void worker4(){
        synchronized (this){
            System.out.println("Worker 4 started");
            notifyAll();
            System.out.println("Worker 4 done!");
        }
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
