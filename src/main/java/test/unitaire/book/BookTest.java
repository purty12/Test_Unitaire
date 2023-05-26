package test.unitaire.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Date;

public class BookTest {
    @ParameterizedTest
    @CsvSource({
            "Title 1, Author 1, 2021-01-01",
            "Title 2, Author 2, 2022-02-02",
            "Title 3, Author 3, 2023-03-03"
    })
    public void testGetTitle(String title, String author, String publicationDate) {
        Date date = parsePublicationDate(publicationDate);
        Book book = new Book(title, author, date);
        Assertions.assertEquals(title, book.getTitle());
    }

    @ParameterizedTest
    @CsvSource({
            "Title 1, Author 1, 2021-01-01",
            "Title 2, Author 2, 2022-02-02",
            "Title 3, Author 3, 2023-03-03"
    })
    public void testGetAuthor(String title, String author, String publicationDate) {
        Date date = parsePublicationDate(publicationDate);
        Book book = new Book(title, author, date);
        Assertions.assertEquals(author, book.getAuthor());
    }

    private Date parsePublicationDate(String publicationDate) {
        // Méthode pour convertir la date de publication en objet Date
        // Implémentation spécifique à votre cas
        // Retourne la date parsée
        return null;
    }
}
