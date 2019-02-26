import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q6FindSingleNonRepeatingElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of array:");
        int arrLen1=sc.nextInt();
        System.out.println("Enter array with every element repeated twice except one:");
        arrList.add(sc.nextInt());
        int res=arrList.get(0);
        Collections.sort(arrList);
        for(int i=1;i<arrLen1;i++){
            arrList.add(sc.nextInt());
            res^=arrList.get(i);
        }
        System.out.println("Uncommon element is: "+res);
    }
}