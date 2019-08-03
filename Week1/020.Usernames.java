
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //asks input from the user, username and pw
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();

        //compares the username and pw inserted
        if ((username.equals("alex") && password.equals("mightyducks"))
                || (username.equals("emily") && password.equals("cat"))) {
            System.out.println("Your are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
