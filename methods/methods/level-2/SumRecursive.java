import java.util.Scanner;

public class SumRecursive {

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int rec = sumRecursive(n);
        int formula = sumFormula(n);

        System.out.println("Recursive: " + rec);
        System.out.println("Formula: " + formula);
        System.out.println("Both Equal? " + (rec == formula));
    }
}