import java.util.Scanner;

public class Q8ReverseRemoveString {
    public static void main(String[] args) {
        StringBuffer str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = new StringBuffer(sc.nextLine());
        str=str.reverse();
        System.out.println("Reversed String: "+str);
        str.replace(4,10,"");//end index is not included
        System.out.println("String removed from index 4 to index 9: "+str);
    }
}
