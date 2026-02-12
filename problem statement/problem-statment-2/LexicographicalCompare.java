import java.util.Scanner;

public class LexicographicalCompare {

    static int compare(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());

        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i) - s2.charAt(i);
        }

        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int result = compare(s1, s2);

        if (result < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (result > 0)
            System.out.println(s1 + " comes after " + s2);
        else
            System.out.println("Both are equal");

        sc.close();
    }
}
