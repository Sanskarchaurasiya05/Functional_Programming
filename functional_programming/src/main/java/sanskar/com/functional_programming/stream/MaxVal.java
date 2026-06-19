package sanskar.com.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxVal {
    public static void main(String[] args) {

        List<Integer> value = Arrays.asList(1,999999,3,4,5,6,7,8,9);

        Optional<Integer> max = value.stream().max(Integer::compareTo);
        System.out.println(max);
    }
}
