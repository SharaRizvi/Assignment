class   PersonDetails{
    static String firstName="Shara";
    static String secondName="Rizvi";
    static int age=23;
    static {
        System.out.println("Printing from Static Block(invoked on first object creation):");
        System.out.println("FirstName: "+firstName);
        System.out.println("SecondName: "+secondName);
        System.out.println("Age: "+age);
    }
    static void printDetails(){
        System.out.println("Printing from Static function:");
        System.out.println("FirstName: "+firstName);
        System.out.println("SecondName: "+secondName);
        System.out.println("Age: "+age);
    }
}

public class Q7Static {
    public static void main(String[] args) {
        PersonDetails person1=new PersonDetails();//Static block is invoked
        System.out.println();
        PersonDetails.printDetails();//Static method is invoked
        System.out.println();
        System.out.println("Printing with the help of static variables: ");
        System.out.println("FirstName: "+PersonDetails.firstName);//using static variables
        System.out.println("SecondName: "+PersonDetails.secondName);
        System.out.println("Age: "+PersonDetails.age);
    }
}
