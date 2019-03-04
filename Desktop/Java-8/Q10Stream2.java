import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q10Stream2 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum=0;
        Set<Integer> set=integerList.stream().filter(e->e>5).collect(Collectors.toSet());
        for (Integer i:
             set) {
            sum+=i;
        }
        System.out.println("Sum of all the numbers greater than 5 in the integer list: "+sum);
    }
}
