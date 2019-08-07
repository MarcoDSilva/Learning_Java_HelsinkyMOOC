
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 0, count = 0;
        // program your solution here. Do not touch the above lines!
        do {
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());

            if (numberDrawn == guess) {
                System.out.println("Congratulations, your guess is correct!");
            } else if (numberDrawn > guess) {
                count++;
                System.out.println("The number is greater, guesses made: " + count);

            } else {
                count++;
                System.out.println("The number is lesser, guesses made: " + count);

            }
        } while (guess != numberDrawn);

    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
