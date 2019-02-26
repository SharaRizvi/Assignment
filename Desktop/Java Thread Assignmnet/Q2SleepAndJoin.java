public class Q2SleepAndJoin {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        ThreadDemo thread1=new ThreadDemo();//Using class of Q1
        thread1.start();
        ThreadDemo thread2=new ThreadDemo();
        thread2.start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread has finished executing after join of Thread1 and Thread2");
    }
}
