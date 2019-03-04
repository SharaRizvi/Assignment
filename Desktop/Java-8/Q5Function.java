import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;

public class Q5Function {
    public static void main(String[] args) {
        Consumer<Integer> consumer=a-> System.out.println("Consumed: "+a);
        consumer.accept(20);

        Supplier<Integer> supplier=()->0;
        System.out.println("supplier.get(): "+supplier.get());

        Predicate<Integer> predicate=(a)->
        {return (a>0)?true:false;};
        System.out.println("10>0?: "+predicate.test(10));

        Function<String,Integer> function=(s)->s.length();
        System.out.println("Length of word Teacher is: "+function.apply("Teacher"));
    }
}
