import java.util.Scanner;


class SquareSideComputation {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        
        double perimeter;
        double side;

        
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        
        side = perimeter / 4;

        
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        
        input.close();
    }
}