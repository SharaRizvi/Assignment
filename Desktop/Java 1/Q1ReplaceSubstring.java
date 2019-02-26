import java.util.Scanner;

public class Q1ReplaceSubstring {
    public static void main(String[] args){
        StringBuffer str;
        String substr,replace_str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        str=new StringBuffer(sc.nextLine());
        System.out.print("Enter a sub string: ");
        substr=new String(sc.nextLine());
        System.out.print("Enter a string to replace sub string: ");
        replace_str=new String(sc.nextLine());
        str.replace(str.indexOf(substr),str.indexOf(substr)+substr.length(),replace_str);
        System.out.println("Altered string: "+str);
    }
}
