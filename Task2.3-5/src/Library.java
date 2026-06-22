import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int number = 1;
        for (Book book : books) {
            System.out.println(number + ". Title: " + book.getBookTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getPublicationYear());
            number++;
        }
    }

    public void findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getBookTitle() + ", Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(String bookTitle) {
        for (Book book : books) {
            if (book.getBookTitle().equals(bookTitle)) {
                books.remove(book);
                break;
            }
        }
    }

    public void returnBook(Book book) {
        books.add(book);
    }

    public boolean isBookAvailable(String bookTitle) {
        for (Book book : books) {
            if (book.getBookTitle().equals(bookTitle)) {
                return true;
            }
        }
        return false;
    }
    public double getAverageBookRating() {
        double total = 0;
        for (Book book : books) {
            total += book.getRating();
        }
        return total / books.size();
    }
    public Book getMostReviewedBook() {
        Book result = null;
        int highest = 0;
        for (Book book : books) {
            if (book.getReviewCount() > highest) {
                highest = book.getReviewCount();
                result = book;
            }
        }
        return result;
    }
}