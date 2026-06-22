import java.util.ArrayList;
public class Book {
    private String author;
    private String bookTitle;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews;
    public Book(String author, String bookTitle, int publicationYear) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
        rating = 0;
        reviews = new ArrayList<>();
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
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }
    public void addReview(String review) {
        reviews.add(review);
    }
}
