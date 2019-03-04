import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q12Stream4 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int num=integerList.stream().filter(e->e%2==0&&e>3).collect(Collectors.toList()).get(0);
        System.out.println("First even number greater than 3:-> "+num);
    }
}
