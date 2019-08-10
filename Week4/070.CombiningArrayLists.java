
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        
        for(Integer element: second) {
            first.add(element);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        
        Collections.addAll(list2, 5, 10, 7);
       
        System.out.println(list1);
        System.out.println(list2);

    }
}
