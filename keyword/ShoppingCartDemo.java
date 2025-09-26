class ShoppingCart {
    static double offerDiscount = 10.0; // Shared by all items
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private final int itemCode; // Unique and final

    public ShoppingCart(String itemName, double itemPrice, int itemQuantity, int itemCode) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemCode = itemCode;
    }

    public static void changeDiscount(double newDiscount) {
        offerDiscount = newDiscount;
    }

    public void showDetails() {
        if (this instanceof ShoppingCart) {
            System.out.println("Item: " + itemName + ", Price: " + itemPrice + ", Quantity: " + itemQuantity + ", Code: " + itemCode + ", Discount: " + offerDiscount + "%");
        }
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart c1 = new ShoppingCart("Laptop", 50000, 1, 301);
        ShoppingCart c2 = new ShoppingCart("Mouse", 1000, 2, 302);

        c1.showDetails();
        c2.showDetails();

        ShoppingCart.changeDiscount(15);
        c1.showDetails();
    }
}
