// Library Management System - student style
import java.util.*;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean available = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId; this.title = title; this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean a) { this.available = a; }

    public void getItemDetails() {
        System.out.println("ID:"+itemId+" Title:"+title+" Author:"+author+" Avail:"+available);
    }

    public abstract int getLoanDuration(); // days
}

interface Reservable {
    boolean reserveItem(String borrower);
    boolean checkAvailability();
}

class BookItem extends LibraryItem implements Reservable {
    public BookItem(int id, String title, String author) { super(id,title,author); }
    @Override public int getLoanDuration() { return 14; }
    @Override public boolean reserveItem(String borrower) {
        if(isAvailable()) { setAvailable(false); return true; } return false;
    }
    @Override public boolean checkAvailability() { return isAvailable(); }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int id, String title, String author) { super(id,title,author); }
    @Override public int getLoanDuration() { return 7; }
    @Override public boolean reserveItem(String borrower) {
        if(isAvailable()) { setAvailable(false); return true; } return false;
    }
    @Override public boolean checkAvailability() { return isAvailable(); }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) { super(id,title,author); }
    @Override public int getLoanDuration() { return 3; }
    @Override public boolean reserveItem(String borrower) {
        if(isAvailable()) { setAvailable(false); return true; } return false;
    }
    @Override public boolean checkAvailability() { return isAvailable(); }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new BookItem(301, "Java Book", "James"),
            new Magazine(302, "Science Mag", "Editor"),
            new DVD(303, "Movie DVD", "Director")
        };

        for(LibraryItem it: items) {
            it.getItemDetails();
            System.out.println("Loan days:" + it.getLoanDuration());
            if(it instanceof Reservable) {
                Reservable r = (Reservable)it;
                System.out.println("Available now: " + r.checkAvailability());
                System.out.println("Reserving: " + r.reserveItem("Aditya"));
                System.out.println("Available after reserve: " + r.checkAvailability());
            }
            System.out.println("----");
        }
    }
}
