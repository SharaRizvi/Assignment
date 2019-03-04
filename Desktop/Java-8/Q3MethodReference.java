@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}
public class Q3MethodReference {
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
    static int multiply(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("a= 10, b=20");

        //Instance method reference
        Calculator calculator=new Q3MethodReference()::add;
        System.out.println("Adding: "+calculator.calculate(10,20));
        calculator=new Q3MethodReference()::subtract;
        System.out.println("Subtracting: "+calculator.calculate(10,20));

        //Static method reference
        calculator=Q3MethodReference::multiply;
        System.out.println("Multiplying: "+calculator.calculate(10,20));
    }
}
