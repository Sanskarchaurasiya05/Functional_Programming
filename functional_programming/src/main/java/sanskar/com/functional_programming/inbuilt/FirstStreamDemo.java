package sanskar.com.functional_programming.inbuilt;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStreamDemo {
    public static void main(String[] args) {
// lets extract even number from list usig stream
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        iteration 1
        Stream<Integer>stream1 = l.stream();
        Stream<Integer> filteredStream = stream1.filter(p);
       List<Integer> evennumber  = filteredStream.toList();
       System.out.println("even numbers " + evennumber);

//  iteration 2
        List<Integer> evenList = l.stream()
                .filter(p)
                .collect(Collectors.toList());

        System.out.println(evenList);

    }

    static Predicate<Integer> p = (n) -> n%2==0;
}
