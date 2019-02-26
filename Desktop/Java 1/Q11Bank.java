import java.util.Scanner;

abstract class Bank{
    String name;
    long adharNo;
    double balance;
    Bank(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you name: ");
        name=sc.nextLine();
        System.out.print("Enter adhaar number: ");
        adharNo=sc.nextLong();
    }
}

class SBI extends Bank {
    static String bankName="SBI";
    static float rateofinterest=3;
    static float minAmount=0;
    SBI(){
        Scanner sc=new Scanner(System.in);
        boolean isbalAboveMinBal=false;
        System.out.print("Enter amount to open your account: ");
        do{
            long amt = sc.nextLong();
            if (amt >= minAmount) {
                balance = amt;
                isbalAboveMinBal=true;
            }
            else{
                System.out.print("Deposit amount >= minAmount("+minAmount+"): ");
            }
        }while (!isbalAboveMinBal);
        System.out.println("Account opened successfully.");
    }
    static void getDetails(){
        System.out.println("Bank's name: "+bankName);
        System.out.println("Rate of interest: "+rateofinterest+"%");
        System.out.println("Minimum amount: Rs."+minAmount);
    }
}

class BOI extends Bank{
    static String bankName="BOI";
    static float rateofinterest=5;
    static float minAmount=500;
    BOI(){
        Scanner sc=new Scanner(System.in);
        boolean isbalAboveMinBal=false;
        System.out.print("Enter amount to open your account: ");
        do{
            long amt = sc.nextLong();
            if (amt >= minAmount) {
                balance = amt;
                isbalAboveMinBal=true;
            }
            else{
                System.out.print("Deposit amount >= minAmount("+minAmount+"): ");
            }
        }while (!isbalAboveMinBal);
        System.out.println("Account opened successfully.");
    }
    static void getDetails(){
        System.out.println("Bank's name: "+bankName);
        System.out.println("Rate of interest: "+rateofinterest+"%");
        System.out.println("Minimum amount: Rs."+minAmount);
    }
}

class ICICI extends Bank{
    static String bankName="ICICI";
    static float rateofinterest=6;
    static float minAmount=1000;
    ICICI(){
        Scanner sc=new Scanner(System.in);
        boolean isbalAboveMinBal=false;
        System.out.print("Enter amount to open your account: ");
        do{
            long amt = sc.nextLong();
            if (amt >= minAmount) {
                balance = amt;
                isbalAboveMinBal=true;
            }
            else{
                System.out.print("Deposit amount >= minAmount("+minAmount+"): ");
            }
        }while (!isbalAboveMinBal);
        System.out.println("Account opened successfully.");
    }
    static void getDetails(){
        System.out.println("Bank's name: "+bankName);
        System.out.println("Rate of interest: "+rateofinterest+"%");
        System.out.println("Minimum amount: Rs."+minAmount);
    }
}

public class Q11Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont;
        do {
        System.out.print("Get Details of:\n1.SBI\t2.BOI\t3.ICICI\nEnter your choice: ");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case '1':
                SBI.getDetails();
                break;
            case '2':
                BOI.getDetails();
                break;
            case '3':
                ICICI.getDetails();
                break;
            default:
                System.out.println("Invalid option!");
        }
        System.out.println();
        System.out.print("Continue?(Y/N): ");
        cont = sc.next().charAt(0);
        }while(cont=='Y'||cont=='y');
        do {
        System.out.print("Open account in:\n1.SBI\t2.BOI\t3.ICICI\nEnter your choice: ");
        char ch=sc.next().charAt(0);
        switch (ch) {
              case '1':
                   SBI sbiAccount=new SBI();
                   break;
              case '2':
                  BOI boiAccount=new BOI();
                  break;
              case '3':
                  ICICI iciciAccount=new ICICI();
                  break;
              default:
                  System.out.println("Invalid option!");
        }
        System.out.println();
        System.out.print("Continue?(Y/N): ");
        cont = sc.next().charAt(0);
        }while(cont=='Y'||cont=='y');
    }
}
