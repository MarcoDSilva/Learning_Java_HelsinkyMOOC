
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();
        Boolean runner = true;
        String word;
        do {
            System.out.print("Type a word: ");
            word = reader.nextLine();

            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                runner = false;
            }

            words.add(word);

        } while (runner);

    }
}