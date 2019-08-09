
import java.util.ArrayList;

public class Variance {
   
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double x = list.size();
        double avg = sum(list) / x;
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        double total = 0;
        double avg = average(list);
        int howMany = list.size();
        for(Integer num: list){
            total += ((num - avg) * (num - avg));
        }
        
        total /= (howMany - 1);
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
