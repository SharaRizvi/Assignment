import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

class Customer{
    Double amount;
    boolean orderCollected;

    void placeOrder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cash for your drink: ");
        amount=sc.nextDouble();
        orderCollected=false;
    }
    void collectOrder(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        orderCollected=true;
    }
}

class Cashier{
    static Double totalSale=0.0;
    static int token=0;
    int takeOrder(Double cash){
        totalSale+=cash;
        return ++token;
    }
}

class Barista{
    boolean prepareOrder(){
        return true;
    }
    void takesOrder(){
        prepareOrder();
        notify();
        takesOrder();
    }
}

class CoffeeShop{
    static Cashier cashier=new Cashier();
    static Barista barista=new Barista();
    Queue ordersWaiting=new ArrayBlockingQueue<Integer>(1);
    Customer customer;
    void newCustomer(){
        customer = new Customer();
        customer.placeOrder();
        ordersWaiting.add(cashier.takeOrder(customer.amount));
        completeOrders();
        customer.collectOrder();
    }
    void completeOrders(){
        barista.takesOrder();
        ordersWaiting.remove();
        while (!ordersWaiting.isEmpty()){
            completeOrders();
        }

    }
}

public class Q10CoffeeShop {

}
