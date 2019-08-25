
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        String choice = "";

        do {
            System.out.print("? ");
            choice = bird.choice();

            if (choice.equals("Add")) {
                bird.add();
            } else if (choice.equals("Observation")) {
                bird.observation();
            } else if (choice.equals("Statistics")) {
                bird.statistics();
            } else if (choice.equals("Show")) {
                bird.show();
            }
        } while (!choice.equals("Quit"));
    }
}

