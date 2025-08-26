import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        int unitPrice = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        int total = unitPrice * quantity;
        System.out.println("The total purchase price" + total +" if the quantity " + quantity + " and unit price" + unitPrice);
    }
}

