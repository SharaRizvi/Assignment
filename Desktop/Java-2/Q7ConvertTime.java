import java.util.Scanner;
public class Q7ConvertTime {
    public static double days(float second)
    {
        return second/(60*60*24);
    }
    public static double hours(float second)
    {
        return second/(60*60);
    }
    public static double minutes(float second)
    {
        return second/60;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float timeInsecond=55000;
        System.out.println("Seconds:"+timeInsecond);
        System.out.println("Seconds into Days:"+days(timeInsecond));
        System.out.println("Seconds into Hours:"+hours(timeInsecond));
        System.out.println("Seconds into Minutes:"+minutes(timeInsecond));
    }
}