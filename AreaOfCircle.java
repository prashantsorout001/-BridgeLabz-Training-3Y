import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float radius = sc.nextFloat();
        Double AOC = 3.14 * radius * radius;
        System.out.println("Area of Circle " + AOC);
    }
}