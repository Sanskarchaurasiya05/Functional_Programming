package sanskar.com.functional_programming.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefernceDemo {
    public static void main(String[] args) {
//     Syntax    ::

        List<String> names = Arrays.asList("sanskar" , "krishna " ,"Ram" , "Sita");
        for(int i=0 ; i<names.size() ; i++){
            System.out.println(names.get(i));
        }

//        enhanced for loop
        for (String name : names){
            System.out.println(name);
        }

//        for each
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        names.forEach((String name) -> {
//            System.out.println(name);
//        });

//        names.forEach(( name) -> {
//            System.out.println(name);
//        });

//        names.forEach(( name) -> System.out.println(name));

        names.forEach(System.out::println);
    }
}
