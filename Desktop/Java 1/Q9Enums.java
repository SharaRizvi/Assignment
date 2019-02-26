import java.util.EnumSet;

enum House{
    _1BHK(300000),_2BHK(5000000), _3BHK(10000000),_4BHK(15000000);
    double price;
    private House(double price){
        this.price=price;
        System.out.println("Setting house--->"+this.toString()+" Rs."+String.format("%.2f",this.price));
    }

    public void getPrice() {
        System.out.println(this.toString()+" Rs."+String.format("%.2f",this.price));
    }
}
public class Q9Enums {
    public static void main(String[] args) {
        House h[]=new House[4];
        h[0]=House._1BHK;
        h[1]=House._2BHK;
        h[2]=House._3BHK;
        h[3]=House._4BHK;
        System.out.println("Iterating on all house elements: ");
        for(House house:h){
            house.getPrice();
        }
    }
}
