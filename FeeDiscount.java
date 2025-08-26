import java.util.Scanner;
public class FeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        int fee = sc.nextInt();
        System.out.print("Enter Disc. Per.: ");
        int dp = sc.nextInt();
        int discount = (fee * dp) / 100;
        int finalFee = fee - discount;
        System.out.println("The disc. amount is INR " + discount +" and final disc. fee is INR " + finalFee);
    }
}


