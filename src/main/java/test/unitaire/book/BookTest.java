package test.unitaire.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Date;
import java.util.stream.Stream;

public class BookTest {
    private static Stream<Book> bookProvider() {
        return Stream.of(
                new Book("Title 1", "Author 1", new Date()),
                new Book("Title 2", "Author 2", new Date()),
                new Book("Title 3", "Author 3", new Date())
        );
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    public void testGetTitle(Book book) {
        Assertions.assertEquals(book.getTitle(), "Title 1");
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    public void testGetAuthor(Book book) {
        Assertions.assertEquals(book.getAuthor(), "Author 1");
    }

}
