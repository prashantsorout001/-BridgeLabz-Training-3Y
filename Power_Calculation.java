import java.util.Scanner;

public class Power_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		int power = base*exponent;
		System.out.print("The value of Power " + power);

    }   
    
    
}
