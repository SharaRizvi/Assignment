class DemoClass{
    int count=0;
    void incrementCount(){
        count++;
    }
    void adder1(){
        for (int i=0;i<10000;i++){
            incrementCount();
        }
    }
    void adder2(){
        for (int i=0;i<10000;i++){
            incrementCount();
        }
    }
}
class SynchronisedClass{
    int count=0;
    synchronized void incrementCount(){
        count++;
    }
    void adder1(){
        for (int i=0;i<10000;i++){
            incrementCount();
        }
    }
    void adder2(){
        for (int i=0;i<10000;i++){
            incrementCount();
        }
    }
}
public class Q10SynchroniseMethods {
    public static void main(String[] args) {
        DemoClass demoObject=new DemoClass();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                demoObject.adder1();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                demoObject.adder2();
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
        System.out.println("Threads without synchronised method incremented count to: "+demoObject.count);
        SynchronisedClass synchronisedObject=new SynchronisedClass();
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronisedObject.adder1();
            }
        });
        Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronisedObject.adder2();
            }
        });
        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads with synchronised method incremented count to: "+synchronisedObject.count);
    }
}
