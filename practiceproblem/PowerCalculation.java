import java.util.Scanner;
import java.lang.Math; // Math library power functions ke liye

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("enter the base: ");
        double base = sc.nextDouble();

        System.out.print("enter the exponent : ");
        double exponent = sc.nextDouble();

       
        double result = Math.pow(base, exponent);

        
        System.out.println("\nResult: " + base + " raised to the power of " + exponent + " is " + result);

        sc.close();
    }
}