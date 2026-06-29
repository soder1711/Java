import model.Book;
import model.LibraryMember;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming","John Smith", "2020");
        Book book2 = new Book("Data Structures and Algorithms","Jane Doe", "2018");
        Book book3 = new Book("The Art of Fiction","Alice Johnson", "2019");
        LibraryMember member = new LibraryMember("Quan", 1);
        member.borrow(book1);
        for (Book book : member.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
