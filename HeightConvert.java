import java.util.Scanner;
public class HeightConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        int cm = sc.nextInt();
        double inches = cm / 2.54; 
        int ft = (int)(inches / 12); 
        int in = (int)(inches % 12);  
        System.out.println("Height in cm is " + cm +" while in feet is " + ft +" and inches is " + in);
    }
}

