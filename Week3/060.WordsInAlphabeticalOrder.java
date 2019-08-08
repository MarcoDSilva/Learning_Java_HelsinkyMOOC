
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
         ArrayList<String> names = new ArrayList<String>();

        //inputs
        String name;
        Boolean runner = true;
        do {
            System.out.print("Type a word: ");
            name = reader.nextLine();

            if (!name.isEmpty()) {
                names.add(name);
            } else {
                runner = false;
                Collections.sort(names);
            }

        } while (runner);

        System.out.println("You typed the following words: ");
        for (String words : names) {
            System.out.println(words);
        }

    }
}

