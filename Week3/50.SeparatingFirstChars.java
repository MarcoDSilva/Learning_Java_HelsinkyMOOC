
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int size = name.length();
        char letter;

        if (size > 3) {
            for (int i = 0; i < 3; i++) {
                letter = name.charAt(i);
                System.out.println((i + 1) + ". character: " + letter);
            }
        }
    }
}
