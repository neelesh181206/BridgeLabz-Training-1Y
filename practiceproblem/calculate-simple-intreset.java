import java.util.Scanner; 

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal amount enter karein: ");
        double principal = sc.nextDouble();

        System.out.print("Rate of interest enter karein: ");
        double rate = sc.nextDouble();

        System.out.print("Time (years mein) enter karein: ");
        double time = sc.nextDouble();


        double simpleInterest = (principal * rate * time) / 100;

        
        System.out.println("\n Calculation Result ");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + (principal + simpleInterest));
        
        sc.close(); 
    }
}