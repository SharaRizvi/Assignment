import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Employee{
    Integer age;
    Double salary;
    String name;

    Employee(Integer age, Double salary,String name){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }

    @Override
    public String toString() {
        return ("Employee{ Name: "+this.name+", age:"+this.age+", salary:"+this.salary+" }");
    }
}

public class Q4Comparator {
    public static void main(String[] str) {
        List<Employee> employees=new LinkedList<>();
        employees.add(new Employee(22,3.75,"Shara"));
        employees.add(new Employee(22,3.75,"Nargis Tarannum"));
        employees.add(new Employee(23,4.75,"Nargis Anjum"));
        System.out.println("++++++++Before custom sorting+++++++");
        for(Employee employee:employees) {
            System.out.println(employee);
        }
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -o1.salary.compareTo(o2.salary);
            }
        });
        System.out.println("\n++++++++After custom sorting+++++++");
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }
}
