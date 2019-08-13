
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    Random rnd = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created

        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int x;
        // Write the number drawing here using the method containsNumber()
        for (int i = 0; i < 7; i++) {
            x = rnd.nextInt(39) + 1;

            while (containsNumber(x)) {
                x = rnd.nextInt(39) + 1;
            }
            this.numbers.add(x);

        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
