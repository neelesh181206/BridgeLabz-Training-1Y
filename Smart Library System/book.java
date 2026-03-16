class Book {

    int bookId;
    String title;
    double price;

    static String libraryName = "City Central Library";

    // Constructor
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Method to calculate fine (will be overridden)
    double calculateFine(int daysLate) {
        return 0;
    }

    void displayBook() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class TextBook extends Book {

    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Book {

    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

public class LibraryMain {

    public static void main(String[] args) {

        // Polymorphism using parent reference
        Book b1 = new TextBook(101, "Java Programming", 500);
        Book b2 = new Magazine(202, "Tech Monthly", 150);

        b1.displayBook();
        System.out.println("Fine: ₹" + b1.calculateFine(4));

        System.out.println();

        b2.displayBook();
        System.out.println("Fine: ₹" + b2.calculateFine(4));
    }
}