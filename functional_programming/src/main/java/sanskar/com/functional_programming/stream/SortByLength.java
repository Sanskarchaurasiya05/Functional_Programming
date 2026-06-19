package sanskar.com.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("agfdffgf","dfgfhfgf","dergfds","fdsrthdfs");

        Map<Integer,List<String>> groupByLength = st.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);
    }
}
