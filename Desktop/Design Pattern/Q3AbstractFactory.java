enum CarType {
    MICRO, MINI, LUXURY;
}
abstract class Car{
    CarType carType;
    String location;
    Car(CarType carType, String location){
        this.carType=carType;
        this.location=location;
    }
}

class MicroCar extends Car{
    MicroCar(String location){
        super(CarType.MICRO,location);
    }

    @Override
    public String toString() {
        return "Car Type: MICRO, Location: "+location;
    }
}

class MiniCar extends Car{
    MiniCar(String location){
        super(CarType.MINI,location);
    }

    @Override
    public String toString() {
        return "Car Type: MINI, Location: "+location;
    }
}

class LuxuryCar extends Car{
    LuxuryCar(String location){
        super(CarType.LUXURY,location);
    }

    @Override
    public String toString() {
        return "Car Type: LUXURY, Location: "+location;
    }
}

class CarFactory{
    Car car;
    public Car getCar(String type,String location){
        setCar(type,location);
        return car;
    }
    public void setCar(String type,String location){
        switch (type){
            case "MICRO":
                car=new MicroCar(location);
                break;
            case "MINI":
                car=new MiniCar(location);
                break;
            case "LUXURY":
                car=new LuxuryCar(location);
                break;
        }
    }
}

class IndianCarFactory{
    private static CarFactory carFactory=new CarFactory();
    public static Car getIndianCar(String type){
        return carFactory.getCar(type,"India");
    }
}
class USACarFactory{
    private static CarFactory carFactory=new CarFactory();
    public static Car getUSACar(String type){
        return carFactory.getCar(type,"USA");
    }
}
class AustraliaCarFactory{
    private static CarFactory carFactory=new CarFactory();
    public static Car getAustralianCar(String type){
        return carFactory.getCar(type,"Australia");
    }
}

public class Q3AbstractFactory {
    public static void main(String[] args) {
        MiniCar miniCar=(MiniCar) IndianCarFactory.getIndianCar("MINI");
        MicroCar microCar=(MicroCar) USACarFactory.getUSACar("MICRO");
        LuxuryCar luxuryCar=(LuxuryCar) AustraliaCarFactory.getAustralianCar("LUXURY");
        System.out.println(miniCar);
        System.out.println(microCar);
        System.out.println(luxuryCar);
    }
}
