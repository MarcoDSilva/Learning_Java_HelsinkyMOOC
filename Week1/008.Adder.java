import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Sum of the numbers: " + (n1 + n2));
        
    }
}
