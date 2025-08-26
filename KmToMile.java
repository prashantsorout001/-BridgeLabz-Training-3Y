import java.util.Scanner;
public class KmToMile{
    public static void main(String[] args) {
        double km, miles;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter d in km: ");
        km = sc.nextInt(); 
        miles = km / 1.6;  
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}


