
interface Interface1{
    default void display(){
        System.out.println("Default method of Interface1 called");
    }
}

interface Interface2{
    default void display(){
        System.out.println("Default method of Interface2 called");
    }
}

class Child implements Interface1,Interface2{
    @Override
    public void display() {
        System.out.println("Inside display of Child");
        Interface1.super.display();
        Interface2.super.display();
        System.out.println("End of display of Child");
    }
}

public class Q8MultipleInheritanceWithDefaultInterfaces {

    public static void main(String[] args) {
        Child obj=new Child();
        obj.display();
    }
}
