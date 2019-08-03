
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        Boolean asker = true;
        // Write your code here
        while (asker) {
            System.out.print("Type the password: ");
            String userPassword = reader.nextLine();

            if (userPassword.equals(password)) {
                System.out.println("Right!");
                asker = false;
                
                System.out.println("\nThe secret is: Carrots are good!");
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
