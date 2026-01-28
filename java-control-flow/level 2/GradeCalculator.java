import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks = " + average);

        if (average >= 90)
            System.out.println("Grade: A | Remark: Excellent");
        else if (average >= 75)
            System.out.println("Grade: B | Remark: Very Good");
        else if (average >= 60)
            System.out.println("Grade: C | Remark: Good");
        else if (average >= 40)
            System.out.println("Grade: D | Remark: Pass");
        else
            System.out.println("Grade: F | Remark: Fail");
    }
}