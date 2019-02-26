import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Student implements Comparable<Student>{
    Integer age;
    Double grade;
    String name;

    Student(Integer age, Double grade,String name){
        this.age=age;
        this.grade=grade;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.grade>o.grade) {
            System.out.println("if");
            return 1;
        }
        else if(this.grade<o.grade){
            System.out.println("else");
            return -1;
        }

        else{
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return ("Student{ Name: "+this.name+", age:"+this.age+", grade:"+this.grade+" }");
    }
}

public class Q5SortStudents {
    public static void main(String[] str) {
        List<Student> students=new LinkedList<>();
        students.add(new Student(22,8.75,"Shara"));
        students.add(new Student(22,9.75,"Nargis Tarannum"));
        students.add(new Student(22,9.75,"Isha"));
        students.add(new Student(23,4.75,"Nargis Anjum"));
        System.out.println("++++++++Inserted in the order+++++++");
        for(Student student:students) {
            System.out.println(student);
        }
        Collections.sort(students);
        System.out.println("\n++++++++Auto sorting of class on Grades(Highest First) and then on Name(ascending)+++++++");
        for(Student student:students) {
            System.out.println(student);
        }
    }
}

