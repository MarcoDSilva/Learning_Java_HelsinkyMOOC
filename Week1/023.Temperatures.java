
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Boolean checker = true;

        System.out.println("If you want to stop the program, insert 42");
        while (checker) {
            System.out.print(("Insert a temperature in decimal form: "));
            double x = Double.parseDouble(reader.nextLine());

            if (x > -30.01 && x < 39.99) {
                Graph.addNumber(x);
            }

            if (x == 42.00) {
                checker = false;
            }
        }

        System.exit(0);
    }
}