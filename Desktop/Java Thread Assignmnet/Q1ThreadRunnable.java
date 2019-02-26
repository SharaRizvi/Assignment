class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("RunnableDemo Interface thread is running");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RunnableDemo Interface thread has finished executing");
    }
}
class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("ThreadDemo Class thread is running");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadDemo Class thread has finished executing");
    }
}
public class Q1ThreadRunnable {
    public static void main(String[] args){
        new Thread(new RunnableDemo()).start();
        new ThreadDemo().start();
    }
}
