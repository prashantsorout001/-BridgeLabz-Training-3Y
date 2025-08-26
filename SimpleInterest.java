import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double P = sc.nextDouble();
        System.out.print("Enter Interest: ");
        double R = sc.nextDouble();
        System.out.print("Enter Time(in y): ");
        double T = sc.nextDouble();
        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest = " + SI);
        sc.close();
    }
}
