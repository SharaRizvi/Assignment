import java.util.Scanner;
public class Q2StringSorting{
    public static void sortString(char chars[])
    {
        for(int i=0;i<chars.length;i++)
        {
            for(int j=0;j<(chars.length)-i-1;j++)
            {   if(chars[j]>chars[j+1])
            {
                char temp=chars[j];
                chars[j]=chars[j+1];
                chars[j+1]=temp;
            }
            }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        char[] chars=str.toCharArray();
        sortString(chars);
        System.out.print("Reversed: ");
        for(int i=0;i<chars.length;i++)
            System.out.print(chars[i]);
    }
}