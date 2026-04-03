package problem1;

public class book extends libraryItem {

    private int numberOfPages;

    public book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() + " Pages: " + numberOfPages;
    }
}

