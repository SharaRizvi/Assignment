import java.util.ArrayList;
import java.util.Scanner;

public class Q2DuplicateWords {
    public static void main(String[] args) {
        StringBuffer str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with end mark: ");
        str = new StringBuffer(sc.nextLine());
        str.setCharAt(str.length()-1,' ');
        String[] strArr = new String(str).split(" ");
        ArrayList<String> uniquestr = new ArrayList<>();
        int[] strcount = new int[strArr.length];
        int j = 0;
        boolean containsduplicate=false;
        for (int i=0; i < strArr.length; i++) {
            if (uniquestr.contains(strArr[i])) {
                containsduplicate=true;
                int index=uniquestr.indexOf(strArr[i]);
                strcount[index]++;
            }
            else{
                uniquestr.add(strArr[i]);
                strcount[j++]=1;
            }
        }
        if(!containsduplicate){
            System.out.println("No duplicate elements.");
        }
        else {
            System.out.println("Duplicate words are: ");
            for (int i = 0; i < j; i++) {
                if (strcount[i] > 1) {
                    System.out.println(uniquestr.get(i) + " : " + strcount[i]);
                }
            }
        }
    }
}
