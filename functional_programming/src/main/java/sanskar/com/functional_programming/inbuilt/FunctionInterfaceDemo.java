package sanskar.com.functional_programming.inbuilt;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInterfaceDemo {

    public static Function<Integer , Integer> addFunction = (a) -> a+3;
    public static Supplier<Integer> randomSupplier = () -> new Random().nextInt(100000000);
     public static Function<Integer,Integer> subFunction = (a) -> a-2;

//     chaining
    public static Function<Integer , Integer> CombineFunction = addFunction.andThen(subFunction);

    public static void main(String[] args) {
        System.out.println(addFunction.apply(10));
        System.out.println(subFunction.apply(5));
        System.out.println(randomSupplier.get());

        System.out.println(CombineFunction.apply(80>));
    }
}
