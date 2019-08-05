
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int y = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        for(int i = x; i <= y; i++)
        {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
