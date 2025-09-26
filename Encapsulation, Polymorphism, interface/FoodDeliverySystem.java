// Online Food Delivery System - student style
import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int qty;

    public FoodItem(String itemName, double price, int qty) {
        this.itemName = itemName; this.price = price; this.qty = qty;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }
    public void setQty(int q) { this.qty = q; }

    public void getItemDetails() {
        System.out.println("Item:" + itemName + " Price:" + price + " Qty:" + qty);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return getPrice()*getQty() - (getPrice()*getQty()*discount/100); }
    @Override public void applyDiscount(double percent) { this.discount = percent; }
    @Override public String getDiscountDetails() { return "Veg discount:" + discount + "%"; }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() {
        // extra non-veg charge 10%
        double base = getPrice()*getQty();
        return base + base*0.10 - base*discount/100;
    }
    @Override public void applyDiscount(double percent) { this.discount = percent; }
    @Override public String getDiscountDetails() { return "NonVeg discount:" + discount + "%"; }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 150, 2);
        FoodItem f2 = new NonVegItem("Chicken", 200, 1);

        ((Discountable)f1).applyDiscount(10);
        ((Discountable)f2).applyDiscount(5);

        FoodItem[] order = {f1, f2};
        double total = 0;
        for(FoodItem f: order) {
            f.getItemDetails();
            System.out.println(((Discountable)f).getDiscountDetails());
            System.out.println("Total for this item: " + f.calculateTotalPrice());
            total += f.calculateTotalPrice();
            System.out.println("----");
        }
        System.out.println("Order Total: " + total);
    }
}
