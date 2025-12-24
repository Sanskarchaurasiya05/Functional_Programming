package sanskar.com.functional_programming.inbuilt;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10)); // true

    }
}
