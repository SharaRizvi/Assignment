import java.util.Scanner;

public class Q8firstAndLastChar {
    static void stringMatchUsingDoWhile(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Keep entering words until done-->");
        String string=new String();
        do{
            if(!string.isEmpty()){
                if(string.charAt(0)==string.charAt(string.length()-1)){
                    System.out.println("First and last character are same.");
                }
                else {
                    System.out.println("first and last character are different.");
                }
            }
            string = sc.nextLine();
        }while(!string.equals("done")&&!string.equals("Done")&&!string.equals("DONE"));
    }
    static void stringMatchUsingWhile(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Keep entering words until done-->");
        String string=sc.nextLine();
        while(!string.equals("done")&&!string.equals("Done")&&!string.equals("DONE")){
            if(!string.isEmpty()){
                if(string.charAt(0)==string.charAt(string.length()-1)){
                    System.out.println("First and last character are same.");
                }
                else {
                    System.out.println("first and last character are different.");
                }
            }
            string = sc.nextLine();
        }
    }
    public static void main(String[] args) {
        System.out.println("Calling stringMatchUsingDoWhile()-->\n");
        stringMatchUsingDoWhile();
        System.out.println("\n\nCalling stringMatchUsingWhile()-->\n");
        stringMatchUsingWhile();
    }
}
