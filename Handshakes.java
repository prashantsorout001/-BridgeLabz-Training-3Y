import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int hs = (n * (n - 1)) / 2;
        System.out.println("The max number of handshakes is " + hs);
    }
}

