import java.util.Scanner;

public class Q10Overloading {
    static int add(int a,int b){
        return(a+b);
    }
    static double add(double a,double b){
        return(a+b);
    }
    static int multiply(int a,int b){
        return(a*b);
    }
    static double multiply(double a,double b){
        return(a*b);
    }
    static String concat(String a,String b){
        return(a+" "+b);
    }
    static String concat(String a,String b, String c){
        return(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont;
        do {
            System.out.println("1.Add 2 nos\n2.Add 2 double\n3.Multiply 2 int\n4.Multiply 2 float\n5.Concat 2 strings\n6.Concat 3 Strings");
            System.out.print("Enter your choice: ");
            char ch=sc.next().charAt(0);
            switch (ch) {
                case '1':
                    System.out.print("Enter 2 numbers: ");
                    int res1 = add(sc.nextInt(), sc.nextInt());
                    System.out.println("Res: " + res1);
                    break;
                case '2':
                    System.out.print("Enter 2 doubles: ");
                    double res2 = add(sc.nextDouble(), sc.nextDouble());
                    System.out.println("Res: " + res2);
                    break;
                case '3':
                    System.out.print("Enter 2 numbers: ");
                    int res3 = multiply(sc.nextInt(), sc.nextInt());
                    System.out.println("Res: " + res3);
                    break;
                case '4':
                    System.out.print("Enter 2 doubles: ");
                    double res4 = multiply(sc.nextDouble(), sc.nextDouble());
                    System.out.println("Res: " + res4);
                    break;
                case '5':
                    System.out.println("Enter 2 Strings: ");
                    sc.nextLine();
                    String str1=sc.nextLine();
                    String str2=sc.nextLine();
                    String res5 = concat(str1, str2);
                    System.out.println("Res: " + res5);
                    break;
                case '6':
                    System.out.println("Enter 3 Strings: ");
                    sc.nextLine();
                    str1=sc.nextLine();
                    str2=sc.nextLine();
                    String str3=sc.nextLine();
                    String res6 = concat(str1,str2,str3);
                    System.out.println("Res: " + res6);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
            System.out.print("Continue?(Y/N): ");
            cont = sc.next().charAt(0);
        }while(cont=='Y'||cont=='y');
    }
}
