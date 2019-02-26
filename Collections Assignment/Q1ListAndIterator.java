import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q1ListAndIterator {

    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        List<Float> floatList=new ArrayList<>(5);
        for(int i=0;i<5;i++){
            System.out.print("Enter a float number: ");
            floatList.add(sc.nextFloat());
        }
        Float sum=new Float(0);
        Iterator<Float> listIterator=floatList.iterator();
        while (listIterator.hasNext()){
            sum+=listIterator.next();
        }
        System.out.println("Sum of numbers is: "+sum);
    }
}
