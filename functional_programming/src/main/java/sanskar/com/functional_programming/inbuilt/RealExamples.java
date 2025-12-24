package sanskar.com.functional_programming.inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {

    public static void main(String[] args) {
//        senerio : title and price ko ek particular formate generate krna hai
//        aur hume ye kaam kai baar krna hai to in this case we need to define a formatter
//        <title> costs $<price>
// here is two input type and one result type in this case we use BiFunction

        BiFunction<String , Double , String> formatter = (title, price) -> title + " cost$" + price;

        System.out.println(formatter.apply("javaBasics",599.499));
        System.out.println(formatter.apply("javaAdvance",999.499));

        BiConsumer<String , Double > formatterConsumer = (title, price) -> System.out.println(title + " cost$" + price);

        formatterConsumer.accept("javaBasics",599.499);
       formatterConsumer.accept("javaAdvance",999.499);

//       isExpensive
        Predicate<Double> isExpensive = price -> price > 500;
         System.out.println(isExpensive.test(900.4));

    }
}
