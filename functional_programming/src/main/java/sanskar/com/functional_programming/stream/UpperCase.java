package sanskar.com.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        java.util.List<String> upper = Arrays.asList("abcd","afgrgh","fjbnfjkbf");

        List<String> res = upper.stream().map(n->n.toUpperCase()).collect(Collectors.toList());

        System.out.println(res);
    }
}
