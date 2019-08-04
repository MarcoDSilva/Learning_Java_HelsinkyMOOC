
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x;
        // Write your code here
        System.out.print("Up to what number? ");
        x = Integer.parseInt(reader.nextLine());

        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }

    }
}
