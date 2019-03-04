import java.util.Scanner;

interface Student{
    void setId(int id);
    void setName(String name);
    void setAge(int age);
    void setGender(Gender gender);
    void setStandard(short std);
    void setGrade(char grade);
    void setRank(short rank);
}

enum Gender{Male, Female, Other}

class JMIStudent implements Student{
    long id;
    String name;
    int age;
    Gender gender;
    short std;
    char grade;
    short rank;

    @Override
    public void setId(int id) {
        this.id=id;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setStandard(short std) {
        this.std=std;
    }

    @Override
    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public void setRank(short rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "JMIStudent{ Id: "+id+", Name: "+name+", Age: "+age+", Gender: "+gender+", Standard: "+std+", Grade: "+grade+", Rank:"+rank+" }";
    }
}

interface StudentBuilder{
    void buildId();
    void buildName();
    void buildAge();
    void buildGender();
    void buildStandard();
    void buildGrade();
    void buildRank();
}

class JMIStudentBuilder implements StudentBuilder{
    private JMIStudent jmiStudent;
    private static int count=0;

    JMIStudentBuilder(){
        jmiStudent=new JMIStudent();
    }

    @Override
    public void buildId() {
        jmiStudent.setId(++count);
    }

    @Override
    public void buildName() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        jmiStudent.setName(sc.nextLine());
    }

    @Override
    public void buildAge() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age: ");
        jmiStudent.setAge(sc.nextInt());
    }

    @Override
    public void buildGender() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Gender(1. Male 2.Female 3.Other): ");
        char ch=sc.next().charAt(0);
        switch (ch){
            case '1':
                jmiStudent.setGender(Gender.Male);
                break;
            case '2':
                jmiStudent.setGender(Gender.Female);
                break;
            case '3':
                jmiStudent.setGender(Gender.Other);
                break;
        }
    }

    @Override
    public void buildStandard() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Standard(1-12): ");
        jmiStudent.setStandard(sc.nextShort());
    }

    @Override
    public void buildGrade() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Grade(E-A): ");
        jmiStudent.setGrade(sc.next().charAt(0));
    }

    @Override
    public void buildRank() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rank: ");
        jmiStudent.setRank(sc.nextShort());
    }

    void constructJMIStudent(){
        buildId();buildName();buildAge();buildGender();buildStandard();buildGrade();buildRank();
    }

    JMIStudent getJmiStudent(){
        constructJMIStudent();
        return jmiStudent;
    }
}

public class Q4Builder {
    public static void main(String[] args) {
        JMIStudentBuilder jmiStudentBuilder=new JMIStudentBuilder();
        JMIStudent jmiStudent=jmiStudentBuilder.getJmiStudent();
        System.out.println("\n"+jmiStudent);
    }
}
