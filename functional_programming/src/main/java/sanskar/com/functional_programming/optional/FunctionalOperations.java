package sanskar.com.functional_programming.optional;

import java.util.Optional;

public class FunctionalOperations {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("java");
        Optional<String>nullOptional = Optional.ofNullable(null);
//        ifPresent() ---> it checks optionals contains a value are not if present then do something
        name.ifPresent(value->{
            System.out.println(value);
            System.out.println("hey");
        });

//        map() ---> it return a value but it return a option whcih wrapped a string
//        used for transformation
        Optional<String> upperCase = name.map(value -> value.toUpperCase());
        System.out.println(upperCase.orElse("default"));

//        filter() --> it also return a optional
        Optional<String> temp = name.filter(n->n.startsWith("java"));
        temp.ifPresent(System.out::println);

//        combined Operation
        name.filter(n->n.startsWith("j"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);


    }
}
