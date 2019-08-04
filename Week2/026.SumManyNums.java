import java.util.Scanner;

public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int x;

        // do something here
        do {
            System.out.print("Sum now: ");
            x = Integer.parseInt(reader.nextLine());
            sum += x;
        } while (x != 0);
        System.out.println("Sum now: " + sum);

        System.out.println("Sum in the end: " + sum);
    }
}
