import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Implement your program here

        //first user
        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());

        //second user
        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        
        System.out.println(firstName + " and " + secondName + " are " + 
                (firstAge + secondAge) + " years old in total.");
    }
}