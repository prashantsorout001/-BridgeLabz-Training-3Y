import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter of square: ");
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length is " + side + " whose per. is " + perimeter);
    }
}

