import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double r1 = a + b * c;
        double r2 = a * b + c;
        double r3 = c + a / b;
        double r4 = a % b + c;

        System.out.println("The results of Double Operations are " + r1 + ", " + r2 + ", " + r3 + ", and " + r4);
    }
}

