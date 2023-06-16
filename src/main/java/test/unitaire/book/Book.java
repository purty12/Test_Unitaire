package test.unitaire.book;

import java.util.Date;

/**
 * La classe Book représente un livre avec un titre, un auteur et une date de publication.
 */
public class Book {
    private String title; // Le titre du livre.
    private String author; // L'auteur du livre.
    private Date publicationDate; // La date de publication du livre.

    /**
     * Constructeur de la classe Book.
     *
     * @param title           Le titre du livre.
     * @param author          L'auteur du livre.
     * @param publicationDate La date de publication du livre.
     */
    public Book(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    /**
     * Retourne le titre du livre.
     *
     * @return Le titre du livre.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retourne l'auteur du livre.
     *
     * @return L'auteur du livre.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Retourne la date de publication du livre.
     *
     * @return La date de publication du livre.
     */
    public Date getPublicationDate() {
        return publicationDate;
    }
}
