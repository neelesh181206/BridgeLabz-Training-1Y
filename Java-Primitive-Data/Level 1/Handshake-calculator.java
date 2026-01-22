import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the number of students (N): ");
        int n = input.nextInt();
        
        
        int maxHandshakes = (n * (n - 1)) / 2;
        
        
        System.out.println("For " + n + " students, the maximum number of handshakes is: " + maxHandshakes);
        
        input.close();
    }
}