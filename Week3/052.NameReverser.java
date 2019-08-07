
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        reverse(name);
    }

    public static void reverse(String name) {
        int size = name.length();
        String reversed = "";
        for (int i = size - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        System.out.println("In reverse order: " + reversed);
    }
}