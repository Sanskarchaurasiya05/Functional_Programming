package sanskar.com.functional_programming.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple","bananana","cherry","diary","elpse");
//        for(String fruit : items){
//            System.out.println(fruit);
//        }

        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);

//        only once you can use stream and the next time you need to create a another stream

        System.out.println("filtered character");
        Stream<String> stream1 = items.stream();
        Stream<String> filteredStream =
                stream1.filter(name -> name.startsWith("b"));
        filteredStream.forEach(System.out::println);


    }
}
