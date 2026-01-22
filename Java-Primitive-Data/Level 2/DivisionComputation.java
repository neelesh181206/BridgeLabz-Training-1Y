import java.util.Scanner;


class DivisionComputation {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the first number (dividend): ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int number2 = input.nextInt();

        
        int quotient = number1 / number2;
        int reminder = number1 % number2;

         
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + 
                           " of two number " + number1 + " and " + number2);

       
        input.close();
    }
}