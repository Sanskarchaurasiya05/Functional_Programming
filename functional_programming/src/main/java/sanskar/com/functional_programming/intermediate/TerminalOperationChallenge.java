package sanskar.com.functional_programming.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationChallenge {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", "1925", 15.99, "Classic"),
                new Book("To Kill a Mockingbird", "1960", 12.50, "Classic"),
                new Book("1984", "1949", 18.00, "Dystopian"),
                new Book("The Hobbit", "1937", 20.99, "Fantasy"),
                new Book("A Brief History of Time", "1988", 25.00, "Science"),
                new Book("The Catcher in the Rye", "1951", 10.99, "Classic"),
                new Book("Sapiens", "2011", 22.50, "History"),
                new Book("The Alchemist", "1988", 14.25, "Fiction"),
                new Book("Clean Code", "2008", 45.00, "Technology"),
                new Book("Java Concurrency in Practice", "2006", 52.00, "Technology")
        );

         // Calculate the total cost of all books in the bookstore
        Stream<Book> bk1 = books.stream();
        Stream<Double> price = bk1.map(book->book.price);
//        price.forEach(System.out::println);
        double total = price.reduce(0.0,(acc,num)->acc+num);
        System.out.println(total);
        // Collect all book titles into a list
        List<String> bk2 = books.stream().map(book -> book.title).collect(Collectors.toList());
        bk2.forEach(System.out::println);

         // Group books based on their category
        System.out.println();
        Map<String,List<Book>> byCategory = books.stream()
//                .collect(Collectors.groupingBy(bookStringFunction)); OR
        .collect(Collectors.groupingBy(Book::getCategory));
        byCategory.forEach((category,bookList)->{
            bookList.forEach(System.out::println);
        });




    }

//    static Function<Book, String> bookStringFunction = new Function<Book, String>() {
//        @Override
//        public String apply(Book book) {
//            return book.getCategory();
//        }
//    };

}
