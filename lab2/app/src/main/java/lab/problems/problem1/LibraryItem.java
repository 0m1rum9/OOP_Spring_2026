package lab.problems.problem1;


/**
 * LibraryItem
 */
public abstract class LibraryItem {

    
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return String.format(
            "Title: %s, Author: %s, Publication year: %d",
            title, author, publicationYear
        );
    }
}
