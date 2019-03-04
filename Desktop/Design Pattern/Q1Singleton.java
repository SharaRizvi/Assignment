class Singleton{
    private static final Singleton singletoninstance=new Singleton();
    public static int count=0;
    private Integer x;
    private Singleton(){

    }
    public static Singleton getInstance(){
        count++;
        return singletoninstance;
    }
    public Integer getX(){
        return x;
    }
    public void setX(Integer x){
        this.x=x;
    }

    @Override
    public String toString() {
        return "Singleton:"+count+" x="+x+", hascode:"+this.hashCode();
    }
}
public class Q1Singleton {
    public static void main(String[] args) {
        Singleton singletonInstance1=Singleton.getInstance();
        singletonInstance1.setX(10);
        System.out.println(singletonInstance1);
        Singleton singletonInstance2=Singleton.getInstance();
        singletonInstance2.setX(20);
        System.out.println(singletonInstance2);
        System.out.println("If hashcodes are same, you are getting reference of only one object!");
    }
}
