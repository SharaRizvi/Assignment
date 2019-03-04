import java.util.Scanner;

class MCAStudent{
    int id;
    String name;
    MCAStudent(int id, String name){
        this.id = id;
        this.name = name;
    }
    void getDetails(){
        System.out.println("MCAStudent{id: "+id+", name: "+name+"}");
    }
}
class MCAStudentProxy extends MCAStudent{
    protected String adminPassword="admin";
    MCAStudentProxy(int id, String name){
        super(id,name);
    }

    @Override
    void getDetails() {
        Scanner sc=new Scanner(System.in);
        System.out.print("To see student's detail, enter admin's password: ");
        if(sc.next().equals(adminPassword))
            super.getDetails();
        else {
            System.out.println("Invalid Password! Try again.");
            getDetails();
        }
    }
}
public class Q8Proxy {
    public static void main(String[] args) {
        System.out.println("Using MCAStudent Object-->");
        MCAStudent mcaStudent=new MCAStudent(110,"Shara");
        mcaStudent.getDetails();
        System.out.println("Using MCAStudentProxy Object-->");
        mcaStudent=new MCAStudentProxy(111,"Rizvi");
        mcaStudent.getDetails();
    }
}
