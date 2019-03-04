
@FunctionalInterface
interface EmployeeInterface{
    Employee getDetails(String name, int age, String city);
}

class Employee{
    String name;
    int age;
    String city;
    Employee(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Employee{Name: "+name+", Age: "+age+", City: "+city+"}";
    }
}

public class Q4ConstructorReference {

    public static void main(String[] args) {
        EmployeeInterface employeeInterface= Employee::new;
        Employee employee=employeeInterface.getDetails("Shara",23,"Lucknow");
        System.out.println(employee);
    }
}
