import java.util.Scanner;
public class Calculate_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int Average = (a+b+c)/3;
		System.out.print("The value of Average " + Average);


    } 
}
