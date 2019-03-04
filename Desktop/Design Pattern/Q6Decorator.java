import java.util.List;
import java.util.ArrayList;

enum PizzaSize{SMALL, MEDIUM, LARGE}
enum PizzaType{VEG, NONVEG}
enum PizzaToppings{CHEEZE, VEGGIES, }
class Pizza{
    PizzaSize pizzaSize;
    PizzaType pizzaType;
    Pizza(PizzaSize pizzaSize, PizzaType pizzaType){
        this.pizzaSize=pizzaSize;
        this.pizzaType=pizzaType;
    }

    @Override
    public String toString() {
        return "Pizza{PizzaSize: "+pizzaSize+",PizzaType: "+pizzaType+"}";
    }
}

class PizzaWithToppings extends Pizza{
    List<PizzaToppings> pizzaToppings;
    PizzaWithToppings(PizzaSize pizzaSize, PizzaType pizzaType, List<PizzaToppings> pizzaToppings){
        super(pizzaSize,pizzaType);
        this.pizzaToppings=pizzaToppings;
    }

    @Override
    public String toString() {
        return "Pizza{PizzaSize: "+pizzaSize+",PizzaType: "+pizzaType+",PizzaToppings: "+pizzaToppings+"}";
    }
}

public class Q6Decorator {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza(PizzaSize.MEDIUM, PizzaType.VEG);
        System.out.println(myPizza);
        List<PizzaToppings> pizzaToppings = new ArrayList<>();
        pizzaToppings.add(PizzaToppings.VEGGIES);
        pizzaToppings.add(PizzaToppings.CHEEZE);
        myPizza = new PizzaWithToppings(PizzaSize.LARGE, PizzaType.NONVEG, pizzaToppings);
        System.out.println(myPizza);
    }
}
