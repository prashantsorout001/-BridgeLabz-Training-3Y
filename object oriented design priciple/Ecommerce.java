
import java.util.*;

class Product {
    String pname;
    Product(String pname) {
        this.pname = pname;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;
    Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }
    public void addProduct(Product p) {
        products.add(p);
    }
    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        for(Product p : products) {
            System.out.println("Product: " + p.pname);
        }
    }
}

class CustomerE {
    String name;
    CustomerE(String name) {
        this.name = name;
    }
    public void placeOrder(Order o) {
        System.out.println(name + " placed order " + o.orderId);
        o.showOrder();
    }
}

public class Ecommerce {
    public static void main(String args[]) {
        CustomerE c1 = new CustomerE("Alice");
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");

        Order o1 = new Order(1001);
        o1.addProduct(p1);
        o1.addProduct(p2);

        c1.placeOrder(o1);
    }
}
