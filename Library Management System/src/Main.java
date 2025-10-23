import java.util.*;

class Book {
    private String title;
    private boolean isIssued;

    public Book(String title) {
        this.title = title;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return title + (isIssued ? " (Issued)" : " (Available)");
    }
}

class User {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public String getName() {
        return name;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issue();
                user.borrowBook(book);
                System.out.println("Book '" + title + "' issued to " + user.getName());
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                user.returnBook(book);
                System.out.println("Book '" + title + "' returned by " + user.getName());
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void showBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Java Basics"));
        library.addBook(new Book("Python for Beginners"));
        library.addBook(new Book("Data Structures"));

        System.out.println("User is :-");
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        User user1 = new User(user);

        User user1 = new User("Vargav");

        library.showBooks();
        library.issueBook("Java Basics", user1);
        library.showBooks();

        library.returnBook("Java Basics", user1);
        library.showBooks();
    }
}
