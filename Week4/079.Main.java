
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        int x = 0;

        do {
            System.out.println("Type numbers:");
            x = Integer.parseInt(reader.nextLine());

            if (x != -1) {
                stats.addNumber(x);
                if (x % 2 == 0) {
                    even.addNumber(x);
                }

                if (x % 2 != 0) {
                    odd.addNumber(x);
                }
            }

        } while (x != -1);

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
