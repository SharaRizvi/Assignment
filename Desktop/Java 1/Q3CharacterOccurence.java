import java.util.Scanner;

public class Q3CharacterOccurence {
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        System.out.print("Enter a character to find it's occurence: ");
        String ch=sc.next();
        String newStr=str.replaceAll(ch,"");
        int occ=str.length()-newStr.length();
        System.out.println("Number of occurrences of "+ch+" is "+occ);
    }
}
