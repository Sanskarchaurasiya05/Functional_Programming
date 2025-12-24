package sanskar.com.functional_programming.inbuilt;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static BiFunction<Integer , Integer ,Integer> addFunction = (a, b) -> a + b;
//    public static BiFunction<Integer , Integer ,Integer> addFunction = Integer::sum;
    public static void main(String[] args) {
        System.out.println(addFunction.apply(10,20));


    }
}
