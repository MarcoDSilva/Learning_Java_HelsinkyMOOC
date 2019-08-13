
import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    Random rnd = new Random();
    private int lenght;

    public PasswordRandomizer(int length) {
        this.lenght = length;
    }

    public String createPassword() {
        String symbol = "abcdefghijklmnopqrstuvwxyz";
        String pass = "";
        int pick = 0;
        for (int i = 0; i < this.lenght; i++) {

            pick = rnd.nextInt(25);

            pass += symbol.charAt(pick);
        }
        return pass;
    }
}
