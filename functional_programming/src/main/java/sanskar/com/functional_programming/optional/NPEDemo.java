package sanskar.com.functional_programming.optional;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {
        String name = "sanska" ;
//        traditional
       if(name!=null){
           System.out.println(name.length());
       }else{
           System.out.println("no name value");
       }

//       Optional
        Optional<String> optionalString = Optional.of("java");
        System.out.println(optionalString);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

//        checking values
        System.out.println(optionalString.isPresent());
        System.out.println(mayBe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(mayBe.isEmpty());

//        retrieve  --> get()

        System.out.println(optionalString.get());
//        when value null it gives error
//        System.out.println(mayBe.get());  // not use so much

//        so how to retrieve data from optional in safe manner
//        1 . orElse("default-value") ---> if optional contain value it return the value otherwise it return default value
        System.out.println(optionalString.orElse("default"));
        System.out.println(mayBe.orElse("default"));

//        2.orElseGet(<supplier>) if supplier execute a method or lmbda fxn if the value is null
        String result = mayBe.orElseGet(()->{
            System.out.println("Generating default value");
            return "default";
        });

//        3.orElseThrow() ---> if value is present return it otherwise throw exception
        String newResult = mayBe.orElseThrow(
                ()->new RuntimeException("Not Found")
        );
        System.out.println(newResult);





    }
}
