package sanskar.com.functional_programming.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
         Consumer<String> cons1 = System.out::println;

         Consumer<String> consumer2 = str -> System.out.println("Length: " + str.length());
         cons1.accept("sanskar");
         cons1.accept("krishna");

         consumer2.accept("hello");
         consumer2.accept("hi");

//         real world example
//        when need to process they does'nt return anything and want to print a result on console in this case we are using a consumer
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> multiplybyTwo = n -> System.out.println(n*2);
        number.forEach(multiplybyTwo);
    }
}
