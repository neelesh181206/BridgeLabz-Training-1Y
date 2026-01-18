import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Distance (Kilometers ) enter : ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;

   
        System.out.println(kilometers + " Kilometers = " + miles + " Miles");

        sc.close();
    }
}