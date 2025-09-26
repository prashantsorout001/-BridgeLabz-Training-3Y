// E-Commerce Platform - student style
import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double p) { this.price = p; }

    public void display() {
        System.out.println("ID:" + productId + " Name:" + name + " Price:" + price);
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice()*0.10; }
    @Override public double calculateTax() { return getPrice()*0.18; }
    @Override public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice()*0.15; }
    @Override public double calculateTax() { return getPrice()*0.05; }
    @Override public String getTaxDetails() { return "GST 5%"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice()*0.02; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Electronics(201, "Laptop", 50000);
        Product p2 = new Clothing(202, "Shirt", 1200);
        Product p3 = new Groceries(203, "Rice", 900);

        Product[] products = {p1, p2, p3};
        for(Product p: products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            p.display();
            if(p instanceof Taxable) System.out.println(((Taxable)p).getTaxDetails());
            System.out.println("Discount="+discount+" Tax="+tax+" Final="+finalPrice);
            System.out.println("----");
        }
    }
}
