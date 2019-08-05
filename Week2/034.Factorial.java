import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        int fact = 1;
        
        for(int i = 1; i <= x; i++)
        {
            fact *= i;
        }
        System.out.println("Factorial is " + fact);
    }
}
