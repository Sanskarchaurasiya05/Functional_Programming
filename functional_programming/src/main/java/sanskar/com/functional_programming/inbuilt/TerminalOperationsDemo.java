package sanskar.com.functional_programming.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsDemo {
    public static void main(String[] args) {
//        reduce()
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        Stream<Integer> intStream = numbers.stream();
//        int sum = intStream.reduce(0,(acc,num)->acc+num);
//        int sum = intStream.reduce(0,Integer::sum);
//        System.out.println(sum);

        int total = numbers.stream().reduce(0,Integer::sum);
        System.out.println(total);

//        collect()
          List<Integer> even = numbers.stream()
                  .filter(n -> n%2==0)
                  .collect(Collectors.toList());
        System.out.println(even);


//        find & match

        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

      boolean hash40 =  numbers.stream()
                .anyMatch(n -> n==40);
        System.out.println(hash40);



//        iteration
           numbers.stream()
                   .forEach(n -> System.out.println(n));

    }
}
