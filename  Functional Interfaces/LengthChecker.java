import java.util.function.Function;

public class LengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> length = str -> str.length();

        System.out.println(length.apply("Hello World"));
    }
}