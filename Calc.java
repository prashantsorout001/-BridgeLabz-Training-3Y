import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.print("Enter first number: ");
        n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        n2 = sc.nextDouble();
        System.out.println(" value of 2 numbers "+ n1 + " and " + n2 + " is " + (n1+n2) + ", " + (n1-n2) + ", " + (n1*n2) + ", and " + (n1/n2));
    }
}

