
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {

        Boolean checker = true;
        String reversed = "";
        int size = text.length();

        for (int i = size - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return text.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
