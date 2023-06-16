package booktest;

import books.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Date;
import java.util.stream.Stream;

/**
 * La classe BookTest est une classe de test pour la classe Book.
 */
public class BookTest {

    /**
     * Fournit un flux de livres pour les tests paramétrés.
     *
     * @return Un flux de livres.
     */
    private static Stream<Book> bookProvider() {
        return Stream.of(
                new Book("Title 1", "Author 1", new Date()),
                new Book("Title 2", "Author 2", new Date()),
                new Book("Title 3", "Author 3", new Date())
        );
    }

    /**
     * Teste la méthode getTitle() de la classe Book.
     *
     * @param book Le livre utilisé pour le test.
     */
    @ParameterizedTest
    @MethodSource("bookProvider")
    public void testGetTitle(Book book) {
        Assertions.assertNotNull(book.getTitle());
    }

    /**
     * Teste la méthode getAuthor() de la classe Book.
     *
     * @param book Le livre utilisé pour le test.
     */
    @ParameterizedTest
    @MethodSource("bookProvider")
    public void testGetAuthor(Book book) {
        Assertions.assertNotNull(book.getAuthor());
    }

}
