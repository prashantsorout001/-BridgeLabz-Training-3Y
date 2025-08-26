import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter of square: ");
        int p = sc.nextInt();
        int s = p / 4;
        System.out.println("The length of the side is " + s + " whose perimeter is " + p);
    }
}

