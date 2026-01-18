import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("enter the third number : ");
        double num3 = sc.nextDouble();

       
        double average = (num1 + num2 + num3) / 3;

       
        System.out.println("\n average: " + average);

        sc.close();
    }
}