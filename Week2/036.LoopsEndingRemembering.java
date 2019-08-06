
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Boolean checker = true;
        int x = 0, sum = 0, num_counter = 0, odd_num = 0, even_num = 0;
        double average = 0;
        System.out.println("Type numbers:");
        do {

            x = Integer.parseInt(reader.nextLine());

            if (x == -1) {
                checker = false;
            } else {
                sum += x;
                num_counter++;
                
                //odd and even number verifier
                if (x % 2 == 0) {
                    even_num++;
                } else {
                    odd_num++;
                }
            }
        } while (checker);

        average = sum / (double) num_counter;

        //print outs
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + num_counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even_num);
        System.out.println("Odd numbers: " + odd_num);
    }
}
