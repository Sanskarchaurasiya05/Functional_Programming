package sanskar.com.functional_programming.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateDemo {
    static Predicate<Book> p = book -> book.getPrice() > 30;
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

        // 1. Filter: Select books priced under $30
        Stream<Book> bk =  books.stream();
        Stream<Book> filterbk = bk.filter(p);
//        OR   Stream<Book> filterbk = bk.filter(b -> b.price > 30);
//
        System.out.println(filterbk.toList());

        // 2. Map: Transform book titles to uppercase
        Stream<String> bk1 = books.stream()
                .map(book -> book.title.toUpperCase());
        bk1.forEach(System.out::println);

       // 3. Sort: Arrange books by publication date
        Stream<Book> bk2 = books.stream()
                .sorted(Comparator.comparingInt(book -> Integer.parseInt(book.publicationYear)));
        bk2.forEach(System.out::println);


       // 4. Distinct: Eliminate duplicate book titles

        Stream<Book> bk3 = books.stream().distinct();
        bk3.forEach(System.out::println);


       // 5. Limit: Display only the first 3 books
        System.out.println("Display first 3 Pubblished book by publication year");
        Stream<Book> bk4 = books.stream()
                .sorted(Comparator.comparingInt(book -> Integer.parseInt(book.publicationYear)))
                .limit(3);
        bk4.forEach(System.out::println);


       // 6. Skip: Ignore the first 2 books
        System.out.println("Display after skipping books");
        Stream<Book> bk5 = books.stream()
                .sorted(Comparator.comparingInt(book -> Integer.parseInt(book.publicationYear)))
                .skip(2);
        bk5.forEach(System.out::println);


    }
}
