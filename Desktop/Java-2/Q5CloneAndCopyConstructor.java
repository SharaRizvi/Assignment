class cloneObject implements Cloneable{
    Integer x;
    cloneObject(Integer x){
        this.x=x;
    }

    cloneObject(cloneObject o1){
        this.x=o1.x;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return x.toString();
    }
}
public class Q5CloneAndCopyConstructor {
    public static void main(String[] args) {
        cloneObject obj1=new cloneObject(10);
        cloneObject obj2;
        try {
            System.out.println("obj1: "+obj1);
            obj2=(cloneObject) obj1.clone();
            System.out.println("Cloned Object obj2: "+obj2);

        } catch (CloneNotSupportedException e) {
            System.out.println("Could not clone.");
        }
        cloneObject obj3=new cloneObject(obj1);
        System.out.println("Object from copy constructor: "+obj3);
    }
}
