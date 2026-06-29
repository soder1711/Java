package system;

import model.Book;
import model.LibraryMember;
import java.util.ArrayList;

public class Library {
    // List<Book> books
    // List<LibraryMember> members
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        // Add book to the library
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        // Add member to the library
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        if (books.contains(book)) {
            member.borrow(book);
            books.remove(book);
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
        member.returnBook(book);
        books.add(book);
    }
}