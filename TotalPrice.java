import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        int up = sc.nextInt();
        System.out.print("Enter quantity: ");
        int qt = sc.nextInt();
        int tp = up * qt;
        System.out.println("price is INR " + tp +" if the quantity " + qt + " and unit price is INR " + up);
    }
}

