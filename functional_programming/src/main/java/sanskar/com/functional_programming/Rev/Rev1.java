package sanskar.com.functional_programming.Rev;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Rev1 {
    public static void main(String[] args) {
        String s = "aabbcde";

        Map<Character, Long> freq = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Character result = s.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> freq.get(ch) == 1)
                .findFirst()
                .orElse(null);

        System.out.println(result);

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> result1 = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result1);
    }
}
