import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q11Stream3 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Average after doubling: "+integerList.stream().collect(Collectors.averagingInt(x->x*2)));
    }
}
