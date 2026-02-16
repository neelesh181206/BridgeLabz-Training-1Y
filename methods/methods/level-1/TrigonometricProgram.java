import java.util.Scanner;

public class TrigonometricProgram {

    public static void calculateTrig(double degree) {
        double radians = Math.toRadians(degree);

        System.out.println("Sin: " + Math.sin(radians));
        System.out.println("Cos: " + Math.cos(radians));
        System.out.println("Tan: " + Math.tan(radians));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double degree = sc.nextDouble();

        calculateTrig(degree);
    }
}
