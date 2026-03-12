package lab.problems.problem1;

public class Book extends LibraryItem {
    private int numberOfPages;
    private final Knowledge knowledge;

    public Book(String title, String author, int year, int pages, Knowledge knowledge) {
        super(title, author, year);
        this.numberOfPages = pages;
        this.knowledge = knowledge;
    }

    public Knowledge read() {
        return knowledge;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(", Number of pages: %d", numberOfPages);
    }
}
