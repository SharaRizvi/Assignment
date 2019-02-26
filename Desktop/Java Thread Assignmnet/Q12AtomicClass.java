import java.util.concurrent.atomic.AtomicInteger;

public class Q12AtomicClass{
    AtomicInteger count;//use of Atomic class whicj is synchronised
    Q12AtomicClass(){
        count=new AtomicInteger();
    }
    void add(){
        for(int i=0;i<1000;i++){
            count.addAndGet(1);
        }
    }
    public static void main(String[] args) {
        Q12AtomicClass obj1=new Q12AtomicClass();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.add();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                obj1.add();
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
        System.out.println("Increment of 2000 done by two threads using synchronised block results in: "+obj1.count);
    }
}
