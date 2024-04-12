import java.util.Scanner;

public class char_matching {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = s.next();

        if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a constant.");
        }

    }
}