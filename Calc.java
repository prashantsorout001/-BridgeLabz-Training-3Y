import java.util.Scanner;
public class Calc {    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;
        System.out.println("The value of 2 numbers " + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
}
