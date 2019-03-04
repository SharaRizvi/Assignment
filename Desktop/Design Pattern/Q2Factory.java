@FunctionalInterface
interface Polygon{
    String getPolygonInfo();
}

class Triangle implements Polygon{
    static int sides=3;
    static String name="Triangle";
    @Override
    public String getPolygonInfo() {
        return "Polygon: "+name+", Sides: "+sides;
    }
}

class Quadrilateral implements Polygon{
    static int sides=4;
    static String name="Quadrilateral";
    @Override
    public String getPolygonInfo() {
        return "Polygon: "+name+", Sides: "+sides;
    }
}

class Pentagon implements Polygon{
    static int sides=5;
    static String name="Pentagon";
    @Override
    public String getPolygonInfo() {
        return "Polygon: "+name+", Sides: "+sides;
    }
}

class PolygonFactory{
    Polygon polygon;
    public Polygon getPolygon(String type){
        setPolygon(type);
        return polygon;
    }
    public void setPolygon(String type){
        switch (type){
            case "TRIANGLE":
                polygon=new Triangle();
                break;
            case "QUADRILATERAL":
                polygon=new Quadrilateral();
                break;
            case "PENTAGON":
                polygon=new Pentagon();
        }
    }

    @Override
    public String toString() {
        return polygon.getPolygonInfo();
    }
}

public class Q2Factory {
    public static void main(String[] args) {
        PolygonFactory polygonFactory=new PolygonFactory();
        Triangle triangle=(Triangle) polygonFactory.getPolygon("TRIANGLE");
        Quadrilateral quadrilateral=(Quadrilateral) polygonFactory.getPolygon("QUADRILATERAL");
        Pentagon pentagon=(Pentagon) polygonFactory.getPolygon("PENTAGON");
        System.out.println(triangle.getPolygonInfo());
        System.out.println(quadrilateral.getPolygonInfo());
        System.out.println(pentagon.getPolygonInfo());
    }
}
