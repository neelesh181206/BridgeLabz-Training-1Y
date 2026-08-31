import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=================================");
            System.out.println("      BRIDGELABZ JAVA SOLUTIONS   ");
            System.out.println("=================================");
            System.out.println("ASSISTED PROBLEMS:");
            System.out.println(" 1. Welcome to Bridgelabz");
            System.out.println(" 2. Add Two Numbers");
            System.out.println(" 3. Celsius to Fahrenheit Conversion");
            System.out.println(" 4. Area of a Circle");
            System.out.println(" 5. Volume of a Cylinder");
            System.out.println("\nSELF PROBLEMS:");
            System.out.println(" 6. Calculate Simple Interest");
            System.out.println(" 7. Perimeter of a Rectangle");
            System.out.println(" 8. Power Calculation");
            System.out.println(" 9. Calculate Average of Three Numbers");
            System.out.println("10. Convert Kilometers to Miles");
            System.out.println(" 0. Exit");
            System.out.print("\nSelect a problem to run (0-10): ");
            
            int choice = scanner.nextInt();
            System.out.println("---------------------------------");
            
            switch (choice) {
                case 1 -> WelcomeBridgelabz.main(null);
                case 2 -> AddTwoNumbers.main(null);
                case 3 -> CelsiusToFahrenheit.main(null);
                case 4 -> AreaOfCircle.main(null);
                case 5 -> VolumeOfCylinder.main(null);
                case 6 -> SimpleInterest.main(null);
                case 7 -> PerimeterOfRectangle.main(null);
                case 8 -> PowerCalculation.main(null);
                case 9 -> AverageOfThreeNumbers.main(null);
                case 10 -> KilometersToMiles.main(null);
                case 0 -> {
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a number between 0 and 10.");
            }
        }
    }
}
