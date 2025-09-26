class Novel {
    static String storeName = "National Book Store";
    private String bookName, writer;
    private final String uniqueId; // Final unique identifier

    // Constructor using 'this'
    public Novel(String bookName, String writer, String uniqueId) {
        this.bookName = bookName;
        this.writer = writer;
        this.uniqueId = uniqueId;
    }

    // Static method
    public static void displayStoreName() {
        System.out.println("Store Name: " + storeName);
    }

    // Display details with instanceof
    public void showDetails() {
        if (this instanceof Novel) {
            System.out.println("Book Name: " + bookName + ", Writer: " + writer + ", Unique ID: " + uniqueId);
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Novel n1 = new Novel("Learning Java", "James Gosling", "UID1234");
        n1.showDetails();
        Novel.displayStoreName();
    }
}
