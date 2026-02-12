import java.util.Scanner;

public class ReplaceWord {

    static String replace(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();

        System.out.println(replace(sentence, oldWord, newWord));
        sc.close();
    }
}