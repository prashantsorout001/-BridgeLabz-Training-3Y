

import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for(Book b : books) {
            b.display();
        }
    }
}

public class LibraryBooks {
    public static void main(String args[]) {
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python 101", "Guido");

        Library l1 = new Library("City Library");
        Library l2 = new Library("College Library");

        l1.addBook(b1);
        l1.addBook(b2);

        l2.addBook(b1);

        l1.showBooks();
        l2.showBooks();
    }
}
