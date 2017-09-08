package pe.marloncordova.demoactivitylifecycle.entities;

import com.orm.SugarRecord;

/**
 * Created by Marlon Cordova on 8/09/2017.
 */

public class Book extends SugarRecord {

    private String isbn;
    private String title;
    private String edition;

    // Default constructor is necessary for SugarRecord
    public Book() {

    }

    public Book(String isbn, String title, String edition) {
        this.setIsbn(isbn);
        this.setTitle(title);
        this.setEdition(edition);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
