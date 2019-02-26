import java.util.ArrayList;
import java.util.Scanner;

public class Q5CommonArrayElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1=new ArrayList<>();
        ArrayList<Integer> arrList2=new ArrayList<>();
        ArrayList<Integer> commonElements;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1:");
        System.out.print("Enter number of elements:");
        int arrLen1=sc.nextInt();
        for(int i=0;i<arrLen1;i++){
            arrList1.add(sc.nextInt());
        }
        System.out.println("Enter array 2:");
        System.out.print("Enter number of elements:");
        int arrLen2=sc.nextInt();
        for(int i=0;i<arrLen1;i++){
            arrList2.add(sc.nextInt());
        }
        if(arrLen1<arrLen2){
            commonElements=findCommonElements(arrList1,arrList2);
        }
        else{
            commonElements=findCommonElements(arrList2,arrList1);
        }
        System.out.println("Common elements are:");
        for(int i=0;i<commonElements.size();i++){
            System.out.print(commonElements.get(i)+" ");
        }
    }
    static ArrayList<Integer> findCommonElements(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        ArrayList<Integer> commonElements=new ArrayList<>();
        for(int i=0;i<arr1.size();i++){
            Integer arrElement=arr1.get(i);
            if(arr2.contains(arrElement))
                commonElements.add(arrElement);
        }
        return commonElements;
    }
}
