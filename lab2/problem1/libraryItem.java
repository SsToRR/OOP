package problem1;

public abstract class libraryItem {

    private String title;
    private String author;
    private int publicationYear;

    public libraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
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
        return title + " by " + author + " (" + publicationYear + ")";
    }
}
