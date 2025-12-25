package sanskar.com.functional_programming.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import java.util.stream.Stream;

public class BookStoreChallenge {
    static Predicate<Book> p = (book) -> Integer.parseInt(book.getPublicationYear())<2000;
    public static void main(String[] args) {
        /*
1. Discounted Books:
   The bookstore is planning a sale.
   Identify and display all books priced above $20.

2. Classics Collection:
   The bookstore is launching a classics collection.
   Identify and display books published before the year 2000.

3. Upcoming Titles:
   Generate a list of future book titles for next year
   by appending the suffix "(Coming Soon)" to all existing titles.

4. Sort by Price:
   The bookstore wants to print price tags.
   Display all books sorted by price in ascending order.

5. Rare Books:
   The bookstore suspects some books may be rare.
   A rare book is defined as one whose title contains more than 20 characters.
   Identify and display such books.
*/

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
// 1.
        System.out.println("1. Identify all books that are priced over $20");
         books.stream().filter(book -> book.price>20).forEach(System.out::println);
        System.out.println();

//        2
        System.out.println("2.   Identify and display books published before the year 2000.");
        System.out.println();
        Stream<Book> bk1 = books.stream()
                .filter(p);
        bk1.forEach(System.out::println);

//        3.
        System.out.println();
        System.out.println("3.Generate a list of future book titles for next year\n" +
                "   by appending the suffix \"(Coming Soon)\" to all existing titles.\n");
        books.stream().map(book -> book.title + " (Comming Soon)").forEach(System.out::println);

//        4.
        System.out.println();
        System.out.println("4.Display all books sorted by price in ascending order.");
        Stream<Book> bk2 = books.stream()
                .sorted(Comparator.comparingInt(book -> (int) book.price));
        bk2.forEach(System.out::println);

//        5.
        System.out.println();
        System.out.println(" A rare book is defined as one whose title contains more than 20 characters.\n" +
                "   Identify and display such books.");
        books.stream().filter(book -> book.title.length()>20).forEach(System.out::println);


    }
}
