interface DefaultInterface{
    default void defaultDisplay(){
        System.out.println("default display method of interface is called");
    }
}
class Implement implements DefaultInterface{
    @Override
    public void defaultDisplay() {
        System.out.println("default display method of implementing class is called");
    }
}

public class Q7OverrideDefaultInterfaceMethod  {
    public static void main(String[] args) {
        DefaultInterface defaultInterface=new Implement();
        defaultInterface.defaultDisplay();//default method of interface is called
    }
}
