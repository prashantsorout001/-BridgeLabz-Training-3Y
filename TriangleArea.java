import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle (in cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle (in cm): ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm * 0.155;
        System.out.println("The area is " + areaCm + " square cm and " + areaInch + " square inches.");
    }
}

