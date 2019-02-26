public class Q11SynchronisedBlock {
    int count;
    Q11SynchronisedBlock(){
        count=0;
    }
    void add(){
        for(int i=0;i<1000;i++){
            synchronized (this){
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Q11SynchronisedBlock obj1=new Q11SynchronisedBlock();
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
