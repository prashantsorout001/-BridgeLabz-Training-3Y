import java.util.Scanner;
public class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int ft = sc.nextInt();
        double yd = ft / 3.0;
        double mi = yd / 1760.0;
        System.out.println("The distance is " + ft + " feet, " + yd + " yards, and " + mi + " miles.");
    }
}

