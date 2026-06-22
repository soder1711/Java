public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("John Smith", "Introduction to Java Programming", 2020);
        Book book2 = new Book("Jane Doe", "Data Structures and Algorithms", 2018);
        Book book3 = new Book("Alice Johnson", "The Art of Fiction", 2019);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayBooks();
        System.out.println("Books by Jane Doe:");
        library.findBookByAuthor("Jane Doe");
    }
}
