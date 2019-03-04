interface DefaultStaticInterface{
    default void defaultDispaly(){
        System.out.println("default display is called");
    }
    static void staticDisplay(){
        System.out.println("static display is called");
    }
}
class Implementor implements DefaultStaticInterface{

}
public class Q6DefaultAndStaticMethodsOfInterface {
    public static void main(String[] args) {
        DefaultStaticInterface defaultStaticInterface=new Implementor();
        defaultStaticInterface.defaultDispaly();//default method of interface is called
        DefaultStaticInterface.staticDisplay();//sttaic method of interface is called
    }
}
