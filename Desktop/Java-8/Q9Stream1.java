import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9Stream1 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integerList=integerList.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
