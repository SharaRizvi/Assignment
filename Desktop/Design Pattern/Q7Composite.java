import java.util.ArrayList;
import java.util.List;

interface Employee{
    void showEmployeeDetails();
}

enum Competency{AMC, JVM, iOS, Android}

class AMCEmployee implements Employee{
    String name;
    Integer employeeId;
    static Competency competency=Competency.AMC;
    AMCEmployee(String name, Integer employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: "+name+", EmployeeId: "+employeeId+", Competency: "+competency);
    }
}

class JVMEmployee implements Employee{
    String name;
    Integer employeeId;
    static Competency competency=Competency.JVM;
    JVMEmployee(String name, Integer employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: "+name+", EmployeeId: "+employeeId+", Competency: "+competency);
    }
}

class IOSEmployee implements Employee{
    String name;
    Integer employeeId;
    static Competency competency=Competency.iOS;
    IOSEmployee(String name, Integer employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: "+name+", EmployeeId: "+employeeId+", Competency: "+competency);
    }
}

class AndroidEmployee implements Employee{
    String name;
    Integer employeeId;
    static Competency competency=Competency.Android;
    AndroidEmployee(String name, Integer employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: "+name+", EmployeeId: "+employeeId+", Competency: "+competency);
    }
}

public class Q7Composite {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new AMCEmployee("Shara",101));
        employees.add(new JVMEmployee("Fatama",101));
        employees.add(new IOSEmployee("Rizvi",101));
        employees.add(new AndroidEmployee("Zahra",101));
        for (Employee employee:employees){
            employee.showEmployeeDetails();
        }
    }
}
