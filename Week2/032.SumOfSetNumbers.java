
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int x = Integer.parseInt(reader.nextLine());
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum += i;
        }

        System.out.println("Sum is " + sum);
    }
}
