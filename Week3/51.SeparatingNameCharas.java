
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        nameSeparation(name);
    }
    
    public static void nameSeparation(String name){
        int size = name.length();
        
        for(int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
        }
    }
}
