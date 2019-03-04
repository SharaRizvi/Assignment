abstract class Drawing{
    protected Drawer drawer1;
    protected Drawer drawer2;
    protected Drawing(Drawer drawer1,Drawer drawer2){
        this.drawer1=drawer1;
        this.drawer2=drawer2;
    }
    public abstract void paint();
}


class Objects extends Drawing{
    Objects(Drawer drawer1,Drawer drawer2){
        super(drawer1,drawer2);
    }
    @Override
    public void paint() {
        System.out.println("Creating Object-->");
        drawer1.draw();
        drawer2.draw();
    }
}


interface Drawer{
    void draw();
}

class Color implements Drawer{
    String color;
    Color(String color){
        this.color=color;
    }
    @Override
    public void draw() {
        System.out.println("\tColoring with color: "+color);
    }
}

class Shape implements Drawer{
    String shape;
    Shape(String shape){
        this.shape=shape;
    }
    @Override
    public void draw() {
        System.out.println("\tCreating shape: "+shape);
    }
}

public class Q5BridgeDesign {
    public static void main(String[] args) {
        Objects obj1=new Objects(new Color("Blue"),new Shape("Rectangle"));
        obj1.paint();
    }
}
