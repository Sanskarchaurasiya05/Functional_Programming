package sanskar.com.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class even {
    public static void main(String[] args) {
        List<Integer> even = Arrays.asList(3,4,5,6,2,8,8);

        even.stream().filter(e->e%2==0).distinct()
                .forEach(System.out::println);

        return ;
    }
}
