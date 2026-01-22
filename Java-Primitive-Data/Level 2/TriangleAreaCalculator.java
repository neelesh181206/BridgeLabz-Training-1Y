import java.util.Scanner;


class TriangleAreaCalculator {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the base of the triangle (cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (cm): ");
        double height = input.nextDouble();

       
        double areaSqCm = 0.5 * base * height;

        
        double conversionFactor = 2.54 * 2.54;
        double areaSqIn = areaSqCm / conversionFactor;

        
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + 
                           " and sq cm is " + areaSqCm);

        input.close();
    }
}