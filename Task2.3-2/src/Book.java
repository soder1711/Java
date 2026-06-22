public class Book {
    private String author;
    private String bookTitle;
    private int publicationYear;
    public Book(String author, String bookTitle, int publicationYear) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
    }
    public String getAuthor() {
        return author;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
}
