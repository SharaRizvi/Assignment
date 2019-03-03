interface Furniture{
    boolean stressTest();
    boolean fireTest();
}

enum Material{Metal,Wooden}

enum Type{Chair,Table}

interface MetalFurniture extends Furniture{
    Material material=Material.Metal;
}

interface WoodenFurniture extends Furniture{
    Material material=Material.Wooden;
}

interface Chair extends Furniture{
    Type type=Type.Chair;
}

interface Table extends Furniture{
    Type type=Type.Table;
}

class WoodenChair implements WoodenFurniture, Chair{
    @Override
    public boolean stressTest() {
        return true;
    }

    @Override
    public boolean fireTest() {
        return false;
    }

    @Override
    public String toString() {
        return "Type: Chair, Material: Wooden, stressTest(): "+stressTest()+", fireTest(): "+fireTest();
    }
}

class MetalChair implements MetalFurniture, Chair{
    @Override
    public boolean stressTest() {
        return true;
    }

    @Override
    public boolean fireTest() {
        return true;
    }

    @Override
    public String toString() {
        return "Type: Chair, Material: Metal, stressTest(): "+stressTest()+", fireTest(): "+fireTest();
    }
}

class WoodenTable implements WoodenFurniture, Table{
    @Override
    public boolean stressTest() {
        return true;
    }

    @Override
    public boolean fireTest() {
        return false;
    }
    @Override
    public String toString() {
        return "Type: Table, Material: Wooden, stressTest(): "+stressTest()+", fireTest(): "+fireTest();
    }
}

class MetalTable implements MetalFurniture, Table{
    @Override
    public boolean stressTest() {
        return true;
    }

    @Override
    public boolean fireTest() {
        return true;
    }

    @Override
    public String toString() {
        return "Type: Table, Material: Metal, stressTest(): "+stressTest()+", fireTest(): "+fireTest();
    }
}


public class Q9Furniture {
    public static void main(String[] args) {
        System.out.println("\nWooden Furniture-->\n");

        System.out.println("\tChair->");
        WoodenChair chair1=new WoodenChair();
        System.out.println("\t\t"+chair1);

        System.out.println("\tTable->");
        WoodenTable table1=new WoodenTable();
        System.out.println("\t\t"+table1);


        System.out.println("\n\nMetalFurniture-->\n");

        System.out.println("\tChair->");
        MetalChair chair2=new MetalChair();
        System.out.println("\t\t"+chair2);

        System.out.println("\tTable->");
        MetalTable table2=new MetalTable();
        System.out.println("\t\t"+table2);
    }
}
